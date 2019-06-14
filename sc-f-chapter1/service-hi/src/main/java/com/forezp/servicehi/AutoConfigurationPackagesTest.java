package com.forezp.servicehi;

import com.forezp.servicehi.bean.DependencyBean;
import com.forezp.servicehi.bean.MyBean;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@EnableAutoConfiguration
public class AutoConfigurationPackagesTest {

    @Bean
    public DependencyBean dependencyBean(){
        return new DependencyBean();
    }

    @Bean
    @ConditionalOnBean(DependencyBean.class)
    public MyBean myBean () {
        return new MyBean();
    }


    public static void main (String[] args) {
        SpringApplication app =
                new SpringApplication(AutoConfigurationPackagesTest.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.setLogStartupInfo(false);
        ConfigurableApplicationContext c = app.run(args);
        List<String> packages = AutoConfigurationPackages.get(c);
        System.out.println("packages: "+packages);
    }
}

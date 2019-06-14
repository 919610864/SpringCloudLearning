package com.forezp.servicehi.app;

import com.forezp.servicehi.bean.MyPrototypeBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@Component("com.forezp.servicehi.bean")
public class AppConfig {

    public static void main(String... strings) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Spring container started and is ready");
        MyPrototypeBean bean = context.getBean(MyPrototypeBean.class);
        bean.doSomething();
    }
}

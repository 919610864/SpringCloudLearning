package com.forezp.servicehi.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ServiceImplB implements MyService{


    @PostConstruct
    private void init() {
        System.out.println("initializing lazily " +
                this.getClass().getSimpleName());
    }

    @Override
    public String getMessage() {
        return "Message from " + getClass().getSimpleName();
    }
}

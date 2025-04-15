package com.example.todo_api.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean

    public MyBean myBean(){

        return new MyBean(new MySubBean());
    }
}

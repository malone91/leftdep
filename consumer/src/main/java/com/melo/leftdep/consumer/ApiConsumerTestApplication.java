package com.melo.leftdep.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@Configurable
@SpringBootApplication
public class ApiConsumerTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiConsumerTestApplication.class, args);
    }
}

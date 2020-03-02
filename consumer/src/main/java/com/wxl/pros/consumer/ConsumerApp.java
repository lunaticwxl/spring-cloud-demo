package com.wxl.pros.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@EnableAutoConfiguration
@Configuration
@EnableFeignClients
public class ConsumerApp extends SpringBootServletInitializer {

    public static void main(String[] args){
          SpringApplication.run(ConsumerApp.class, args);
    }
}

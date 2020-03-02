package com.wxl.pros.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
@ComponentScan
@EnableEurekaServer
public class EurekaApp extends SpringBootServletInitializer {

    public static void main(String[] args){
        SpringApplication.run(EurekaApp.class,args);
    }
}

package com.wxl.pros.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@EnableAutoConfiguration
@Configuration
@EnableDiscoveryClient
public class ProviderWithEurekaApp extends SpringBootServletInitializer {
    
    public static void main(String[] args){
          SpringApplication.run(ProviderWithEurekaApp.class, args);
    }
}
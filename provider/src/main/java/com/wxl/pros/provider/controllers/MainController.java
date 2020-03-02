package com.wxl.pros.provider.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/provider")
public class MainController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/get")
    public String get(){
        return new Random().nextInt(1000)+":"+serverPort;
    }

    @RequestMapping("/hello")
    public String index(){
        return "index";
    }
}

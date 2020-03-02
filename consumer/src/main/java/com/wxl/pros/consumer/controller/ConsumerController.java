package com.wxl.pros.consumer.controller;

import com.wxl.pros.consumer.feigns.CustomerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private CustomerFeignClient customerFeignClient;

    @RequestMapping("/get")
    public String get(){
        return customerFeignClient.get();
    }
}

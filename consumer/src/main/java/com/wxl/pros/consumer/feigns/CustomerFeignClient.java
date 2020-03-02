package com.wxl.pros.consumer.feigns;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("provider")
public interface CustomerFeignClient {

    @RequestMapping("/provider/get")
    public String get();
}

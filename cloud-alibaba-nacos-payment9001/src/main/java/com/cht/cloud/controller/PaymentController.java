package com.cht.cloud.controller;

import com.cht.cloud.common.CommonResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/getPort")
    public CommonResponse getPort(){
        return new CommonResponse(200,"成功"+port,port);
    }
}

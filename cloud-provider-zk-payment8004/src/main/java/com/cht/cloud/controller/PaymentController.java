package com.cht.cloud.controller;

import com.cht.cloud.common.CommonResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zk/payment")
public class PaymentController {

    @Value("${server.port}")
    private int serverPort;

    @GetMapping("/get")
    public CommonResponse get(){
        System.out.println("============================="+serverPort);
        return new CommonResponse(200,"成功",serverPort);
    }
}

package com.cht.cloud.controller;

import com.cht.cloud.common.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order/zk")
public class OrderController {

    public static final String PAYMENT_ZK_URL="http://payment-zk-8004/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public CommonResponse get(){
        System.out.println("----------------------------------");
        return restTemplate.getForObject(PAYMENT_ZK_URL+"/zk/payment/get",CommonResponse.class);
    }

}

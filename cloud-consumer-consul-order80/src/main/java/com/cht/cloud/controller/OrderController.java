package com.cht.cloud.controller;

import com.cht.cloud.common.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer/consul")
public class OrderController {

    private static final String CONSUL_PAYMENT_URL="http://provider-consul-payment8006";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/get")
    public CommonResponse test(){
           return restTemplate.getForObject(CONSUL_PAYMENT_URL+"/payment/consul/test",CommonResponse.class);
    }
}

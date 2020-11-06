package com.cht.cloud.controller;

import com.cht.cloud.common.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service.url}")
    private String url;

    @GetMapping("/getPort")
    public CommonResponse getPort() {
        return restTemplate.getForObject(url + "/payment/getPort", CommonResponse.class);
    }

}

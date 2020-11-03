package com.cht.cloud.controller;

import com.cht.cloud.common.CommonResponse;
import com.cht.cloud.common.Const;
import com.cht.cloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private DiscoveryClient client;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public CommonResponse getById(@PathVariable Long id){
        return restTemplate.getForObject(Const.PAYMENT_PROVIDER_URL+"/payment/"+id,CommonResponse.class);
    }

    @GetMapping("/create")
    public CommonResponse create(Payment payment){
        return restTemplate.postForObject(Const.PAYMENT_PROVIDER_URL+"/payment/save",payment,CommonResponse.class);
    }

    @GetMapping("/discover")
    public CommonResponse discover(@RequestParam String serviceName){
        List<String> services = client.getServices();
        services.forEach(System.out::println);
        List<ServiceInstance> instances = client.getInstances(serviceName);
        return new CommonResponse(200,"查询成功",instances);
    }
}

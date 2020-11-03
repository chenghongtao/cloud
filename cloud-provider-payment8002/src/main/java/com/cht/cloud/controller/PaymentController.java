package com.cht.cloud.controller;

import com.cht.cloud.common.CommonResponse;
import com.cht.cloud.entities.Payment;
import com.cht.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private int port;

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/{id}")
    public CommonResponse getPaymentById(@PathVariable Long id) {
        Payment payment = paymentService.getPaymentById(id);
        return payment == null ? new CommonResponse(444, "没有查询到数据,port:"+port, null) : new CommonResponse(200, "查询成功,port:"+port, payment);
    }

    @PostMapping("/save")
    public CommonResponse create(@RequestBody Payment payment) {
        int i = paymentService.create(payment);
        return i > 0 ? new CommonResponse(200, "插入成功", i) : new CommonResponse(444, "插入失败", null);
    }
}

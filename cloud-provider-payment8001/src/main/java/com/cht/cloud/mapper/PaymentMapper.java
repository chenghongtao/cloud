package com.cht.cloud.mapper;

import com.cht.cloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentMapper {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}

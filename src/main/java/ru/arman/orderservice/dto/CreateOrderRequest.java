package ru.arman.orderservice.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateOrderRequest {
    private Long userId;
    private BigDecimal amount;
}

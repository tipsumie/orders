package com.example.demo.model;

import lombok.Data;

@Data
public class OrderResponse {
    private String status;
    private String message;
    private String transactionId;
}

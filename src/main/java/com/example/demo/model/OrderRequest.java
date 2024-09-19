package com.example.demo.model;

import lombok.Data;

@Data
public class OrderRequest {
    private String accountNumber;
    private double amount;
    private String currency;
}

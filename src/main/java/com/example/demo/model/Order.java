package com.example.demo.model;

import lombok.Data;

@Data
public class Order {
    private String accountNumber;
    private double amount;
    private String currency;
}

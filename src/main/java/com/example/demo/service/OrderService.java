package com.example.demo.service;

import com.example.demo.model.OrderRequest;
import com.example.demo.model.OrderResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    public OrderResponse processPayment(OrderRequest paymentRequest) {
        // Process the payment (mocked logic here)
        OrderResponse response = new OrderResponse();
        response.setStatus("SUCCESS");
        response.setMessage("Payment processed successfully.");
        response.setTransactionId(UUID.randomUUID().toString());
        
        return response;
    }
}

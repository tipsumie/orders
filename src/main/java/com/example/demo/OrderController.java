package com.example.demo;

import com.example.demo.model.PaymentRequest;
import com.example.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/submit")
    public String submitOrder(@RequestBody PaymentRequest paymentRequest) {
        paymentService.submitOrder(paymentRequest);
        return "Order submitted successfully.";
    }
}

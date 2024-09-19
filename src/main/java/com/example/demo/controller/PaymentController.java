package com.example.demo.controller;

import com.example.demo.constants.Constants;
import com.example.demo.model.OrderRequest;
import com.example.demo.model.OrderResponse;
import com.example.demo.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Slf4j
public class PaymentController {

    private final OrderService orderService;

    public PaymentController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/submit")
    public ResponseEntity<OrderResponse> submitPayment(@RequestBody OrderRequest orderRequest,
                                                       @RequestHeader(value = Constants.CORRELATION_ID, required = false) String correlationId) {

        log.info("Received payment request: {}", orderRequest);

        // Process the payment
        OrderResponse paymentResponse = orderService.processPayment(orderRequest);

        log.info("Payment response: {}", paymentResponse);

        return ResponseEntity.ok(paymentResponse);
    }
}

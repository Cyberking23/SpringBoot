package org.example.springbootstart;

import org.springframework.boot.SpringApplication;

public class StoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(StoreApplication.class, args);
        var orderService = new OrderService(new PayPalPaymentService());
        orderService.placeOrder();
    }

}

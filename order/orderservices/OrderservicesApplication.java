package com.example.order.orderservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.order")
@EnableFeignClients("com.example.order")
public class OrderservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderservicesApplication.class, args);
	}

}

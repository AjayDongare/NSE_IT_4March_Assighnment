package com.example.order.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.order.model.CustomerDto;

public interface OrderFeignProxy
{

@FeignClient (name="orders-service", url="http://localhost:8082/")
public interface PostFeignProxy
{

@GetMapping("orders/cid/{cid}")
public List<CustomerDto> findOrderByPid(@PathVariable int cid);

}

}

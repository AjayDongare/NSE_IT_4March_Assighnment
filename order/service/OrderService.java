package com.example.order.service;

import java.util.List;

import com.example.order.model.Order;

public interface OrderService {

	public String insertOrder(Order orders);
    public List<Order> displayAllOrder();
    public String deleteOrder(int oid);
    public List<Order> searchOrderByPname(String orders);
	public List<Order> searchOrderByOrderId(int cid);
	
}

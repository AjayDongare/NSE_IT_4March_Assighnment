package com.example.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.order.model.Order;
import com.example.order.repo.OrderRepo;

public class OrderServiceImpl implements OrderService
{
	@Autowired
	OrderRepo repo;

	@Override
	public String insertOrder(Order orders) {
		
		repo.save(orders);
		return "Order Added";
	}

	@Override
	public List<Order> displayAllOrder() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String deleteOrder(int oid) {
		// TODO Auto-generated method stub
		repo.deleteById(oid);
		return "Order Deleted";
	}

	

	@Override
	public List<Order> searchOrderByOrderId(int cid) {
		// TODO Auto-generated method stub
		return repo.searchCustomerByOrderId(cid);
	}

	@Override
	public List<Order> searchOrderByPname(String orders) {
		// TODO Auto-generated method stub
		return searchOrderByPname(orders);
	}

}

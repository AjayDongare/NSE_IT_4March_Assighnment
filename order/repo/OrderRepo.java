package com.example.order.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.order.model.Order;



public interface OrderRepo extends JpaRepository<Order,Integer>
{

	@Query("select o from Order o where o.orders=?1")
	public List<Order> searchCustomerByCustomer(String customer);
	
	@Query("select o from Order o where o.oid=?1")
	public List<Order> searchCustomerByOrderId(int oid);

	

}

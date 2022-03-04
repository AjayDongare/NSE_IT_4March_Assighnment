package com.example.customer.service;

import java.util.List;

import com.example.customer.model.Customer;

public interface CustomerService
{

	
	public String insertCustomer(Customer customer);
    public List<Customer> displayAllCustomer();
    public String deleteCustomer(int cid);
    public List<Customer> searchCustomerByCustomerId(String customer);
	public List<Customer> searchCustomerByOrderId(int oid);
	 


}

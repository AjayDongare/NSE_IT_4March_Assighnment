package com.example.order.model;

public class Order 
{
	int oid;
	String pname;
	String price;
	public Order()
	{
		
	}
	
	public Order(int oid, String pname, String price)
	{
		super();
		this.oid = oid;
		this.pname = pname;
		this.price = price;
	}
	public int getOid() 
	{
		return oid;
	}
	public void setOid(int oid)
	{
		this.oid = oid;
	}
	public String getPname()
	{
		return pname;
	}
	public void setPname(String pname) 
	{
		this.pname = pname;
	}
	public String getPrice()
	{
		return price;
	}
	public void setPrice(String price)
	{
		this.price = price;
	}
	

}

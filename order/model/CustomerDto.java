package com.example.order.model;

public class CustomerDto 
{
	int cid;
	String cname;
	String caddress;
	public CustomerDto()
	{
		
	}
	
	public CustomerDto(int cid, String cname, String caddress) 
	{
		super();
		this.cid = cid;
		this.cname = cname;
		this.caddress = caddress;
	}
	public int getCid() 
	{
		return cid;
	}
	public void setCid(int cid)
	{
		this.cid = cid;
	}
	public String getCname() 
	{
		return cname;
	}
	public void setCname(String cname)
	{
		this.cname = cname;
	}
	public String getCaddress()
	{
		return caddress;
	}
	public void setCaddress(String caddress)
	{
		this.caddress = caddress;
	}
	


}

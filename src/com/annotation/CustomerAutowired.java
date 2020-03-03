package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.data.Address;
@Component
public class CustomerAutowired
{
	@Value(value = "1")
	private int id;
	@Value(value = "Customer Autowired")
	private String name;
	@Autowired
	@Qualifier(value="address")
	private Address address;
	public CustomerAutowired()
	{
		this.id=1;
		this.name="name1";
	}
	public CustomerAutowired(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Address getAddress()
	{
		return address;
	}
	public void setAddress(Address address)
	{
		this.address = address;
	}
	@Override
	public String toString()
	{
		return "CustomerAutowired [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public void print()
	{
		System.out.println(toString());
	}
	
}

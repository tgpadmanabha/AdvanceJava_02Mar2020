package com.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer
{
	@Value(value = "10")
	private int id;
	@Value(value = "Customer")
	private String name;
	public Customer()
	{
		this.id=1;
		this.name="name1";
	}
	public Customer(int id, String name)
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
	@Override
	public String toString()
	{
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	public void print()
	{
		System.out.println(toString());
	}
	
}

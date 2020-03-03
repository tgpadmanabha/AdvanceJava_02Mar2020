package com.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class DemoCustomInit implements InitializingBean,DisposableBean
{
	private String name;
	private String message;
	
	public DemoCustomInit()
	{
		super();
		this.name="Padmanabha";
		this.message="Default Constructor";
		System.out.println("Default Constructor Invoked");
		System.out.println(this);
	}
	public DemoCustomInit(String name, String message)
	{
		super();
		this.name = name;
		this.message = message;
		System.out.println("Parameterized Constructor Invoked");
	}
	public void customInit()
	{
		this.name = "";
		this.message = "In Custom Init";
		System.out.println("Custom Init Invoked");
		System.out.println(this);
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getMessage()
	{
		return message;
	}
	public void setMessage(String message)
	{
		this.message = message;
		System.out.println("Setter invoked message set");
		System.out.println(this);
	}
	@Override
	public String toString()
	{
		return "DemoCustomInit [name=" + name + ", message=" + message + "]";
	}
	@Override
	public void afterPropertiesSet() throws Exception{
		this.message="In After Properties Set";
		System.out.println("After Properties Set Invoked");
		System.out.println(this);
	}
	@Override	
	public void destroy() throws Exception {
		name=message=null;
		System.out.println("Destructor invoked Disposable Bean");
	}
	public void destroy1() {
		name=message=null;
		System.out.println("Destructor invoked");
	}
}

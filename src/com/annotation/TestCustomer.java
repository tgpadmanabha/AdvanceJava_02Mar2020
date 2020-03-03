package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestCustomer
{
	
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beansannotation.xml");
		Customer customer=(Customer)context.getBean("customer");
		System.out.println(customer);
		CustomerAutowired customerAutowired=(CustomerAutowired)context.getBean("customerAutowired");
		System.out.println(customerAutowired);
	}
	
}

package com.data;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAddress
{
	
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Company company=(Company)context.getBean("company");
		System.out.println(company);
		Company company1=(Company)context.getBean("company1");
		System.out.println(company1);
		Company companyNested=(Company)context.getBean("companyNested");
		System.out.println(companyNested);
	}
	
}

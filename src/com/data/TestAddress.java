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
		Company companyWir=(Company)context.getBean("companyWir");
		System.out.println(companyWir);
		System.out.println(companyWir.getAddress().getCityName());
		Company companyWir1=(Company)context.getBean("companyWir1");
		System.out.println(companyWir1);
		System.out.println(companyWir1.getAddress().getCityName());
	}
	
}

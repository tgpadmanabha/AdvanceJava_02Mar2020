package com.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomInit
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beanslifecycle.xml");
		System.out.println("------------*** Main Default*** -----------");
		DemoCustomInit obj=(DemoCustomInit)context.getBean("beanLifeCycle");
		System.out.println(obj);	
		System.out.println("------------*** Main Parameterized*** -----------");
		DemoCustomInit obj1=(DemoCustomInit)context.getBean("beanLifeCycle1");
		System.out.println(obj1);	
		((AbstractApplicationContext)context).registerShutdownHook();
	}
}

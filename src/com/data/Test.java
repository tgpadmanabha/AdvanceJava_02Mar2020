package com.data;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Data obj=(Data)context.getBean("obj");
		obj.print();
		Data obj1=(Data)context.getBean("obj_const");
		obj1.print();
		Data obj2=(Data)context.getBean("obj2");
		obj2.print();
	}
	
}

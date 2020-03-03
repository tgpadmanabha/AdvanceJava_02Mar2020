package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLibraby
{
	
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("collection.xml");
		System.out.println("------------*** List *** -----------");
		LibraryList obj=(LibraryList)context.getBean("libraryList");
		obj.displayBooks();
		System.out.println("------------*** Set *** -----------");
		LibrarySet obj1=(LibrarySet)context.getBean("librarySet");
		obj1.displayBooks();
		System.out.println("------------*** Map *** -----------");
		LibraryMap obj2=(LibraryMap)context.getBean("libraryMap");
		obj2.displayBooks();
		System.out.println("------------*** List1 *** -----------");
		LibraryList obj3=(LibraryList)context.getBean("libraryList1");
		obj3.displayBooks();
	}
	
}

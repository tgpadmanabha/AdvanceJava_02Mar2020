package com.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBookDAOSupport
{
	
	public static void main(String[] args)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("connection.xml");
		BookDAO bookDAO=(BookDAO)ctx.getBean("bookDAO");
		System.out.println(bookDAO.addBook(new Book(123456L,"Java Handbook1","Java Publication",1000L))>0?"Book inserted successfully":"Sorry! cannot add book");
		System.out.println(bookDAO.addBook(new Book(1234567L,"Java Handbook2","Java Publication",1000L))>0?"Book inserted successfully":"Sorry! cannot add book");
		System.out.println(bookDAO.addBook(new Book(12345678L,"Java Handbook3","Java Publication",1000L))>0?"Book inserted successfully":"Sorry! cannot add book");
		System.out.println(bookDAO.addBook(new Book(123456789L,"Java Handbook4","Java Publication",1000L))>0?"Book inserted successfully":"Sorry! cannot add book");
		System.out.println(bookDAO.updateBook(123456L,"Java Publication4")>0?"Book updated successfully":"Sorry! cannot update book");
		System.out.println(bookDAO.deleteBook(123456L)?"Book deleted successfully":"Sorry! cannot delete book");
	}
	
}

package com.jdbc;

public class Book
{
	private long isbn;
	private String bookName;
	private String publication;
	private long price;
	@Override
	public String toString()
	{
		return "Book [isbn=" + isbn + ", bookName=" + bookName + ", publication=" + publication + ", price=" + price + "]";
	}
	public Book(long isbn, String bookName, String publication, long price)
	{
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.publication = publication;
		this.price = price;
	}
	public Book()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIsbn()
	{
		return isbn;
	}
	public void setIsbn(long isbn)
	{
		this.isbn = isbn;
	}
	public String getBookName()
	{
		return bookName;
	}
	public void setBookName(String bookName)
	{
		this.bookName = bookName;
	}
	public String getPublication()
	{
		return publication;
	}
	public void setPublication(String publication)
	{
		this.publication = publication;
	}
	public long getPrice()
	{
		return price;
	}
	public void setPrice(long price)
	{
		this.price = price;
	}
}

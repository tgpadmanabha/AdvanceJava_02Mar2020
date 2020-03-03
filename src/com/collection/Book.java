package com.collection;

public class Book
{
	private String isbn;
	private String bookName;
	private String publication;
	private int price;
	@Override
	public String toString()
	{
		return "Book [isbn=" + isbn + ", bookName=" + bookName + ", publication=" + publication + ", price=" + price + "]";
	}
	public Book(String isbn, String bookName, String publication, int price)
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
	public String getIsbn()
	{
		return isbn;
	}
	public void setIsbn(String isbn)
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
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
}

package com.jdbc;

public interface BookDAO
{
	public int addBook(Book book);
	
	public int updateBook(long isbn, String publication);
	
	public boolean deleteBook(long isbn);
	
}

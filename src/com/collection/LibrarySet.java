package com.collection;

import java.util.Set;

public class LibrarySet
{
	private Set<Book> books;

	public Set<Book> getBooks()
	{
		return books;
	}

	public void setBooks(Set<Book> books)
	{
		this.books = books;
	}
	public void displayBooks() {
		for(Book b:books) System.out.println(b);
		books.forEach((b)->  System.out.println(b));
		books.forEach(System.out::println);
	}
}

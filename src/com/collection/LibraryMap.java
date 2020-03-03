package com.collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LibraryMap
{
	private Map<String,Book> books;

	public Map<String,Book> getBooks()
	{
		return books;
	}

	public void setBooks(Map<String,Book> books)
	{
		this.books = books;
	}
	public void displayBooks() {
		Set<Entry<String,Book>> entries=books.entrySet();
		for(Entry<String,Book> b:entries) System.out.println(b.getValue());
		entries.forEach((b)->  System.out.println(b.getValue()));
		entries.forEach(System.out::println);
	}
}

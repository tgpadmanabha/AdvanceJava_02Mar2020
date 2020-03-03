package com.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value="bookDAO")
public class BookDAODdbcTemplate implements BookDAO
{
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int addBook(Book book)
	{
		String INSERT_BOOK="insert into book values(?,?,?,?)";
		return jdbcTemplate.update(INSERT_BOOK,book.getIsbn(),book.getBookName(),book.getPublication(),book.getPrice());
	}

	@Override
	public int updateBook(long isbn, String publication)
	{
		String UPDATE_BOOK="update book set publication=? where isbn=?";
		return jdbcTemplate.update(UPDATE_BOOK,publication,isbn);
	}

	@Override
	public boolean deleteBook(long isbn)
	{
		String DELETE_BOOK="delete from book where isbn=?";
		return jdbcTemplate.update(DELETE_BOOK,isbn)>0?true:false;
	}
	
	
}

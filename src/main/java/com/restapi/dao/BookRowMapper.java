package com.restapi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.restapi.model.Book;

public class BookRowMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {

		Book b = new Book();
		b.setAuthor(rs.getString("author"));
		b.setIsbn(rs.getString("isbn"));
		b.setGenre(rs.getString("genre"));
		b.setPages(rs.getString("pages"));
		b.setPrice(rs.getString("price"));
		b.setPublishedDate(rs.getString("published_date"));
		b.setPublisher(rs.getString("publisher"));
		b.setTitle(rs.getString("title"));;
		return b;
	}

}

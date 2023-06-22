package com.restapi.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.restapi.config.QueryWrapper;
import com.restapi.model.Book;

@Repository
public class RestDaoImpl implements RestDao {

	@Autowired
	QueryWrapper query;

	@Autowired
	NamedParameterJdbcTemplate jdbc;

	@Override
	public List<Book> findAllBooks() {
		// need to fix lombok to add query
		return jdbc.query("", new BookRowMapper());

	}

	@Override
	public Optional<Book> findBookByIsbn(String isbn) {
		//SqlParameterSource sqlMap = new Map
		return Optional.empty();
	}

}

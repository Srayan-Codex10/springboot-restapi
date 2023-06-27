package com.restapi.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.restapi.config.QueryWrapper;
import com.restapi.model.Book;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class RestDaoImpl implements RestDao {

	QueryWrapper query;

	NamedParameterJdbcTemplate jdbc;

	@Autowired
	RestDaoImpl(QueryWrapper wrapper, NamedParameterJdbcTemplate jdbcTemplate) {
		this.query = wrapper;
		this.jdbc = jdbcTemplate;
	}

	@Override
	public List<Book> findAllBooks() {
		return jdbc.query(query.getBooks(), new BookRowMapper());
	}

	@Override
	public Optional<Book> findBookByIsbn(String isbn) {
		SqlParameterSource sqlMap = new MapSqlParameterSource().addValue("isbn", isbn);
		log.info(query.getBookByIsbn());
		return Optional.ofNullable(jdbc.queryForObject(query.getBookByIsbn(), sqlMap, Book.class));
	}

}

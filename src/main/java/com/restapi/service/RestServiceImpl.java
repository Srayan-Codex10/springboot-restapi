package com.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.dao.RestDao;
import com.restapi.model.Book;

@Service
public class RestServiceImpl implements IRestService {

	RestDao dao;

	@Autowired
	public RestServiceImpl(RestDao db) {
		this.dao = db;
	}

	@Override
	public List<Book> findAll() {
		return dao.findAllBooks();
	}

	@Override
	public Book findById(String id) {
		return dao.findBookByIsbn(id).get();
	}

}

package com.restapi.service;

import java.util.List;

import com.restapi.model.Book;

public interface IRestService {

	List<Book> findAll();

	Book findById(String id);
}

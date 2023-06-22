package com.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.dao.RestDao;
import com.restapi.model.Book;

@RestController
@RequestMapping("/api/v1")
public class ApiController {

	RestDao restDao;

	@Autowired
	ApiController(RestDao dbDao) {
		this.restDao = dbDao;
	}

	@GetMapping("/books")
	public List<Book> getAllBooks() {

		return restDao.findAllBooks();

	}

	@GetMapping("/books/{isbn}")
	public Book getBookByIsbn(@PathVariable(value = "isbn") String isbn) {
		// dao method call

		return restDao.findBookByIsbn(isbn).get();
	}

}

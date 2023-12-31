package com.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.Book;
import com.restapi.service.IRestService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/v1")
@Slf4j
public class ApiController {

	IRestService apiService;

	@Autowired
	ApiController(IRestService serv) {
		this.apiService = serv;
	}

	@GetMapping("/ping")
	public ResponseEntity<String> ping() {
		return ResponseEntity.ok("Ping success");
	}

	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks() {
		return ResponseEntity.ok(apiService.findAll());
	}

	@GetMapping("/books/{isbn}")
	public ResponseEntity<Book> getBookByIsbn(@PathVariable(value = "isbn") String isbn) {
		log.info(isbn);
		return ResponseEntity.ok(apiService.findById(isbn));
	}

}

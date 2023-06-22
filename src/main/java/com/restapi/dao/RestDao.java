package com.restapi.dao;

import java.util.List;
import java.util.Optional;

import com.restapi.model.Book;

public interface RestDao {

	List<Book> findAllBooks();

	Optional<Book> findBookByIsbn(String isbn);
}

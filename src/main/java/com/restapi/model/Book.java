package com.restapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Book {

	private String isbn;
	private String author;
	private String title;
	private String publishedDate;
	private String publisher;
	private String pages;
	private String price;
	private String genre;
}

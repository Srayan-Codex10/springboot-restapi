package com.restapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Getter;

@Configuration
@PropertySource("classpath:query.properties")
@Getter
public class QueryWrapper {

	@Value("${getbooks}")
	private String books;

	@Value("${getbooksbypages}")
	private String booksByPages;

	@Value("${getbookbyisbn}")
	private String bookByIsbn;
}

package com.restapi.config;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class DatabaseConfig {

	private String url;
	private String user;
	private String password;
}

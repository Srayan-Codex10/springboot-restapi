package com.restapi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties(prefix = "spring")
@Getter
@Setter
public class RestAppConfig {

	private String ver;
	private String env;
	private DatabaseConfig datasource;
	
}

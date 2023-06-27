package com.restapi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ConfigurationProperties
@Configuration
@Getter
@Setter
@ToString
public class RestAppConfig {

	private String ver;
	private String env;
	private DatabaseConfig datasource;
}

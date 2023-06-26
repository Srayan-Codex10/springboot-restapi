package com.restapi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ConfigurationProperties
@ComponentScan(basePackageClasses = { RestAppConfig.class, JdbcTemplate.class })
@Getter
@Setter
@ToString
public class RestAppConfig {

	private String ver;
	private String env;
	private DatabaseConfig datasource;
}

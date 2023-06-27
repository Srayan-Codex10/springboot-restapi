package com.restapi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@ConfigurationProperties(prefix = "datasource")
@Configuration
public class DatabaseConfig {

	private String url;
	private String user;
	private String password;
	private String driverClassName;
	private Boolean autoCommit;
	private Long idleTimeout;
	private Integer minimumIdle;
	private Integer maximumPoolSize;
	private Long maxLifeTime;
	private String poolName;
}

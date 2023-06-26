package com.restapi.config;

import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Configuration
public class DatabaseConfig {

	private String url;
	private String user;
	private String password;
	private String driverClassName;
	private Boolean autoCommitBoolean;
	private Long idleTimeout;
	private Integer minimumIdle;
	private Integer maximumPoolSize;
	private Long maxLifeTime;
	private String poolName;
}

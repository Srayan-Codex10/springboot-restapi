package com.restapi.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.restapi.utils.ApiUtil;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DatasourceConfig {

	@Bean
	public DataSource getDataSource(DatabaseConfig dbConfig) {
		HikariConfig hConfig = new HikariConfig();

		hConfig.setUsername(dbConfig.getUser());
		hConfig.setPassword(ApiUtil.decode(dbConfig.getPassword()));
		hConfig.setJdbcUrl(dbConfig.getUrl());
		hConfig.setDriverClassName(dbConfig.getDriverClassName());
		hConfig.setIdleTimeout(dbConfig.getIdleTimeout().longValue());
		hConfig.setMinimumIdle(dbConfig.getMinimumIdle().intValue());
		hConfig.setMaximumPoolSize(dbConfig.getMaximumPoolSize().intValue());
		hConfig.setMaxLifetime(dbConfig.getMaxLifeTime().longValue());
		hConfig.setPoolName(dbConfig.getPoolName());

		return new HikariDataSource(hConfig);
	}
}

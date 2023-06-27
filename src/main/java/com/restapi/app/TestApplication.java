package com.restapi.app;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@Slf4j
public class TestApplication {

	public static void main(String[] args) {
		log.info("Starting Application V1");
		SpringApplication springApp = new SpringApplication(TestApplication.class);
		springApp.setBannerMode(Banner.Mode.OFF);
		springApp.run();
	}

}

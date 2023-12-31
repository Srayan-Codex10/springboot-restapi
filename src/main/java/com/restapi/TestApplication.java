package com.restapi;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication(scanBasePackages = { "com.restapi.*" })
@Slf4j
public class TestApplication {

	public static void main(String[] args) {
//		log.info("Starting Application Version V1 in {}",System.getenv("SPRING_PROFILES_ACTIVE"));
		SpringApplication springApp = new SpringApplication(TestApplication.class);
		springApp.setBannerMode(Banner.Mode.OFF);
		springApp.run();
	}

}

package com.restapi.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.restapi.config.RestAppConfig;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class TestApplication implements CommandLineRunner {

	@Autowired
	RestAppConfig appConfig;

	public static void main(String[] args) {
		log.info("Starting Application V1");
		SpringApplication springApp = new SpringApplication(TestApplication.class);
		springApp.setBannerMode(Banner.Mode.OFF);
		springApp.run();
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(appConfig.getEnv());
		log.info(appConfig.getVer());

	}

}

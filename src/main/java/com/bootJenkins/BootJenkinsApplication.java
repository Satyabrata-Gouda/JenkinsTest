package com.bootJenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class BootJenkinsApplication {
public static Logger logger = LoggerFactory.getLogger(BootJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application startd");
	}
	public static void main(String[] args) {
		SpringApplication.run(BootJenkinsApplication.class, args);
	}

}

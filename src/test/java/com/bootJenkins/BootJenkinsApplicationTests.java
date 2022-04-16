package com.bootJenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootJenkinsApplicationTests {
	
	Logger logger = LoggerFactory.getLogger(BootJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		
		logger.info("Inside Test");
	}

}

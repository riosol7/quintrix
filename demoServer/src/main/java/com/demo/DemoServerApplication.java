package com.demo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
public class DemoServerApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(DemoServerApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DemoServerApplication.class, args);
	}

	// CRON: Seconds, Minutes, Hours, Days of Month, Months, Days of Weeks
	// The / will determine of every time duration EX: for every 5 seconds */5, same for week...
	// Every minute
	@Scheduled(cron = "0 */1 * * * *")
	void job() throws InterruptedException {
		LOGGER.info("Time: " + new Date());
	};

}

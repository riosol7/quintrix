package com.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
public class DemoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoServerApplication.class, args);
	}

	// Seconds, Minutes, Hours, Days of Month, Months, Days of Weeks, Years
	
	// Every minute
	@Scheduled(cron = "0 */1 * * * *")
	void job() throws InterruptedException {
		System.out.println("Time: " + new Date());
	};

}

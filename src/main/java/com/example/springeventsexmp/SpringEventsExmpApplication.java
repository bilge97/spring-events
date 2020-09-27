package com.example.springeventsexmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringEventsExmpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEventsExmpApplication.class, args);
	}

}

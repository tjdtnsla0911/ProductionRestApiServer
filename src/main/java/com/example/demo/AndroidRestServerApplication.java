package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ConcurrentTaskScheduler;

@SpringBootApplication
@EnableScheduling //Batch関連 - 2022.04.21 
@Configuration
public class AndroidRestServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(AndroidRestServerApplication.class, args);
	}
	//Batch
	@Bean
	public TaskScheduler taskScheduler() {

		return new ConcurrentTaskScheduler();
	}
}

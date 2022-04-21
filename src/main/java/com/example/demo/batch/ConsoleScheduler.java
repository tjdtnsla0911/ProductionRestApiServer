package com.example.demo.batch;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ConsoleScheduler {
	
	final static String TAG = "####";
	
	@Scheduled(fixedRate = 300000)
	public void printDate() {
		
		log.debug(TAG + "Batch Test OK!");
	
	}
}

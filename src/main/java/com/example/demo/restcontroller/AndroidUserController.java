package com.example.demo.restcontroller;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin("*") //テスト中ですので、＊にします
@RequestMapping(name = "/app/android") //
@Slf4j 
public class AndroidUserController {

	final String Log = "@@@@@@@";
	
	@PostConstruct
	@GetMapping("/test")
	public ResponseEntity<?> startTest(){
		log.debug(Log + "SpringBootが始まりました！");
		
		return new ResponseEntity<String>("Android ♥ SrpingBoot",HttpStatus.OK);
	}
}

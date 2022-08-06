package com.example.demo.restcontroller;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.AppUserRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin("*") //テスト中ですので、＊にします
@RequestMapping(name = "/app/android") //
@Slf4j 
public class AndroidUserController {
	/*쿼리팩토리 관련*/
	@Autowired
	EntityManager em;
	
	@Autowired
	AppUserRepository appRepository;
	

	final String Log = "@@@@@@@"; //걍 대충설정함
	
	//실행시 테스트용
	@PostConstruct
	@GetMapping("/test")
	public ResponseEntity<?> startTest(){
		log.debug(Log + "SpringBootが始まりました！");
		return new ResponseEntity<String>("Android ♥ SrpingBoot",HttpStatus.OK);
	}
	
	@PostMapping(value = "/login")
}

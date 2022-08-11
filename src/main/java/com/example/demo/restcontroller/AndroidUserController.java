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

//BootWar 이란걸 뽑아서 

//스프링부트 (자바를 쓰는 백엔드를 위허ㅏㄴ 시발놈들아 프레임워크) <-> 프론트단(리엑트,뷰 ) , 모바일단(좆드로이나 , ios 시발 사과새끼들)

@RestController //데이터를 반환 @Controller
@CrossOrigin("*") //교차출처 소스검증 , 시발 여기에 설정한 아이피(리에트나, 좆드로이드나) 들만 올수있다.  テスト中ですので、＊にします
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
	

}

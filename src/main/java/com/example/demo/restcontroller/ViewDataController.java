package com.example.demo.restcontroller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin("*") //テスト中ですので、＊にします
@RequestMapping(name = "/app/android") //
@Slf4j 
public class ViewDataController {
	


}

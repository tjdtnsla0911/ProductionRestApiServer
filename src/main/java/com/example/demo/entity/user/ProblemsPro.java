package com.example.demo.entity.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Builder
@Table(name = "problems_pro")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ProblemsPro {
	/*어차피 혼자쓸 앱이라 대충 테이블 1분컷으로 구성*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Integer proId; //문제번호
	@Column(name = "question")
	@NonNull
	private String question; //문제 
	private String answer; //답
	private String helpAnswer; //도움말
	private Boolean written; //필기냐실기냐
	private int subjects;
	@Column(name = "real_subject")
	private int real_subject; //과목명
	
	/* subjects 코드 : 정보처리기사 001 , 정보처리산업기사 002, 사무자동화산업기사 003 , 산업안전기사 004 ,
	 산업안전산업기사 005 , 가스기사 006 , 가스산업기사 007, 건축기사 008 , 용접기사 009 , 용접산업기사 010, 정보처리기능사 011, 건설안전기사 012 , 
	 생산자동화기능사 013 , 세탁기능사 014*/
	
	
}
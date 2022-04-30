package com.example.demo.entity.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.example.demo.study.app_model.PreQuestion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Setter
@Getter
@Entity
@Table(name = "PreQuestion")
public class PreQuestion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int proId;
	@NotNull
	private String questionStart; //문제내용
	@NotNull
	private String whenTest; //언제시험이냐
	@NotNull /*문제문항 1,2,4,*/
	private String question1;
	@NotNull
	private String question2;
	@NotNull
	private String question3;
	@NotNull
	private String question4;
	@NotNull
	private String answer;
	private String img;
	private String helpAnswer;
	private Boolean written;
	private int subjects;
	@Column(name = "real_subject")
	private int realSubject;
	private String corAnswerRate; //정답률
	private int examNum; //시험문제번호
	
	/*
	 *     proId int(30) auto_increment primary key ,#문제번호
    question varchar(1500),  #문제
    answer varchar(1000),#답
    img varchar(1000), #문제이미지
    helpAnswer varchar(1000),#도움말
    written bool,     # 필기냐실기냐 - true 필기 false 실기
    subjects int, # 과목
    real_subject int ,#어떤시험이냐
	corAnswerRate varchar(100) #정답률
	 * */
}

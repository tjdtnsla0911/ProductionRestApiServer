package com.example.demo.entity.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
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
	
	private String questionStart; //문제내용

	private String whenTest; //언제시험이냐
	/*문제문항 1,2,4,*/
	private String question1;

	private String question2;

	private String question3;

	private String question4;

	private String answer;
	private String img;
	private String helpAnswer;
	private Boolean written;
	private int subjects;
	@Column(name = "real_subject")
	private int realSubject;
	private String corAnswerRate; //정답률
	private int examNum; //시험문제번호

}

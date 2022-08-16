package com.example.demo.entity.access;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

//IP 체크 및 애널리틱스 용도로 쓸꺼
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table
public class UserAccess {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seq;
	
	private String monthday;
	private String ip;
	
	private String lang;
}

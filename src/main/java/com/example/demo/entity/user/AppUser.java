package com.example.demo.entity.user;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table
public class AppUser implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "seq")
	private  Integer userSeq;
	@Column(nullable = false, length = 50)
	private String userName;
	@Column(nullable = false)
	private String tallNo;
	@Column(nullable = false , name = "createDate")
	@CreationTimestamp //요놈말고도 UpdateTimeStamp도있음
	private Timestamp createDate;
	@Column(nullable = false)
	private String address;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String img;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private String userid;
	@Column(nullable = false)
	private Boolean user_state;
}


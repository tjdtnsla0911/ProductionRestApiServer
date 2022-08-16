package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.access.UserAccess;

public interface UserAccessRepository extends JpaRepository<UserAccess, Integer>{

}

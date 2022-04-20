package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.user.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Integer>{

}

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Recruiter;

public interface RecruiterRepository extends JpaRepository<Recruiter, Integer>{
	

}

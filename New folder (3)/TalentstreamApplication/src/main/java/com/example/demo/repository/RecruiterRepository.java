package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Recruiter; 
@Repository
public interface RecruiterRepository extends JpaRepository<Recruiter, Integer>{
	

	boolean existsByEmail(String email);

	

}

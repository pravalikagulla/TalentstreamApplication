package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Recruiter;
import com.example.demo.exception.CustomException;
import com.example.demo.repository.RecruiterRepository; 
import com.example.demo.Dto.RecruiterDTO;

@Service
public class RecruiterService {
@Autowired	
RecruiterRepository recruiterRep; 
   
   public RecruiterDTO createRecruiter(Recruiter recruiter) { 
	   if (recruiterRep.existsByEmail(recruiter.getEmail()))
			   {
		   throw new CustomException("email","email already exists");
           }
           
	   RecruiterDTO  recruiterDTO = new RecruiterDTO();
	   recruiterDTO.setCompanyname(recruiter.getCompanyname());
	   recruiterDTO.setEmail(recruiter.getEmail());
	   recruiterDTO.setMobileNumber(recruiter.getMobileNumber());
	   recruiterDTO.setPassword(recruiter.getPassword());
	   
	   Recruiter saveRecruiterdto = recruiterRep.save(recruiter);   
	   	   // converting back to dto 
	
	   
	   // returning the saved db
	   return recruiterDTO;
	   
   }
}

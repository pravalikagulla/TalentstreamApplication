package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Recruiter;
import com.example.demo.repository.RecruiterRepository; 

@Service
public class RecruiterService {
@Autowired	
RecruiterRepository recruiterRep; 
   
   public Recruiter createRecruiter(Recruiter rec) { 
	   return recruiterRep.save(rec);
   }
}

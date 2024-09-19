package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.RecruiterDTO;
import com.example.demo.Service.RecruiterService;
import com.example.demo.entity.APIResponse;
import com.example.demo.entity.Recruiter;

import jakarta.validation.Valid;

@RestController
@Validated
@RequestMapping("/Recruiters")
public class RecruiterController {
    
    @Autowired
    RecruiterService recruiterservice;
    
   @PostMapping("/Recruiterreg")
   public ResponseEntity<APIResponse<RecruiterDTO>> createRecruiter(@Valid @RequestBody Recruiter recruiterDTO) {    
       RecruiterDTO savedRecruiter = recruiterservice.createRecruiter(recruiterDTO);
        return new ResponseEntity<>(new APIResponse<>("Recruiter saved successfully", savedRecruiter, HttpStatus.CREATED.value()), HttpStatus.CREATED);
    }
  
    
}


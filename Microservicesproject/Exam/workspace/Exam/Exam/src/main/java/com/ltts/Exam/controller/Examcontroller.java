package com.ltts.Exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.Exam.model.Exam;
import com.ltts.Exam.repository.Examrepository;

@RestController
public class Examcontroller {
		
	@Autowired
	private Examrepository examRepo;
	
	@GetMapping("/examlist")
	public List<Exam> listUsers( Exam li) {
		List<Exam> listUsers = examRepo.findAll();
		return listUsers;
}}
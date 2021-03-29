package com.ltts.Schedule.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ltts.Schedule.model.Shedule;
import com.ltts.Schedule.repository.ScheduleRepository;


@RestController
public class Schedulecontroller {
		
	@Autowired
	private ScheduleRepository sRepo;
	
	@GetMapping("/schedule")
	public List<Shedule> listUsers( Shedule li) {
		List<Shedule> listUsers = sRepo.findAll();
		return listUsers;
}}
package com.ltts.Schedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ltts.Schedule.model.Shedule;


public interface ScheduleRepository extends JpaRepository<Shedule, String> {
	@Query("SELECT k FROM Shedule k WHERE k.fullname = ?1")
	public Shedule findByfullname(String fullname);

}

package com.ltts.Exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ltts.Exam.model.Exam;

public interface Examrepository extends JpaRepository<Exam, Long> {
	@Query("SELECT x FROM Exam x WHERE x.examcode = ?1")
	
	public Exam findById(long examcode);
	
}

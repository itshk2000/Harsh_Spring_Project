package com.planner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.planner.model.Trips;
import com.planner.model.Cplanner;

@Repository
public interface PlanRepository extends JpaRepository<Cplanner, Integer> {
	@Query("select l from Cplanner l where l.planName=(:planName) and l.password=(:password)")
	Cplanner findByLoginData(String planName, String password);
}

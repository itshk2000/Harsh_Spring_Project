package com.planner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.planner.model.Trips;

@Repository
public interface TripsRepository extends JpaRepository<Trips, Integer>{
	
	@Query("select b from Trips b where b.from=(:from) and b.to=(:to)")
	Trips findByLoginData(String from, String to);

}

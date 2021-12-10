package com.planner.service;

import org.springframework.stereotype.Service;

import com.planner.model.Cplanner;

@Service
public interface PlanService {
	public void addPlan(Cplanner Cplanner);
	public Cplanner validatePlan(Cplanner Cplanner); 
}

package com.planner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planner.model.Trips;
import com.planner.repository.PlanRepository;
import com.planner.model.Cplanner;
@Service
public class PlanServiceImpl implements PlanService{
	@Autowired
	PlanRepository planRepository;
	
	@Override
	public void addPlan(Cplanner cplanner) {
		// TODO Auto-generated method stub
		planRepository.save(cplanner);
	}
	@Override
	public Cplanner validatePlan(Cplanner cplanner) {
		// TODO Auto-generated method stub
		
		Cplanner cplanner1=planRepository.findByLoginData(cplanner.getPlanName(), cplanner.getPassword());
		return cplanner1;
	}
}

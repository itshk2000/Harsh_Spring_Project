package com.planner.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "Cplanner")
@Component
public class Cplanner {
	@Id // Specifies the primary key of an entity
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int PlanId;
	private String planName;
	private String password;
	public Cplanner() {
		super();
	}
	public Cplanner(int planId, String planName, String password) {
		super();
		PlanId = planId;
		this.planName = planName;
		this.password = password;
	}
	public int getPlanId() {
		return PlanId;
	}
	public void setPlanId(int planId) {
		PlanId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Cplanner [PlanId=" + PlanId + ", planName=" + planName + ", password=" + password + "]";
	}

	
}
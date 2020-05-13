package com.synehealth.springboot.healthdemo.service;

import java.util.List;

import com.synehealth.springboot.healthdemo.entity.Plan;


public interface PlanDetailService {
	
	List<Plan> getAllPlans();
	
	void deletePlanById(int id);
	
	void addPlan(Plan p);
	
	Plan getPlanById(int id);

}

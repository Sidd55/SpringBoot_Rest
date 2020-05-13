package com.synehealth.springboot.healthdemo.dao;

import java.util.ArrayList;
import java.util.List;

import com.synehealth.springboot.healthdemo.entity.Plan;

public interface PlanDetailDao {
	
	List<Plan> getAllPlans();
	
	void deletePlanById(int id);
	
	void addPlan(Plan p);
	
	//Plan getPlanById();

	Plan getPlanById(int id);
	
	//Plan updatePlan(Plan p);
	
	

}

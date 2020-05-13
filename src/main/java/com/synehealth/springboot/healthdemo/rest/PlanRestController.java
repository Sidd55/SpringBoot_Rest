package com.synehealth.springboot.healthdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.synehealth.springboot.healthdemo.entity.Plan;
import com.synehealth.springboot.healthdemo.exceptions.PlanNotFoundException;
import com.synehealth.springboot.healthdemo.service.PlanDetailService;

@RestController
@RequestMapping("/api")
public class PlanRestController {
	
	
	PlanDetailService planDetailService;
	
	@Autowired
	public PlanRestController(PlanDetailService thePlanDetailService) {
		planDetailService = thePlanDetailService;
	}
	
	@GetMapping("/plans")
	public List<Plan> getAllPlans(){
		
		return planDetailService.getAllPlans();
		
	}
	
	@PostMapping("/plans")
	public Plan addPlan(@RequestBody Plan plan) {
		
		plan.setPlanId(0);
		planDetailService.addPlan(plan);
		return plan;
		
	}
	
	@PutMapping("/plans")
	public Plan updatePlan(@RequestBody Plan plan) {
		
		//plan.setPlanId(0);
		planDetailService.addPlan(plan);
		return plan;
		
	}
	
	@DeleteMapping("/plans/{planId}")
	public String deletePlan(@PathVariable int planId){
		
		try {
		planDetailService.deletePlanById(planId);
		}
		
		catch(PlanNotFoundException exc) {
			
			throw new PlanNotFoundException("Id not found"+planId);
		}
		return "Plan deleted "+planId;
	}
	
	@GetMapping("/plans/{planId}")
	public Plan getPlanById(@PathVariable int planId){
		
		
			Plan plan =  planDetailService.getPlanById(planId);
		
			if(plan == null) {
				
				throw new PlanNotFoundException("Id not found"+planId);
			}
	
		return plan;
		
	}

}

package com.synehealth.springboot.healthdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.synehealth.springboot.healthdemo.dao.PlanDetailDao;
import com.synehealth.springboot.healthdemo.entity.Plan;

@Service
public class PlanDetailServiceImp implements PlanDetailService  {
	
	@Autowired
	PlanDetailDao planDetailDao;
	
//	@Autowired
//	public PlanDetailServiceImp(PlanDetailDao thePlanDetailDao) {
//		planDetailDao= thePlanDetailDao;
//	}

	@Override
	@Transactional
	public List<Plan> getAllPlans() {
		// TODO Auto-generated method stub
		
		List<Plan> pl = planDetailDao.getAllPlans();
		return pl;
	}

	@Override
	@Transactional
	public void deletePlanById(int id) {
		
		planDetailDao.deletePlanById(id);
	}

	@Override
	@Transactional
	public void addPlan(Plan p) {
		
		planDetailDao.addPlan(p);

	}

	@Override
	public Plan getPlanById(int id) {
		// TODO Auto-generated method stub
		
		return planDetailDao.getPlanById(id);
	}

}

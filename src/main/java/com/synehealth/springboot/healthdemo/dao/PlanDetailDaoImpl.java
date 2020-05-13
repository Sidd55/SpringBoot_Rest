package com.synehealth.springboot.healthdemo.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.synehealth.springboot.healthdemo.entity.Plan;

@Repository
public class PlanDetailDaoImpl implements PlanDetailDao {
	
	
	//@Autowired
	EntityManager em;
	
	@Autowired
	public PlanDetailDaoImpl(EntityManager theEm) {
		
		em = theEm;
	}

	@Override
	public List<Plan> getAllPlans() {
		
		
		List<Plan> pl = new ArrayList<Plan>();
		
		
		try {
		TypedQuery<Plan> query = em.createQuery("from Plan",Plan.class);
		
		pl = query.getResultList();
		}
		
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return pl;
	}

	@Override
	public void deletePlanById(int id) {
		
		try {
		Query query = em.createQuery("delete from Plan where planId=:PlanId");
		query.setParameter("PlanId", id);
		
		query.executeUpdate();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void addPlan(Plan pl) {
		
		
		try {
		Plan dbPlan = em.merge(pl);
		pl.setPlanId(dbPlan.getPlanId());
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public Plan getPlanById(int id) {
		
		Plan pl = em.find(Plan.class, id);
		
		return pl;
	}

//	@Override
//	public Plan updatePlan(Plan p) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}

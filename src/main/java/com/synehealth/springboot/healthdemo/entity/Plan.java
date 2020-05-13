package com.synehealth.springboot.healthdemo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="plan")
public class Plan implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Plan_Id")
	private Integer planId;
	
	@Column(name="Plan_Name")
	private String planName;
	
	@Column(name="Age_Limit")
	private String ageLimit;
	
	@Column(name="Cover_Type")
	private String coverType;
	
	@Column(name="Co_Payment")
	private String coPayment;
	
	@Column(name="Policy_Tenure")
	private Integer policyTenure;
	
	@Column(name="Annual_Premium")
	private Integer annualPremium;
	
	
	public Plan() {}


	public Plan(String planName, String ageLimit, String coverType, String coPayment, Integer policyTenure,
			Integer annualPremium) {
		super();
		this.planName = planName;
		this.ageLimit = ageLimit;
		this.coverType = coverType;
		this.coPayment = coPayment;
		this.policyTenure = policyTenure;
		this.annualPremium = annualPremium;
		
	}

	

	public Integer getPlanId() {
		return planId;
	}


	public void setPlanId(Integer planId) {
		this.planId = planId;
	}


	public String getPlanName() {
		return planName;
	}


	public void setPlanName(String planName) {
		this.planName = planName;
	}


	public String getAgeLimit() {
		return ageLimit;
	}


	public void setAgeLimit(String ageLimit) {
		this.ageLimit = ageLimit;
	}


	public String getCoverType() {
		return coverType;
	}


	public void setCoverType(String coverType) {
		this.coverType = coverType;
	}


	public String getCoPayment() {
		return coPayment;
	}


	public void setCoPayment(String coPayment) {
		this.coPayment = coPayment;
	}


	public Integer getPolicyTenure() {
		return policyTenure;
	}


	public void setPolicyTenure(Integer policyTenure) {
		this.policyTenure = policyTenure;
	}


	public Integer getAnnualPremium() {
		return annualPremium;
	}


	public void setAnnualPremium(Integer annualPremium) {
		this.annualPremium = annualPremium;
	}


	@Override
	public String toString() {
		return "Plan [planId=" + planId + ", planName=" + planName + ", ageLimit=" + ageLimit + ", coverType="
				+ coverType + ", coPayment=" + coPayment + ", policyTenure=" + policyTenure + ", annualPremium="
				+ annualPremium + "]";
	}
	
	
	
	
	
	

}

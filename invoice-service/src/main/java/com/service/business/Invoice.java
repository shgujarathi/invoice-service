package com.service.business;

import java.io.Serializable;

public class Invoice implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2201446735014207116L;
	private Long id;
	private Milestone milestone;
	private String remittance;
	private Double amount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRemittance() {
		return remittance;
	}

	public Milestone getMilestone() {
		return milestone;
	}

	public void setMilestone(Milestone milestone) {
		this.milestone = milestone;
	}

	public void setRemittance(String remittance) {
		this.remittance = remittance;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}

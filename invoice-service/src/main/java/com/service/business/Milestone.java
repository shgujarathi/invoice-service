package com.service.business;

import java.io.Serializable;

public class Milestone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8943481208875858675L;
	private Long id;
	private String fromDate;
	private String toDate;
	private Long numOfResources;
	private Long percentage;

	public Milestone(Long id, String fromDate, String toDate, Long numOfResources, Long percentage) {
		super();
		this.id = id;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.numOfResources = numOfResources;
		this.percentage = percentage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public Long getNumOfResources() {
		return numOfResources;
	}

	public void setNumOfResources(Long numOfResources) {
		this.numOfResources = numOfResources;
	}

	public Long getPercentage() {
		return percentage;
	}

	public void setPercentage(Long percentage) {
		this.percentage = percentage;
	}

}

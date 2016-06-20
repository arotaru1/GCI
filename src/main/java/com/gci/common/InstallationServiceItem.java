package com.gci.common;

/*
 * Example from mockup:
 * 
 * Non-Recurring Costs								Price
 * Configuration and Testing of Equipment		$3,485.00
 * 
 */
public class InstallationServiceItem {
	
	private int id;
	private String description;
	private Double cost;
	private String frequency;
	private boolean recurring;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public boolean isRecurring() {
		return recurring;
	}
	public void setRecurring(boolean recurring) {
		this.recurring = recurring;
	}
}

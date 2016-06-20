package com.gci.common;

import java.util.concurrent.atomic.AtomicInteger;

/*
 * Example from mockup:
 * 
 * Site 1					100 Mbps MPLS		$7,422.00
 */
public class DataService {

	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1);
	
	private int id;
	private Double cost = 0.0;
	private String siteName;
	private String serviceSpeed;
	private String frequency;
	
	public DataService() {
		id = ID_GENERATOR.getAndIncrement();
	}

	public int getId() {
		return id;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getServiceSpeed() {
		return serviceSpeed;
	}

	public void setServiceSpeed(String serviceSpeed) {
		this.serviceSpeed = serviceSpeed;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	
}

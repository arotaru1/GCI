package com.gci.common;

import java.util.Set;

public class Contracts {

	private int profileId;
	private Set<Contract> contracts;
	private String profileName;
	private int siteCount;
	private Double totalCost;
	
	public Contracts(int profileId) {
		this.profileId = profileId;
	}
	
	public int getProfileId() {
		return profileId;
	}
	
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}
	
	public Set<Contract> getContracts() {
		return contracts;
	}
	
	public void setContracts(Set<Contract> contracts) {
		this.contracts = contracts;
	}
	
	public void addContract(Contract contract) {
		this.contracts.add(contract);
	}
	
	public String getProfileName() {
		return profileName;
	}
	
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	
	public int getContractCount() {
		return contracts.size();
	}
	
	public int getSiteCount() {
		return siteCount;
	}
	
	public void setSiteCount(int siteCount) {
		this.siteCount = siteCount;
	}
	
	public Double getTotalCost() {
		return totalCost;
	}
	
	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
	
}

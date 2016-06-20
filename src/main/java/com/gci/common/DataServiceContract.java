package com.gci.common;

import java.util.Set;

public class DataServiceContract extends Contract {
	
	private Set<DataService> dataServices;
	private Double totalCost;
	private Set<Invoice> invoices;
	
	public Set<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(Set<Invoice> invoices) {
		this.invoices = invoices;
	}
	
	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
	
	public void setDataServices(Set<DataService> dataServices) {
		this.dataServices = dataServices;
	}

	public Set<DataService> getDataServices() {
		return dataServices;
	}
	
}

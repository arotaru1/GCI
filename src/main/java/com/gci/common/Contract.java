package com.gci.common;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Contract {
	
	private int id;	
	protected String contractType;
	private LocalDate startDate;
	private LocalDate endDate;
	private String contractTerm;
	private String status;
	private Set<Invoice> invoices = new HashSet<Invoice>();
	
	public enum ContractStatuses {
		UPCOMING, ACTIVE, EXPIRING, EXPIRED, CANCELLED
	}
	
	public enum ContractTypes {
		CONTRACT, SERVICESAGREEMENT, SERVICEORDER
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int contractId) {
		this.id = contractId;
	}
	
	public String getContractType() {
		return contractType;
	}
	
	public String getContractTerm() {
		return contractTerm;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void addInvoice(Invoice invoice) {
		invoices.add(invoice);
	}
	
	public void addInvoices(Set<Invoice> invoices) {
		this.invoices.addAll(invoices);
	}

	public Set<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(Set<Invoice> invoices) {
		this.invoices = invoices;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public void setContractTerm(String contractTerm) {
		this.contractTerm = contractTerm;
	}
	
}

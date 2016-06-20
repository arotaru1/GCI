package com.gci.common;

import java.time.LocalDate;

public class Invoice {
	
	private int id;
	private String status;
	private Double cost;
	private LocalDate dueDate;
	private LocalDate paidDate;
	private boolean paid;
	
	public enum InvoiceStatuses {
		PAID, PASTDUE, DUESOON, DUE
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public LocalDate getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(LocalDate paidDate) {
		this.paidDate = paidDate;
	}

	public boolean getPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}

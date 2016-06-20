package com.gci.integration.dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.gci.common.Invoice;
import com.gci.common.Invoice.InvoiceStatuses;

@Component
public class InvoiceDAO {

	public Set<Invoice> getInvoicesForDataServiceContract(int contractId) {
		Set<Invoice> retVal = new HashSet<Invoice>();
		
		// Get Invoices associated with this contractId from db.
		// This will be hardcoded data at this point...
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		
		Invoice invoice1 = new Invoice();
		invoice1.setCost(51155.0);
		LocalDate dueDate = LocalDate.parse("2015-Dec-30", formatter);
		invoice1.setDueDate(dueDate);
		invoice1.setPaid(false);
		invoice1.setStatus(InvoiceStatuses.PASTDUE.toString());
		
		Invoice invoice2 = new Invoice();
		invoice2.setCost(51155.0);
		dueDate = LocalDate.parse("2015-Nov-25", formatter);
		invoice2.setDueDate(dueDate);
		invoice2.setPaid(true);
		invoice2.setStatus(InvoiceStatuses.PAID.toString());
		
		Invoice invoice3 = new Invoice();
		invoice3.setCost(49390.0);
		dueDate = LocalDate.parse("2015-Aug-27", formatter);
		invoice3.setDueDate(dueDate);
		invoice3.setPaid(true);
		invoice3.setStatus(InvoiceStatuses.PAID.toString());
		
		Invoice invoice4 = new Invoice();
		invoice4.setCost(51155.0);
		dueDate = LocalDate.parse("2015-Jul-28", formatter);
		invoice4.setDueDate(dueDate);
		invoice4.setPaid(true);
		invoice4.setStatus(InvoiceStatuses.PAID.toString());
		
		Invoice invoice5 = new Invoice();
		invoice5.setCost(51155.0);
		dueDate = LocalDate.parse("2015-Jun-24", formatter);
		invoice5.setDueDate(dueDate);
		invoice5.setPaid(true);
		invoice5.setStatus(InvoiceStatuses.PAID.toString());
		
		Invoice invoice6 = new Invoice();
		invoice6.setCost(51155.0);
		dueDate = LocalDate.parse("2015-May-21", formatter);
		invoice6.setDueDate(dueDate);
		invoice6.setPaid(true);
		invoice6.setStatus(InvoiceStatuses.PAID.toString());
		
		retVal.add(invoice1);
		retVal.add(invoice2);
		retVal.add(invoice3);
		retVal.add(invoice4);
		retVal.add(invoice5);
		retVal.add(invoice6);
		
		return retVal;
	}
	
	public Set<Invoice> getInvoicesForServicesOrderContract(int contractId) {
		Set<Invoice> retVal = new HashSet<Invoice>();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		
		Invoice invoice1 = new Invoice();
		invoice1.setCost(275.0);
		LocalDate dueDate = LocalDate.parse("2016-Jan-28", formatter);
		invoice1.setDueDate(dueDate);
		invoice1.setPaid(false);
		invoice1.setStatus(InvoiceStatuses.DUESOON.toString());
		
		Invoice invoice2 = new Invoice();
		invoice2.setCost(275.0);
		dueDate = LocalDate.parse("2015-Nov-26", formatter);
		invoice2.setDueDate(dueDate);
		invoice2.setPaid(true);
		invoice2.setStatus(InvoiceStatuses.PAID.toString());
		
		retVal.add(invoice1);
		retVal.add(invoice2);
		
		return retVal;
	}
	
	public Set<Invoice> getInvoicesForServicesAgreementContract(int contractId) {
		Set<Invoice> retVal = new HashSet<Invoice>();
		
		// I return an empty set as I don't have an invoice for this contract type in the mockup
		
		return retVal;
	}
}

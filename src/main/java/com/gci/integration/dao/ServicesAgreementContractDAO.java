package com.gci.integration.dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gci.common.Contract;
import com.gci.common.ServicesAgreementContract;

@Component
public class ServicesAgreementContractDAO {
	
	@Autowired
	InvoiceDAO invoiceDAO;

	// Mock DB data...
	public Contract getServicesAgreementContract(int contractId) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		LocalDate startDate = LocalDate.parse("2015-Jun-18", formatter);
		LocalDate dueDate = LocalDate.parse("2016-Jun-17", formatter);
		
		String projectSummary = "This SOW covers the discovery and documetation of ABC Health "
				+ "Corporation's (ABCHC) wired and wireless local area networks (LANs).";
		String scopeOfWork = "Document and evaluate IP Address allocation and usage";
		
		ServicesAgreementContract retVal = new ServicesAgreementContract();
		retVal.setStartDate(startDate);
		retVal.setEndDate(dueDate);
		retVal.setProjectSummary(projectSummary);
		retVal.setScopeOfWork(scopeOfWork);
		retVal.setContractType(Contract.ContractTypes.SERVICESAGREEMENT.toString());
		retVal.addInvoices(invoiceDAO.getInvoicesForServicesAgreementContract(contractId));
		
		return retVal; // DTO
	}
	
}

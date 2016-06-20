package com.gci.integration.dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gci.common.Contract;
import com.gci.common.ServiceOrderContract;

@Component
public class ServicesOrderContractDAO {
	
	@Autowired
	InvoiceDAO invoiceDAO;
	
	@Autowired
	InstallationServiceItemDAO installationServiceItemDAO;

	// Mock DB data...
	public Contract getServicesOrderContract(int contractId) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		LocalDate startDate = LocalDate.parse("2015-Nov-24", formatter);
		LocalDate dueDate = LocalDate.parse("2018-Nov-23", formatter);
		
		ServiceOrderContract retVal = new ServiceOrderContract();
		retVal.setId(contractId);
		retVal.setStartDate(startDate);
		retVal.setEndDate(dueDate);
		retVal.setContractType(Contract.ContractTypes.SERVICEORDER.toString());
		retVal.addInvoices(invoiceDAO.getInvoicesForServicesOrderContract(contractId));
		retVal.setServiceItems(installationServiceItemDAO.getInstallationServiceItemsForContract(contractId));
		
		return retVal; // DTO
	}
	
}

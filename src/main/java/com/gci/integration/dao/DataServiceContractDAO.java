package com.gci.integration.dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gci.common.Contract;
import com.gci.common.Contract.ContractStatuses;
import com.gci.common.DataServiceContract;

@Component
public class DataServiceContractDAO {
	
	@Autowired
	InvoiceDAO invoiceDAO;
	
	@Autowired
	DataServiceDAO dataServiceDAO;
	
	// Mock DB data...
	public Contract getDataServiceContract(int contractId) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		LocalDate startDate = LocalDate.parse("2014-Feb-01", formatter);
		LocalDate dueDate = LocalDate.parse("2016-Feb-29", formatter);
		
		DataServiceContract retVal = new DataServiceContract();
		retVal.setId(contractId);
		retVal.setStatus(ContractStatuses.EXPIRING.toString()); // Setting status to match the mockup
		retVal.setStartDate(startDate);
		retVal.setEndDate(dueDate);
		retVal.setContractType(Contract.ContractTypes.CONTRACT.toString());
		
		retVal.setInvoices(invoiceDAO.getInvoicesForDataServiceContract(contractId));
		retVal.setDataServices(dataServiceDAO.getDataServicesForContract(contractId));
		
		return retVal; // DTO
	}
	
}

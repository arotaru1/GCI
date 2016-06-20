package com.gci.business;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gci.common.Contract;
import com.gci.common.Contracts;
import com.gci.integration.dao.DataServiceContractDAO;
import com.gci.integration.dao.ServicesAgreementContractDAO;
import com.gci.integration.dao.ServicesOrderContractDAO;

@Service
public class ContractServiceImpl implements ContractService{
	
	@Autowired
	DataServiceContractDAO dataServiceContractDAO;
	
	@Autowired
	ServicesOrderContractDAO servicesOrderContractDAO;
	
	@Autowired
	ServicesAgreementContractDAO servicesAgreementContractDAO;
	
	public Contracts getContractsForProfile(int profileId) {
		Contracts retVal = new Contracts(profileId);
		retVal.setContracts(new HashSet<Contract>());
		
		//A specialized DAO will contain these methods:
		//getDataServicesContractId(int profileId)
		//getServiceOrderContractId(int profileId)
		//getServicesAgreementContractId(int profileId)
		int dataServicesContractId = 1;
		int serviceOrderContractId = 1;
		int servicesAgreementContractId = 1;
		
		//Calls to specific contract daos will return all contracts. We add those to the Contracts wrapper
		retVal.getContracts().add(dataServiceContractDAO.getDataServiceContract(dataServicesContractId));
		retVal.getContracts().add(servicesOrderContractDAO.getServicesOrderContract(serviceOrderContractId));
		retVal.getContracts().add(servicesAgreementContractDAO.getServicesAgreementContract(servicesAgreementContractId));
		
		return retVal;
	}
	
}

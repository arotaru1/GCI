package com.gci.integration.dao;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.gci.common.DataService;

@Component
public class DataServiceDAO {

	public Set<DataService> getDataServicesForContract(int contractId) {
		Set<DataService> retVal = new HashSet<DataService>();
		
		// Get DataServices associated with this contractId from db.
		// This will be hardcoded data at this point...
		
		DataService dataService1 = new DataService();
		dataService1.setCost(7422.0);
		dataService1.setSiteName("Site 1");
		dataService1.setServiceSpeed("100 Mbps MPLS");
		dataService1.setFrequency("MONTHLY");
		
		DataService dataService2 = new DataService();
		dataService2.setCost(245.0);
		dataService2.setSiteName("Site 2");
		dataService2.setServiceSpeed("100 Mbps MPLS");
		dataService2.setFrequency("MONTHLY");
		
		DataService dataService3 = new DataService();
		dataService3.setCost(3325.0);
		dataService3.setSiteName("Site 3");
		dataService3.setServiceSpeed("100 Mbps MPLS");
		dataService3.setFrequency("MONTHLY");
		
		DataService dataService4 = new DataService();
		dataService4.setCost(3618.0);
		dataService4.setSiteName("Site 4");
		dataService4.setServiceSpeed("100 Mbps MPLS");
		dataService4.setFrequency("MONTHLY");
		
		DataService dataService5 = new DataService();
		dataService5.setCost(4093.0);
		dataService5.setSiteName("Site 5");
		dataService5.setServiceSpeed("100 Mbps MPLS");
		dataService5.setFrequency("MONTHLY");
		
		retVal.add(dataService1);
		retVal.add(dataService2);
		retVal.add(dataService3);
		retVal.add(dataService4);
		retVal.add(dataService5);
		
		return retVal;
	}
	
}

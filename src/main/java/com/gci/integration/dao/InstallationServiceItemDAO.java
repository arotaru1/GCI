package com.gci.integration.dao;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.gci.common.InstallationServiceItem;

@Component
public class InstallationServiceItemDAO {

	public Set<InstallationServiceItem> getInstallationServiceItemsForContract(int contractId) {
		Set<InstallationServiceItem> retVal = new HashSet<InstallationServiceItem>();
		
		// Get InstallationServiceItems associated with this contractId from db.
		// This will be hardcoded data at this point...
		
		InstallationServiceItem serviceItem1 =  new InstallationServiceItem();
		serviceItem1.setCost(3485.0);
		serviceItem1.setDescription("Configuration and Testing of Equipment");
		serviceItem1.setRecurring(false);
		
		InstallationServiceItem serviceItem2 =  new InstallationServiceItem();
		serviceItem1.setCost(275.0);
		serviceItem1.setDescription("Remote Site VPN");
		serviceItem1.setFrequency("MONTHLY");
		serviceItem1.setRecurring(true);
		
		retVal.add(serviceItem1);
		retVal.add(serviceItem2);
		
		return retVal;
	}
}

package com.gci.common;

import java.util.HashSet;
import java.util.Set;

public class ServiceOrderContract extends Contract {

	Set<InstallationServiceItem> serviceItems = new HashSet<InstallationServiceItem>();

	public Set<InstallationServiceItem> getServiceItems() {
		return serviceItems;
	}

	public void setServiceItems(Set<InstallationServiceItem> serviceItems) {
		this.serviceItems = serviceItems;
	}
	
}

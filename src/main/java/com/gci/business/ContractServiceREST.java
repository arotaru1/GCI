package com.gci.business;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gci.common.Contracts;

@Component
@Path("/contractServices")
public class ContractServiceREST {
	
	@Autowired
	ContractService contractService;
	
	@GET
	@Path("/getContracts/{profileId}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Contracts getContractsForProfileJSON(@PathParam("profileId") int profileId) {
		Contracts retVal = contractService.getContractsForProfile(profileId);
		
		return retVal;
	}

}

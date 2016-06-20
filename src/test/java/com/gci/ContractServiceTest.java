package com.gci;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gci.business.ContractService;
import com.gci.common.DataService;
import com.gci.common.DataServiceContract;
import com.gci.common.InstallationServiceItem;
import com.gci.common.Invoice;
import com.gci.common.ServiceOrderContract;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/application-config.xml"})

public class ContractServiceTest {
	
	@Autowired
	ContractService contractService;

	@Test
	public void test_getContractsForProfile_returnsNotNull() {
		final int PROFILE_ID = 1;
		assertNotNull(contractService.getContractsForProfile(PROFILE_ID));
	}
	
	@Test
	public void test_getContractsForProfile_returnsThreeContracts() {
		final int PROFILE_ID = 1;
		assertEquals(contractService.getContractsForProfile(PROFILE_ID).getContractCount(), 3);
	}
	
}

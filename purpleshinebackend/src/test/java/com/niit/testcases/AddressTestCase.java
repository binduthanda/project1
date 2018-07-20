package com.niit.testcases;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.Addressdao;
import com.niit.domain.Address;




public class AddressTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static Addressdao addressdao;

	@Autowired
	static Address address;

	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();

		addressdao = (Addressdao) context.getBean("addressdao");

		address = (Address) context.getBean("address");

	}

	/*@Test
	public void createAddressTestCase() {
		address.setId("isaacaddress");
		address.setUser_id("IsaacDV");
		address.setH_no("55");
		address.setStreet("Annamayya Enclave");
		address.setCity("BHEL");
		address.setCountry("India");
		address.setPin("502032");

		boolean flag = addressdao.save(address);

		assertEquals("createAddressTestCase", true, flag);

	}

	@Test
	public void updateAddressTestCase() {
		address.setId("SurenderAddress");
		address.setUser_id("Surender");
		address.setH_no("185");
		address.setStreet("Road No. 4");
		address.setCity("Bramguda");
		address.setCountry("India");
		address.setPin("502032");

		boolean flag = addressdao.update(address);

		assertEquals("createAddressTestCase", true, flag);

	}

	@Test
	public void listAllAddressTestCase() {
		int actualSize = addressdao.list().size();
		assertEquals(2, actualSize);
	}*/

}

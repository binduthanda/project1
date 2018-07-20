package com.niit.testcases;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.Supplierdao;
import com.niit.domain.Supplier;


public class SupplierTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static Supplierdao supplierdao;
	@Autowired
	static Supplier supplier;

	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();

		supplierdao = (Supplierdao) context.getBean("supplierdao");

		
		supplier = (Supplier) context.getBean("supplier");

	}

	/*@Test
	public void createSupplierTestCase() {
		supplier.setId("SUPP1");
		supplier.setName("Apollo");
		supplier.setAddress("Lingampally");

		boolean flag = supplierdao.save(supplier);

		assertEquals("createSupplierTestCase", true, flag);

	}

	@Test
	public void updateSupplierTestCase() {
		supplier.setId("SUPP1");
		supplier.setName("MedPlus+");
		supplier.setAddress("Chandanagar");

		boolean flag = supplierdao.update(supplier);

		assertEquals("updateSupplierTestCase", true, flag);

	}

	@Test
	public void listAllSupplierTestCase() {
		int actualSize = supplierdao.list().size();
		assertEquals(6, actualSize);
	}*/

}

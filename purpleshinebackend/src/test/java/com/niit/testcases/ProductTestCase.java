package com.niit.testcases;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.Productdao;
import com.niit.domain.Product;


public class ProductTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static Productdao productdao;
	@Autowired
	static Product product;
	
	@BeforeClass
	public static void initialize()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		productdao =  (Productdao) context.getBean("productdao");
		
		product = (Product)context.getBean("product");
		
	}
	/*
	@Test
	public void createProductTestCase()
	{
		
		product.setId("PROD1");
		product.setCategory_id("CATG1");
		product.setDescription("Diabetic Medicine");
		product.setName("Glimmy1");
		product.setPrice(210);
		product.setQuantity(1);
		product.setSupplier_id("SUPP1");
		
		boolean flag =  productdao.saveOrUpdate(product);

		assertEquals("createProductTestCase",true,flag);
		
	}
	@Test
	public void updateProductTestCase()
	{
		product.setId("PROD1");
		product.setName("Glimmy2");
		product.setDescription("Diabetic Medicine");
		product.setCategory_id("CATG1");
		product.setPrice(150);
		product.setSupplier_id("SUPP1");
		product.setQuantity(2);
		boolean flag = productdao.saveOrUpdate(product);
		assertEquals("update Product TestCase",true,flag);
	}
	@Test
	public void listAllProductTestCase()
	{
		int actualSize = productdao.list().size();
		assertEquals(2, actualSize);
	} */
}

package com.niit.testcases;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.My_Cartdao;
import com.niit.dao.Productdao;
import com.niit.domain.My_Cart;
import com.niit.domain.Product;


public class My_CartTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	Product product;
	
	@Autowired
	Productdao productdao;
	
	@Autowired
	static My_Cartdao my_Cartdao;
	@Autowired
	static My_Cart my_Cart;
	
	@BeforeClass
	public static void initialize()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		//get the categorydao from context
		my_Cartdao =  (My_Cartdao) context.getBean("my_Cartdao");
		
		//get the category from context
		my_Cart = (My_Cart)context.getBean("my_Cart");
		
	}
	
	/*@Test
	public void createCartTestCase() {
		my_Cart.setUser_id("IsaacDV");
		my_Cart.setPrice(210);
		my_Cart.setProduct_name("Glimmy 2");
		
		boolean flag = my_Cartdao.save(my_Cart);
		
		assertEquals("createCartTestCase",true,flag);
	}
	
	@Test
	public void deleteCartTestCase(){
		boolean flag = my_Cartdao.deleteAllProductsInCart("IsaacDV");
		
		assertEquals(true, flag);
	}
	
*/
}

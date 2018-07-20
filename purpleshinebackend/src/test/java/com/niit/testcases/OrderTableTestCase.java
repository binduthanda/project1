package com.niit.testcases;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.OrderTabledao;
import com.niit.domain.OrderTable;


public class OrderTableTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static OrderTable orderTable;
	
	@Autowired
	static OrderTabledao orderTabledao;
	
	@BeforeClass
	public static void initialize()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		orderTabledao =  (OrderTabledao) context.getBean("orderTabledao");
		
		
		orderTable = (OrderTable)context.getBean("orderTable");
		
	}
	
	
	/*
	@Test
	public void createOrderTableTestCase(){
		orderTable.setId(1);
		orderTable.setUser_id("IsaacDV");
		orderTable.setStatus("N");
		boolean flag = orderTabledao.save(orderTable);
		assertEquals("createOrderTableTestCase", true, flag);
	}
	
	@Test
	public void listTestCase(){
		int orderedSize = orderTabledao.list("IsaacDV").size();
		assertEquals(1, orderedSize);
	}
*/
}

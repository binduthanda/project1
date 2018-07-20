package com.niit.testcases;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.Userdao;
import com.niit.domain.User;


public class UserTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static Userdao userdao;

	@Autowired
	static User user;

	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();

		userdao = (Userdao) context.getBean("userdao");

		user = (User) context.getBean("user");

	}
	/*
	@Test
	public void createUserTestCase() {
		user.setEmail("isaacdv84@gmail.com");
		user.setId("IsaacDV");
		user.setName("Isaac Deva Varam");
		user.setPassword("isaac");
		user.setCountry("India");
		user.setAddress("Hyderabad");
		user.setRole("ROLE_USER");
		user.setContact("8194869957");
		boolean flag = userdao.save(user);

		assertEquals("createUserTestCase", true, flag);

	}
	
	@Test
	public void updateUserTestCase() {
		user.setEmail("isaacdv84@gmail.com");
		user.setId("IsaacDV");
		user.setName("Isaac Deva Varam");
		user.setPassword("isaac");
		user.setCountry("India");
		user.setAddress("Hyderabad");
		user.setRole("ROLE_USER");
		user.setContact("9490167876");
		boolean flag = userdao.update(user);

		assertEquals("updateUserTestCase", true, flag);

	}

	@Test
	public void validateUserTestCase() {

		boolean flag = userdao.validate("IsaacDV", "isaac");
		assertEquals(true, flag);

	}

	@Test
	public void listAllUserTestCase() {
		int actualSize = userdao.list().size();
		assertEquals(5, actualSize);
	}*/

}

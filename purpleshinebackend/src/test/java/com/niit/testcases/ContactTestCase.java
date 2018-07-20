package com.niit.testcases;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.Contactdao;
import com.niit.domain.Contact;


public class ContactTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static Contactdao contactdao;
	@Autowired
	static Contact contact;

	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();

		contactdao = (Contactdao) context.getBean("contactdao");

		
		contact = (Contact) context.getBean("contact");

	}

	/*@Test
	public void createContactTestCase() {
		contact.setName("B Isaac Deva Varam");
		contact.setEmail("isaacdv84@gmail.com");
		contact.setContact("8194869957");
		contact.setMessage("Original : You designed a  web application");

		boolean flag = contactdao.save(contact);

		assertEquals("createContactTestCase", true, flag);

	}

	@Test
	public void updateContactTestCase() {

		boolean flag = contactdao.delete(0);

		assertEquals("updateContactTestCase", true, flag);

	}

	@Test
	public void listAllContactTestCase() {
		int actualSize = contactdao.list().size();
		assertEquals(1, actualSize);
	}*/

}

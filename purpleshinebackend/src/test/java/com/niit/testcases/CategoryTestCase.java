package com.niit.testcases;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.Categorydao;
import com.niit.domain.Category;


public class CategoryTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static Categorydao categorydao;

	@Autowired
	static Category category;

	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		categorydao = (Categorydao) context.getBean("categorydao");
		category = (Category) context.getBean("category");

	}

	/*@Test
	public void createCategoryTestCase() {
		category.setId("CATG1");
		category.setName("Diabetic Medicine");
		category.setDescription("Diabetic Medicine");

		boolean flag = categorydao.save(category);

		assertEquals("createCategoryTestCase", true, flag);

	}

	@Test
	public void updateCategoryTestCase() {
		category.setId("CATG1");
		category.setName("Dental Medicine");
		category.setDescription("for tooth pain");

		boolean flag = categorydao.update(category);

		assertEquals("updateCategoryTestCase", true, flag);

	}

	@Test
	public void deleteCategoryTestCase() {
		category.setName("Dental Medicine");
		boolean flag = categorydao.delete(category.getName());

		assertEquals("deleteCategoryTestCase", true, flag);

	}

	@Test
	public void listAllCategoryTestCase() {
		int actualSize = categorydao.list().size();
		assertEquals(6, actualSize);
	}
*/
}

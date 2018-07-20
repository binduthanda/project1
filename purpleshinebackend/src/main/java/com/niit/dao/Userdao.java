package com.niit.dao;

import java.util.List;

import com.niit.domain.User;


public interface Userdao {
	
	public  boolean save(User user);
	
	public boolean update(User user);

	public boolean validate(String id, String password);
	
	public List<User> list();
	
	public User get(String id);
	

}

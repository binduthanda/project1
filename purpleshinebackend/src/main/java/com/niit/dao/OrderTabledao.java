package com.niit.dao;

import java.util.List;

import com.niit.domain.OrderTable;

public interface OrderTabledao {
	
	public boolean save(OrderTable orderTable);
	public List<OrderTable> list(String userId);

}

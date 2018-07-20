package com.niit.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.Addressdao;
import com.niit.domain.Address;


@Repository("addressdao")
@Transactional
public class AddressdaoImpl implements Addressdao {

	@Autowired
	private SessionFactory sessionFactory;

	public AddressdaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean save(Address address) {
		try {
			sessionFactory.getCurrentSession().save(address);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean update(Address address) {
		try {
			sessionFactory.getCurrentSession().update(address);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public List<Address> list() {
		return sessionFactory.getCurrentSession().createQuery("from Address").list();
	}

	public Address get(String id) {
		
		return 	(Address)  sessionFactory.getCurrentSession().get(Address.class, id);
		
	}

	public boolean delete(String id) {
		try {
			sessionFactory.getCurrentSession().delete(getAddressById(id));
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public Address getAddressById(String id) {
		return 	(Address)  sessionFactory.getCurrentSession().get(Address.class, id);
	}

	public Address getAddressByUserid(String userid) {
		return 	(Address)  sessionFactory.getCurrentSession().createQuery("from Address where user_id = ?").setString(0, userid).uniqueResult();
	}

	

}
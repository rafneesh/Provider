package com.demo.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.dao.CustomerDao;
import com.demo.hibernate.HibernateUtil;
import com.demo.model.Activity;
import com.demo.model.Customer;

/**
 * 
 * @author Rafne (Email: rafneesh@gmail.com)
 *
 */
public class CustomerDaoImpl implements CustomerDao
{

	@Override
	public Customer fetchCustomerById(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Activity> fetchAllActivity(String customerId) {
		
	        // creating session object
	        Session session = HibernateUtil.getSessionFactory().openSession();

	        // creating transaction object
	        Transaction t = session.beginTransaction();

	        Query query = session.createQuery("from Activity");
	        List list = query.list();
	        System.out.println(list);
	        t.commit();
	        session.close();
		return list;
	}

	@Override
	public void insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}

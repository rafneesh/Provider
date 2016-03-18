package com.demo.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

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

	        Criteria activityCriteria = session.createCriteria(Activity.class);
	        
	        List<Activity> activities = (List)activityCriteria.createCriteria("customer")
	        	    .add(Restrictions.eq("customerId",customerId))
	        	    .list();
	        //System.out.println(list);
	        session.close();
		return activities;
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

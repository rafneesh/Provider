package com.demo.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.demo.dao.CustomerDao;
import com.demo.model.Activity;
import com.demo.services.CustomerService;

/**
 * 
 * @author Rafne (Email: rafneesh@gmail.com)
 *
 */
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao customerDao;

	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public List<Activity> fetchAllActivities(String customerId) {

		System.out.println("Get Query for the Customer:" + customerId);

		List<Activity> activities = new ArrayList<Activity>();

		activities = customerDao.fetchAllActivity(customerId);

		return activities;
	}
}

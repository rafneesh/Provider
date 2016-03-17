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

		/*Activity a1 = new Activity();
		a1.setAction("PRODUCT_VIEW");
		a1.setCustomerId("1C13E32B66374084");
		a1.setTime(new Date());

		Activity a2 = new Activity();
		a2.setAction("PRODUCT_VIEW");
		a2.setCustomerId("1C13E32B66374084");
		a2.setTime(new Date());
		
		*/

		List<Activity> activities = new ArrayList<Activity>();

		activities = customerDao.fetchAllActivity(customerId);

		return activities;
	}
}

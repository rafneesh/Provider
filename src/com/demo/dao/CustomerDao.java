package com.demo.dao;

import java.util.List;

import com.demo.model.Activity;
import com.demo.model.Customer;

/**
 * 
 * @author Rafne (Email: rafneesh@gmail.com)
 *
 */
public interface CustomerDao
{
	public Customer fetchCustomerById(String customerId);

	public List<Activity> fetchAllActivity(String customerId);

	public void insertCustomer(Customer customer);

	public void deleteCustomer(Customer customer);
}

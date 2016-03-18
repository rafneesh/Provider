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
	/**
	 * To get the Customer details 
	 * @param unique id of the Customer
	 * @return the Customer with the unique id 
	 */
	public Customer fetchCustomerById(String customerId);

	/**
	 * To get all the activities by a Customer on various products
	 * @param unique id of the Customer
	 * @return a list of activities by the Customer
	 */
	public List<Activity> fetchAllActivity(String customerId);

	/**
	 * To create a new Customer or to update the existing one
	 * @param Customer with all the details required
	 */
	public void insertCustomer(Customer customer);

	/**
	 * To delete a Customer
	 * @param Customer with all the details required
	 */
	public void deleteCustomer(Customer customer);
}

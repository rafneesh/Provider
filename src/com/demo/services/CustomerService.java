package com.demo.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.model.Activity;

/**
 * 
 * @author Rafne (Email: rafneesh@gmail.com)
 *
 */
public interface CustomerService
{

	@GET
	@Path("/customers/{customerId}/activities")
	@Produces("application/json")
	public List<Activity> fetchAllActivities(@PathParam("customerId") String customerId);

}

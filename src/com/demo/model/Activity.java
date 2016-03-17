package com.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Rafne (Email: rafneesh@gmail.com)
 *
 */
@Entity
@Table(name="activity")
public class Activity {
	
	@Id
    @Column(name="id")
	Integer id;
	
	@Column(name="customer_id")
	String customerId;
	
	@Column(name="product_id")
	String productId;
	
	@Column(name="action")
	String action;
	
	@Column(name="date")
	Date date;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Date getTime() {
		return date;
	}

	public void setTime(Date time) {
		this.date = time;
	}
	
	

}

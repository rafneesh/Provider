package com.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;

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
	@GeneratedValue( strategy=GenerationType.AUTO )
	@JsonIgnore
	Integer id;
	
	@JsonIgnore
	@Column(name="customer_id")
	String customerId;
	
	@Column(name="action")
	String action;
	
	@Column(name="date")
	Date date;
	
	@Column(name="product_id")
	String productId;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	public String getProductId() {
		return productId;
	}
	

	public void setProductId(String productId) {
		this.productId = productId;
	}

}

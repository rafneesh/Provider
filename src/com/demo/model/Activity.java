package com.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
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
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="customer_id")
	Customer customer;
	
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
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

package com.hibernate.lab28sept;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="Customer_Info")
@Entity(name="Customer_Details")
public class Customer {

	@Id   // To set the primary key
	@Column(name="Customer_ID")
	private int cid;
	@Column(name="Customer_name")
	private String cname;
	@Column(name="Customer_mob")
	private int cmob;
	
	@OneToOne  // OneToOne connection --> Unidirectional
	@JoinColumn(name="Prod_Id")
	private Product prod;

	// Creating constructors
	public Customer(int cid, String cname, int cmob, Product prod) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cmob = cmob;
		this.prod = prod;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Getter setter
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCmob() {
		return cmob;
	}

	public void setCmob(int cmob) {
		this.cmob = cmob;
	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}
	
	
}

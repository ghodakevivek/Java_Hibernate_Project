package com.hibernate.lab28sept;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="Product_Info")
@Entity(name="Product_Detail")
public class Product {

	@Id  // To set the primary key
	@Column(name="Product_ID")
	private int pid;
	@Column(name="Product_Name")
	private String pname;
	@Column(name="Product_Color")
	private String pcolor;
	
	@OneToOne
	@JoinColumn(name="Cust_Id")
	
	private Customer cust;

	public Product(int pid, String pname, String pcolor, Customer cust) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcolor = pcolor;
		this.cust = cust;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPcolor() {
		return pcolor;
	}

	public void setPcolor(String pcolor) {
		this.pcolor = pcolor;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}
	
	
	
	
	
	
}

package com.hibernate.lab28sept;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	
	
	// Creating constructors
	public Product(int pid, String pname, String pcolor) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcolor = pcolor;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Getter setter
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
	
	
}

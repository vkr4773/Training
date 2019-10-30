package com.mydemos.pojo;

import java.util.Date;;

public class Customer {
	String custName;
	String custLastName;
	String CustId;
	String address;
	java.util.Date custDob;
	public Date getcustDob() {
		return custDob;
	}
	public void setcustDob(Date custDob) {
		this.custDob = custDob;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustLastName() {
		return custLastName;
	}
	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}
	public String getCustId() {
		return CustId;
	}
	public void setCustId(String id) {
		CustId = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Customer(String custName, String custLastName, String address) {
		super();
		this.custName = custName;
		this.custLastName = custLastName;
		this.address = address;
	}
	
	
	public Customer() {
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getCustName()+" "+getCustLastName()+" "+getCustId()+" "+getAddress()+" "+getcustDob();

	}
}

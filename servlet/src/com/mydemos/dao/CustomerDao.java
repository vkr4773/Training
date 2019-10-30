package com.mydemos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mydemos.dbutil.DbConn;
import com.mydemos.pojo.Customer;

import java.util.ArrayList;
import java.util.Date;

public class CustomerDao {
	public String saveCustomer(Customer customer) {
		
		try
		{
		Connection con=DbConn.getConnection();
		int seq_id = 0;
		String sql = "select jdbc_seq.nextval from DUAL";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			seq_id = rs.getInt(1);
		}

		sql="insert into customer values(?,?,?,?,?)";
		PreparedStatement vkr = con.prepareStatement(sql);
		String id  =null;
		vkr.setString(1, customer.getCustName());
		vkr.setString(2, customer.getCustLastName());
		
		if (seq_id < 10) {
            id = "00" + seq_id;
        } else if (seq_id >= 10 && seq_id < 100) {
            id = "0" + seq_id;
        } else {
            id = "" + seq_id;
        }		
		id = customer.getCustName().substring(0, 2) + customer.getCustLastName().substring(0, 2) + id;
		customer.setCustId(id);
        vkr.setString(3, customer.getCustId());
		vkr.setString(4, customer.getAddress());
		
		Date utildob = customer.getcustDob();
		java.sql.Date dob = new java.sql.Date(utildob.getYear() ,utildob.getMonth(),utildob.getDate());
		vkr.setDate(5, dob);

		int res= vkr.executeUpdate();
		if(res>0)
		return "customer saved";


		}
		catch (Exception e) {
		e.printStackTrace();
		}

		return "Cannot save Customer";

		}
	
public ArrayList<Customer> getAllCustomers()
	{
	ArrayList<Customer> custList=new ArrayList<Customer>();
	try
	{
	Connection con= DbConn.getConnection();

	String sql="select * from customer";
	PreparedStatement stat=con.prepareStatement(sql);

	ResultSet rs=stat.executeQuery();

	if(rs.next())
	{
	do{
		Customer customer=new Customer();
		customer.setCustName(rs.getString(1));
		customer.setCustLastName(rs.getString(2));
		customer.setCustId(rs.getString(3));
		customer.setAddress(rs.getString(4));
		customer.setcustDob(rs.getDate(5));
	

	custList.add(customer);

	}
	while(rs.next());

	}
	else
	{
	return custList;
	}


	}
	catch (Exception e) {
	e.printStackTrace();
	return null;

	}

	return custList;
	}


}

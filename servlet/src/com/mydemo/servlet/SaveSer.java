package com.mydemo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mydemos.dao.CustomerDao;
import com.mydemos.pojo.Customer;

/**
 * Servlet implementation class SaveSer
 */
@WebServlet("/SaveSer")
public class SaveSer extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			PrintWriter out= response.getWriter();
			
			String  customername  = request.getParameter("CUSTNAME"); 
			String customerlastname = request.getParameter("CUSTLASTNAME"); 
			String customeraddress = request.getParameter("ADDRESS");       
			String custdob=request.getParameter("dob");

			Customer customer=new Customer(customername, customerlastname, customeraddress);

			SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
			Date dob=sd.parse(custdob);
			
			customer.setcustDob(dob);


			CustomerDao dao=new CustomerDao();
			dao.saveCustomer(customer);



			}
			catch (Exception e) {
			e.printStackTrace();
			}

	}


}

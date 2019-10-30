package com.mydemo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Catch;

import com.mydemos.dao.CustomerDao;
import com.mydemos.pojo.Customer;

/**
 * Servlet implementation class DisplayServ
 */
@WebServlet("/DisplayServ")
public class DisplayServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
		 

	try {
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Display Table </title>");
		out.println("<head>");
		out.println("<body>");
		CustomerDao dao = new CustomerDao();
		ArrayList<Customer> custList  = dao.getAllCustomers();
		
		out.print("<table width=50% border=1>");  
		out.print("<caption>Result:</caption>"); 
		
		out.print("<tr>"); 
	
		  
		out.print("</tr>");  
		              
		/* Printing result */  
		  
		for(Customer cust:custList) 
		{  
		out.print("<tr><td>"+cust.getCustName()+"</td><td>"+cust.getCustLastName()+"</td><td>"+cust.getCustId()+"</td><td>"+cust.getAddress()+"</td><td>"+cust.getcustDob()+"</td></tr>");  
		                  
		}  
		  
		out.print("</table>");
		
	}catch (Exception e) {
		e.getStackTrace();
		// TODO: handle exception
	}
}
}

package com.mydemo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyFirstSrv
 */
@WebServlet("/MyFirstSrv")
public class MyFirstSrv extends HttpServlet {
       
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();

		String name=request.getParameter("userName");

		out.println("<h1>HELLO "+name+" FROM SERVER </br>");

		String[] languages= request.getParameterValues("languagesKnown");

		out.println("Hey u know these languages great!! </br>");

		for(String var:languages)
		{
		out.println(var+"</br>");
		}

	}

}

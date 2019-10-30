package com.myhib.service;

import com.myhib.dao.CustomersDao;
import com.myhib.model.Customers;

public class CustomersService {

public static void main(String[] args) {


Customers cust=new Customers();
cust.setCustId(1);
cust.setCustName("JOHN");

CustomersDao dao=new CustomersDao();
dao.saveCustomer(cust);

System.out.println("DONE");


}

}

package com.myhib.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.myhib.model.Customers;

public class CustomersDao {


public void saveCustomer(Customers customer)
{
SessionFactory factory=new Configuration().configure().buildSessionFactory();
Session session=factory.openSession();
Transaction tx= session.beginTransaction();
session.save(customer);
tx.commit();
}

}
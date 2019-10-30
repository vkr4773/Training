package com.myhib.dao;

import java.util.ArrayList;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.myhib.model.User;

public class UserDao {

SessionFactory factory=new Configuration().configure().buildSessionFactory();

public void saveUser(User user)
{
Session session=factory.openSession();
Transaction tx= session.beginTransaction();
session.save(user);
tx.commit();
session.close();
}


public ArrayList<User> getUsers()
{
Session session=factory.openSession();
Transaction tx= session.beginTransaction();
//ArrayList<User> customers=(ArrayList<User>)session.createQuery("from User").list();

org.hibernate.query.Query query =session.createQuery("from User");
ArrayList<User> users =(ArrayList<User>) query.getResultList();
tx.commit();
session.close();
return users;

}



}
package com.myhib.dao;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.myhib.model.School;

public class SchoolDao {

SessionFactory factory=new Configuration().configure().buildSessionFactory();

public ArrayList<School> getSchoolsBySession(int sessn , int sems)
{
Session session1= factory.openSession();
Transaction tx=session1.beginTransaction();
Query query=session1.createQuery("from School s where s.session=:sId and s.sem=:semester");
query.setParameter("sId", sessn);
query.setParameter("semester", sems);
ArrayList<School> studs=(ArrayList<School>)query.list();
return studs;
}

}
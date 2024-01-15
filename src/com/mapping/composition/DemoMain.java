package com.mapping.composition;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		//write a query to find all the Disk objects
		Transaction tx = s.beginTransaction();
		
		
		Date d1 = new Date();
		d1.setDate(6);
		d1.setMonth("July");
		d1.setYear(2001);
		
		Person p1 = new Person();
		p1.setName("Ram");
		p1.setbDate(d1);
		
		s.persist(p1);		
		tx.commit();
		
		Query q = s.createQuery("from Person");
		System.out.println(q.list());
		
		
	}

}
package com.mapping.collection.set;

import java.util.HashSet;
import java.util.Set;

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
		
		Book b1 = new Book();
		b1.setBk_name("Java"); //same as a set method Ex. setBk_name
		b1.setPublisher("vevcode");

		Set<String> s1 = new HashSet<String>();
		s1.add("Ramesh");
		b1.setAuthor(s1);
		
		s.persist(b1);
		tx.commit();
		System.out.println("success");	
		
	}

}
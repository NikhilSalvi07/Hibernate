package com.mapping.collection.map;

//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.query.Query;

public class DemoMain {

	public static void main(String[] args) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Book b1 = new Book();
		b1.setBk_name("Good Habits");
		b1.setPublisher("abcd");
		Map<String,Integer> m1 = new HashMap<>();
		m1.put("Author1",1);
		m1.put("Author2",2);
		b1.setAuthor(m1);
		
		Book b2 = new Book();
		b2.setBk_name("Habits");
		b2.setPublisher("abcdef");
		Map<String,Integer> m2 = new HashMap<>();
		m2.put("Author1",1);
		m2.put("Author3",3);
		b2.setAuthor(m2);
		

		s.persist(b1);
		tx.commit();
		System.out.println("success");	
	}
}
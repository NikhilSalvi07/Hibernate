package com.mapping.collection.list;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mapping.collection.list.Book;

public class DemoMain {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		//write a query to find all the Disk objects
		Transaction tx = s.beginTransaction();
		
		Book b1 = new Book();
		b1.setBk_name("Java"); //same as a set method Ex. setBk_name
		b1.setPublisher("vevcode");

		ArrayList<String> s2 = new ArrayList<String>();
		s2.add("Ramesh");
		b1.setAuthor(s2);
		
		s.persist(b1);
		tx.commit();
		System.out.println("success");	
		
	}

}
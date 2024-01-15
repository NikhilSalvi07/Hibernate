package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.SpannerDialect;

public class DemoMain {
	public static void main(String[] args) {
				
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
	
		//Get the session factory ---- pool of connections
		Session s = sf.openSession();
		

		//Get the connection --------- session
		
		//Create the transient state
//=================================inject values into the bean
//		//sb.setStdId(1);
//		sb.setStdName("Nikhil");
//		//sb.setStdMks(90.5f);
//		
//		//Persistent state ----------- Transaction Beginning
		Transaction tx = s.beginTransaction(); 	//mark the entry point of persistent state
//		
//		//Detached state
//		//==================================Insert data into database
//		//s.save(sb);
//		s.persist(sb);
		
		//retrieve the object
//		System.out.println(s.get(StudentBean.class, 100));
//		StudentBean sb2 = s.get(StudentBean.class, 13);	//Other way
//		System.out.println(sb2);	
//		System.out.println(s.load(StudentBean.class, 100));		//Proxy Design Pattern
//		StudentBean sb3 = s.load(StudentBean.class, 200);
//		System.out.println(sb3.getStdId());
//		System.out.println(sb3.getStdName());
		
		
		//======================================Delete a record 
//		StudentBean sb = s.get(StudentBean.class, 5);
//		s.delete(sb);
		
		//First, u have to retrieve the record
		
		//delete it
		//commit it
		//to update the data
		//make use of setter method to change the value
		//s.update(object);
		//commit
		
		//s.close();	//Session were killed before retrieving the data
		
		StudentBean sb = s.get(StudentBean.class, 4);
		sb.setStdName("Abhi");
		s.update(sb);
		
		
		
		tx.commit();	//pushes the data injected into the object to the database
		System.out.println("Successful");
	}

}


/*
package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Load the configuration files
//		Configuration c = new Configuration();
//		c.configure();	//basically loads hibernate.cfg.xml file
//		SessionFactory sf = c.getSessionFactory();
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		//Get the session factory ---- pool of connections
		Session s = sf.openSession();
		
		//Get the connection --------- session
		StudentBean sb = new StudentBean();
		
		//Create the transient state
		//inject values into the bean
		sb.setStdId(1);
		sb.setStdName("spring");
		
		//Persistent state ----------- Transaction Beginning
		Transaction tx = s.beginTransaction(); 	//mark the entry point of persistent state
		
		//Detached state
		//Insert data into database
		//s.save(sb);
		s.persist(sb);
		tx.commit();	//pushes the data injected into the object to the database
		System.out.println("Successful");
	}

}*/
package com.mapping.inherance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class DemoMain {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		//write a query to find all the Disk objects
		Transaction tx = s.beginTransaction();
		
		
		Disc d=new Disc();
		d.setName("Java");
		d.setPrice(200);
		s.persist(d);
		
		AudioDisc ad=new AudioDisc();
		ad.setName("Sham");
		ad.setPrice(300);
		ad.setSingerName("Ram");
		ad.setNoOfSongs(5);
		s.persist(ad);
		
		VideoDisc vd=new VideoDisc();
		vd.setDirector("AR Rahaman");
		vd.setVideoFormat("mp4");
		vd.setName("Lakhan");
		vd.setPrice(400);
		s.persist(vd);

		
		tx.commit();
		Query q=s.createQuery("from Disc");
		
		System.out.println(q.list());

	}

}

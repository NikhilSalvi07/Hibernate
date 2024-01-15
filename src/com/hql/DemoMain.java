package com.hql;

import java.util.List;

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

		
//		Query q= s.createQuery("from Disk");
//		System.out.println(q.list());
		
//		List<Disk> l=q.list();
//		for (Disk d:l)
//			System.out.println(d.getDskName()+" "+d.getDskType()+" "+d.getDskPrice());
//		
//			Query q2=s.createQuery("select avg(dskPrice) from Disk");
//			System.out.println(q2.uniqueResult());
//
//			Query q3=s.createQuery("select avg(dskPrice) from Disk group by dskType");
//			System.out.println(q3.list());
//			
		
		
		
		//Update Table 
//			Query q4=s.createQuery("update Disk set dskPrice=(dskPrice+50) where dskId=1");
//			System.out.println(q4.executeUpdate());
//            tx.commit();
		
		
		
		//pagination -reading the object page by page
//		Query q= s.createQuery("from Disk");
//	q.setFirstResult(0);
//	q.setMaxResults(2);
//		System.out.println(q.list());
		
		//show only audio
//		Query q= s.createQuery("from Disk where dskType=:type");
//		q.setParameter("type","audio");
//		System.out.println(q.list());
		
		//show only those record as per below given condition (>300)
		Query q= s.createQuery("from Disk where dskType=:type and dskPrice > :pr");
		q.setParameter("type","video");
		q.setParameter("pr",300);
		System.out.println(q.list());

 

}

}

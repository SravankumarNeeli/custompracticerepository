package com.hib.prac.hibtest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hib.prac.model.UserDetails;

public class HibernateTesting {

	public static void main(String[] args) {
		
		UserDetails user=new UserDetails();
		user.setUserId(001);
		user.setUserName("Pen");
		//Creating the SessionFactory and geting the session from it
		SessionFactory bs=new Configuration().configure().buildSessionFactory();
		Session sessionobj=bs.openSession();
		//Begin the transaction for DML Operations
		sessionobj.beginTransaction();
		sessionobj.save(user);
		sessionobj.getTransaction().commit();
		
		

	}

}

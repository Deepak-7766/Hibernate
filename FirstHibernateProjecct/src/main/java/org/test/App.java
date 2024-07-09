package org.test;

import org.beans.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg=cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		Employee emp=new Employee(44,"nagesh",33344);
		session.save(emp);
		t.commit();
		session.close();
		
	}

}

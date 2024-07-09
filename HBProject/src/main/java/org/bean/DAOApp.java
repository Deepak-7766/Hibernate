package org.bean;

//import org.hibernate.*;
//import org.hibernate.cfg.*;
import org.bean.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class DAOApp {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg=cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Employee emp=new Employee(3,"yash",50000);
		session.save(emp);
		transaction.commit();
		session.close();

	}

}

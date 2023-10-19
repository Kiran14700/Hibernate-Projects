package com.One_to_Many.onetomany2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.One_to_Many.onetomany2_Entity.Student;

public class HibernateUtil {

	static SessionFactory factory=null;
	static {
		Configuration cfg=new Configuration();            //this line starts the configuration
		cfg.configure("hibernate.cfg.xml");               //xml file configure
		cfg.addAnnotatedClass(Student.class);             //Annoted the student class
		factory=cfg.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory() {
		return factory;                           //it returns the factory values
		
	}
	public static Session getSession() {
		return factory.openSession();
		
	}
		// TODO Auto-generated method stub


}

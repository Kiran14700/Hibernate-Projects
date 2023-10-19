package com.Lab.Demo.StudentLab.Demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;





/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	StudentLab s=new StudentLab();
    	s.setFirst_Name("Kiran");
    	s.setLast_Name("Dhumal");
    	s.setRoll_No(400);
    	s.setGrade(67);
    	
    	session.save(s);
    	tx.commit();
    	session.close();
    	

    }
}

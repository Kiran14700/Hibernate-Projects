package com.hibernate.employee.Employee.Demo;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import com.mysql.cj.Session;

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
       	Session session = factory.openSession();
       	Transaction tx=session.beginTransaction();
       	
     	Employee s=new Employee();
		s.setEmpid(4);
		s.setFirstName("Simran");
		s.setLastName("Kapoor");
		
		session.save(s);
		tx.commit();
		session.close();
    }
}

package com.hibernate.Demo1.Student.Demo;

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
////    	Configuration cfg=new Configuration();
////    	cfg.configure("hibernate.cfg.xml"); //file jidhr ha uska path proper dena ha otherwise filenot founderor
//    	
////    	SessionFactory factory=cfg.buildSessionFactory();         //this sessionfactory stores all the session(data)	
//    
////    	Session session=factory.openSession();
//    	Transaction tx=session.beginTransaction();
//   
//    

//   	
// 	Student s=new Student();
//			s.setId(6);
//			s.setStudname("Rohit");
//			s.setAddress("navi mumbai");
//			
//			
//			session.save(s);
//			tx.commit();
//			session.close();
    	
    	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();      //this line we use to write 3 line step in one word
	Student s=new Student();
	s.setId(6);
	s.setStudname("Rohit");
	s.setAddress("navi mumbai");
	
	Session session=factory.openSession();   
	
	
//	session.beginTransaction();   //it is use to start transcation(means start process to add data physically)
//	session.save(s); // it will save our student object
//	session.getTransaction().commit(); // it use to get that physical data and commit it.
//	in 3 line se ache ham
	
	Transaction tx=session.beginTransaction();     //transcation jab ho rahtah ham tabhi use boldiya ki session save krlo
	session.save(s);      //student object save
	tx.commit();          //jo bhi data aya use commit kridya
	session.close();  //it close the session
	
	
    	System.out.println(factory.isClosed()); //it gives booleam value
	System.out.println(s);    //by using toString ,constructor,superclass we can print the data what we entered

				
			
    }	
}

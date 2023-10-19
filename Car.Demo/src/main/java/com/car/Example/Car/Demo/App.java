package com.car.Example.Car.Demo;

//packages imported
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
    	Configuration cfg=new Configuration();  //this line is used for configuration
    	cfg.configure("hibernate.cfg.xml");        //xml file added
    	SessionFactory factory=cfg.buildSessionFactory();   //it is used to create and manage  session instances
    	Session session=factory.openSession();        //this line opens a new hibernate session
    	Transaction tx=session.beginTransaction();       // this line starts a new database transcation using the current session
    	
    	
    	Car c=new Car();       //class object created
    	
    	
    		c.setCarName("Brezza");   //values set
    	c.setCost(35000.00);
    	c.setId(8);
    	
    	session.save(c);         //this line save the session
        tx.commit();         //this line commit the transcation
        session.close();         //this line close the session
    	
        
    }
}

//Q.1)Create Student and Course Entity to show one to Many and Many to one mapping.

package com.One_to_Many.onetomany2;          


//import package
import org.hibernate.Session;                
import org.hibernate.SessionFactory;

import com.One_to_Many.onetomany2_Entity.Course;
import com.One_to_Many.onetomany2_Entity.Student;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 SessionFactory sessionfactory=HibernateUtil.getSessionFactory();          //getting session from HibernateUtil
    	 Session session=sessionfactory.openSession();          //Opening the session
    	 
    	 try {
    		 
    		 Course course=new Course();            //create Course class first object
    		 course.setName("Azure");               //setting Name of the course
    		 
    		 Course course2=new Course();          //create Course class second object
    		 course2.setName("Aws");               //setting Name of the course
    		 
    		 
    		 Student stud=new Student();           //Create Student class first object
    		 stud.setName("Kiran");                //setting Name of the student
    		 stud.setCourse(course);               //setting name of the course
    		 
    		 Student stud2=new Student();          //Create Student class first object
    		 stud.setName("Rohit");                //setting Name of the student
    		 stud.setCourse(course2);              //setting name of the course
    		 
    		  
    		 course.getStud().add(stud);           //adding the student data in the course
    		 course.getStud().add(stud2);          
    		 
    		 session.beginTransaction();           //it starts a new database transcation using the current session
    		 session.save(course);                 //Save the session
    		 session.save(course2);
    		 session.getTransaction().commit();     //this line gets the transcation(Database) and then commit
    		 
    				 

			
		} finally {
			
			session.close();                 //close the session
			sessionfactory.close();          //close the sessionfactory
			
		} 
			// TODO: handle exception
		
       
    }
}

package Com.Crud.Operation2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import Com.util.HibernateUtil;

import Com.Entity.Student;


//This class is used for retrieve the record in the table
public class Retrieve {
	public static void main(String args[]) {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session ses=HibernateUtil.getSession();
		
		try {
			ses.beginTransaction();
			Student s=ses.get(Student.class, 5);         //declared Student class 5th row
			System.out.println("Student with id 5 info:"+s);     //it will show the 5th row student dat
		
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

}

}

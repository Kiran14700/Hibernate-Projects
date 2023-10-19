//Q.2)WAP to perform CRUD operation to save your Project Entity


package Com.Crud.Operation2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Com.Entity.Student;
import Com.util.HibernateUtil;


//This class delete record from table 
public class Delete {
	public static void main(String args[]) {

	SessionFactory factory=HibernateUtil.getSessionFactory();
	Session ses=HibernateUtil.getSession();
	
	try {
		ses.beginTransaction();
		Student s=ses.get(Student.class, 2);     //declare the student class of row 2
		ses.delete(s);  //this will remove the record from table
		
		ses.getTransaction().commit();         //Transcation get the database and commit
		
		
	
	}
	catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}

}
}

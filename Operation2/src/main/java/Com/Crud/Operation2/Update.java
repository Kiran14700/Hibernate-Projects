package Com.Crud.Operation2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Com.Entity.Student;
import Com.util.HibernateUtil;


//this class Will update the data in the table
public class Update {
	public static void main(String args[]) {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session ses=HibernateUtil.getSession();
		
		try {
			ses.beginTransaction();
		Student s=ses.get(Student.class, 2);      //select the data from the student class of second row
			s.setL_name("Waghmare");              //Update the last name
			
			ses.getTransaction().commit();
			
			
		
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

}


}

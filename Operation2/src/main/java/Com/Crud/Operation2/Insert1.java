package Com.Crud.Operation2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Com.Entity.Student;
import Com.util.HibernateUtil;



//This class insert the records on the table
public class Insert1 {

	public static void main(String[] args) {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session ses=HibernateUtil.getSession();
		
		try {
            ses.beginTransaction();
            Student s1=new Student("Kiran","Dhumal",14);          //Create object of class and declare data of the students
            Student s2=new Student("Rohit","Sharma",15);
            Student s3=new Student("Khushal","Gupta",16);
            Student s4=new Student("Siddhesh","Sonawane",17);
            Student s5=new Student("Rohit","Masal",18);
            ses.save(s1);                                        //Saving the object in session
            ses.save(s2);
            ses.save(s3);
            ses.save(s4);
            ses.save(s5);
            ses.getTransaction().commit();                //transcation get the database and commit
            		
			
		}
		catch (Exception e){
			e.printStackTrace();
			
		}

	}

}

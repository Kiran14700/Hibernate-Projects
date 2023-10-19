package Com.Entity;

//Packages imported
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity                        
@Table(name = "StudTab")      //it will create StudTab table in the database
public class Student {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="StudentID")    //First column name declared 
	private int id;
	@Column(name ="FirstName" )  //second  column name declared 
	private String f_name;
	@Column(name = "LastName")   //Third column name declared 
	private String l_name; 	
	@Column(name = "RollNo")     //Fourth column name declared 
	private int roll_no;
	
	
	
	
	public Student( String f_name, String l_name, int roll_no) {
		super();

		this.f_name = f_name;
		this.l_name = l_name;
		this.roll_no = roll_no;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", f_name=" + f_name + ","
				+ " l_name=" + l_name + ", roll_no=" 
				+ roll_no + "]";
	}
	

}

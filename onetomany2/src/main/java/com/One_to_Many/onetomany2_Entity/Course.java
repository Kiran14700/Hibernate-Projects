package com.One_to_Many.onetomany2_Entity;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course")             //it create table name course in the database
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Course_ID")	     //First column name Course_id
	private int id;
	@Column(name = "Course_Name")     //Second column name Course_Name
	private String name;
	@OneToMany(mappedBy = "course",cascade = CascadeType.ALL)       //this line mapped the course and student
	private List<Student> stud=new ArrayList<>();
	
	public Course(int id, String name, List<Student> stud) {
		super();
		this.id = id;
		this.name = name;
		this.stud = stud;
	}
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStud() {
		return stud;
	}
	public void setStud(List<Student> stud) {
		this.stud = stud;
	}
	
	

}

package ie.gmit.studentmanager;

import java.util.*; //for date obj

public class Student {
	private String studentId;
	private String name;
	private int age;
	private Date DOB;
	
	//constructor
	public Student(String studentId, String name, int age, Date DOB) {
		this.studentId=studentId;
		this.name=name;
		this.age=age;
		this.DOB=DOB;
	}
	
	//name setter & getter
	public String getStudentId() {
		return studentId;
	}
		
	public void setStudentId(String studentId) {
		this.studentId=studentId;
	}
	
	//name setter & getter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	//age setter & getter
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}

	
	//DOB setter & getter
	public Date getDOB() {
		return DOB;
	}
	
	public void setDOB(Date DOB) {
		this.DOB=DOB;
	}
}

package ie.gmit.studentmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentManager {
	 //set initial capacity constant for array
	//private static final int INITIAL_CAPACITY = 10;
	
	//array to hold student objects
	//private Student[] students = null;
	//create array list called studentsAL
	List<Student> studentsAL;

	//constructor
	public StudentManager() {
		studentsAL = new ArrayList<Student>();
	}
	
	//create methods may need & stub them out
	public boolean add(Student student) {
		return studentsAL.add(student);
	}
	
	public boolean delete(String sid) {
		//Student studentAL = getStudentByID(sid);
		//if(student != null)
		return false;
	}
	
	//public Student getStudentByID(String sid) {
		//for(Student student: studentsAL) {
			
		//}
	//}
	
	public Student[] getStudentByFirstName(String firstName) {
		return null;
	}
	
	public int findTotalStudents() {
		return -1;
	}
	
}

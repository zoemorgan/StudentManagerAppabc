package ie.gmit.studentmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentManager {
	
	//create array list called studentsAL
	List<Student> students;

	//constructor
	public StudentManager() {
		students = new ArrayList<Student>();
	}
	
	//create methods may need & stub them out
	public boolean add(Student student) {
		try {
			return students.add(student);
		} catch(Exception error) {
			error.printStackTrace();
			return false;
		}
	}
	
	public boolean delete(String sid) {
		//search for student by id
		Student student = getStudentByID(sid);
		//If student was found then delete the student
		if(student!=null) {
			return students.remove(student);
		} else {
			//if no student is found return false
			return false;
		}
	}
	
	private Student getStudentByID(String sid) {
		//loop over array list
		//for student type elements in the student arraylist do
		for(Student student: students) {
			//no need to check for null as Array list is dynamic and 
			if(student.getStudentId().equals(sid)) {
				return student;
			}
		}
		//return null if sid was not found
		return null;
	}
	
	public List<Student> getStudentsByFirstName(String fname) {
		//create a new array list ot hold students with the same names
		List<Student> sameNames = new ArrayList<Student>();
		
		//loop over array list
		//for student type elements in the students array list do
		for(Student student: students) {
			//if i find a student with the given first name then add to list
			if(student.getFirstName().equalsIgnoreCase(fname)) {
				sameNames.add(student);
			}
		}
		
		//check if list has any students
		if(sameNames.size()>0) {
			//if students were found then return the list
			return sameNames;
		}
		
		//if no students were found with that first name then return null
		return null;
	}
			
	
	
	public int findTotalStudents() {
		//returns current number of students in the array list
		return students.size();
	}
	
}

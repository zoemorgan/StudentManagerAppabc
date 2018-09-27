package ie.gmit.studentmanager;

public class StudentManager {
	 //set initial capacity constant for array
	private static final int INITIAL_CAPACITY = 10;
	
	//array to hold student objects
	private Student[] students = null;
	
	//constructor
	public StudentManager() {
		students = new Student[INITIAL_CAPACITY];
	}
	
	//create methods may need & stub them out
	public boolean add(Student student) {
		return false;
	}
	
	public boolean delete(String studentId) {
		return false;
	}
	
	public Student[] getStudentByFirstName(String firstName) {
		return null;
	}
	
	public int findTotalStudents() {
		return -1;
	}
}

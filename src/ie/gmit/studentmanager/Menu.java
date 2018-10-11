package ie.gmit.studentmanager;
import java.util.*; //needed for scanner

public class Menu {
	private Scanner userInput;
	private StudentManager sm;
	private boolean keepRunning = true;
	
	//create start method that displays menu of options to user
	public void start() {
		//create new scanner object in take input from user
		userInput= new Scanner(System.in);
		sm = new StudentManager();
		
		while(keepRunning) {
			//show options();
			System.out.println("#############################");
			System.out.println("#    Student Manager App   #");
			System.out.println("#############################");
			System.out.println("#(1) Add student");
			System.out.println("#(2) Delete student");
			System.out.println("#(3) Search for a student by ID");
			System.out.println("#(4) Search for a student by first name");
			System.out.println("#(5) Show total number of students");
			System.out.println("#(6) Quit");
			System.out.println("Select an option [1-6]>");
			
			int userMenuOption = userInput.nextInt();
			
			if(userMenuOption == 1) { //add
				addMenu();
			} else if (userMenuOption == 2) { // delete
				deleteMenu();
			} else if (userMenuOption == 3) { //search by id
				searchByIDMenu();
			}  else if (userMenuOption == 4) { // search by name
				searchByNameMenu();
			}  else if (userMenuOption == 5) { // show total
				totalMenu();
			} else if (userMenuOption == 6) {
				deleteMenu();
			}
			
			private void addMenu() {
				System.out.println("Enter a Student ID>");
				String sid = userInput.next();
				
				System.out.println("Enter a student first name");
				String fname = userInput.next();
				
				System.out.println("Enter a student surname");
				String sname = userInput.next();
				
				Date dob = new Date(); 
				
				Student newStudent = new Student(sid,fname,sname,dob);
				boolean result = sm.add(newStudent);
				
				if(result) {
					System.out.println("Student " + sid +" has been added successfully.");
				} else {
					System.out.println("ERROR");
				}
				pressEnterKeyToContinue();
			}
		}
			
	}
}

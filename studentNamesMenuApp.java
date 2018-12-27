import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studentNamesMenuApp {
	
	static Scanner scanner = new Scanner(System.in);
	static List<String> students = new ArrayList<String>();
	static int choice = 0;
	
	public static void main(String[] args) {

		
		while (choice != -1) {
			
			showMenu();
			System.out.print("User Selection: ");
			choice = getUserChoice();
			
			if (choice == 1) {
				printStudentNames();
			} else if (choice == 2) {
				addNewStudent();
			} else if (choice == 3) {
				deleteStudent();
			} else if (choice == 4) {
				System.out.println("Goodbye!");
				exit();
			} else {
				System.out.println("Please select a valid option!");
			}
		}
		
	}
	
	public static void showMenu() {
		System.out.println("1) Print Student Names");
		System.out.println("2) Add New Student");
		System.out.println("3) Delete Student at Position");
		System.out.println("4) Exit");
		System.out.println("---------------------------------");
	}
	
	public static int getUserChoice() {
		return scanner.nextInt();
	}
	
	public static void printStudentNames() {
		for (String student : students) {
			System.out.println(student);
		}
	}
	
	public static void addNewStudent() {
		System.out.print("Enter the name you woul dlike to add: ");
		String name = scanner.next();
		students.add(name);
		System.out.println("Student added!");
	}
	
	public static void deleteStudent() {
		System.out.print("Enter student to delete: ");
		String name = scanner.next();
		students.remove(name);
	}
	
	public static void exit() {
		choice = -1;
	}

}

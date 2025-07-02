import java.util.Scanner;

class Employee{
	//Fields 
	private String name; 
	private int empid; 
	private double salary; 
	//methods 
	public void acceptRecord( ) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Name : ");
		name = sc.nextLine();
		System.out.print("Empid : ");
		empid = sc.nextInt(); 
		System.out.print("Salary : ");
		salary = sc.nextDouble(); 
	}
	public void printRecord( ) {
		System.out.println("Name : "+name);
		System.out.println("Empid : "+empid);
		System.out.println("Salary : "+salary);
	}
}
public class Program {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(); 
		Employee emp2 = new Employee(); 
		Employee emp3 = new Employee(); 
		//emp1 , emp2 , emp3 -> references 
	}
	public static void main1(String[] args) {
		Employee emp = new Employee();
		// new Employee => Object instance 
		// emp => Object reference
		emp.acceptRecord();
		emp.printRecord();
	}
}



import java.util.Scanner;

class Employee{
	//Fields 
	private String name; 
	private int empid; 
	private double salary; 
	//methods 
	//this = emp 
	public void acceptRecord( ) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Name : ");
		this.name = sc.nextLine();
		System.out.print("Empid : ");
		this.empid = sc.nextInt(); 
		System.out.print("Salary : ");
		this.salary = sc.nextDouble(); 
	}
	//this = emp 
	public void printRecord( ) {
		System.out.println("Name : "+this.name);
		System.out.println("Empid : "+this.empid);
		System.out.println("Salary : "+this.salary);
	}
}
public class Program {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.acceptRecord(); //emp.acceptRecord(emp); 
		emp.printRecord();// emp.printRecord(emp);
	}
}



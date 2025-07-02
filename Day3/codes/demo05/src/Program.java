

class Person{
	private String name; 
	private int age; 
	public Person() {
		this("Aditya", 31); //constructor chaining 
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void printRecord( ) {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
	}
	
}


public class Program {

	public static void main(String[] args) {
		Person p = new Person(); 
		p.printRecord();
	}

}

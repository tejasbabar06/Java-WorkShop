package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		Chair c1 = new Chair(30, 40);
		Chair c2 = new Chair(50, 60);
		
		//c1.display();
		//c2.display();
		
		//Chair.price = 1000; //private fields are not accessible outside the class 
		Chair.setPrice(1000);
		
		//c1.display();
		//c2.display();
		
		System.out.println("Updated Price : "+Chair.getPrice());
	}

}

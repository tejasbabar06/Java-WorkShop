package com.sunbeam;

public class Program {
	
	static int x = 10; 
	public static void main(String[] args) {
		//static int x = 10; //NOT OK (should be there inside class scope) 
		Chair c1 = new Chair(10, 20); 
		c1.display();
	}
}

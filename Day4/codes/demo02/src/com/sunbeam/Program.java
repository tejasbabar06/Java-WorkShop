package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		Human[] arr = new Human[4]; 
		
//		Human[] arr = {
//				new Human(31, 69, 172),
//				new Human(31, 69, 172),
//				new Human(31, 69, 172),
//				new Human(31, 69, 172),
//				
//		}; 
		
		arr[0] = new Human(31, 69, 172); 
		arr[1] = new Human(32, 71, 173); 
		arr[2] = new Human(33, 55, 150); 
		arr[3] = new Human(34, 75, 180); 
		
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].display();
		}
	}

}

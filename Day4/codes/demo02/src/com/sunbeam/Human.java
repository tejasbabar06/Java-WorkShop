package com.sunbeam;

public class Human {
	private int age , weight , height; 
	public Human() {
		// TODO Auto-generated constructor stub
	}
	public Human(int age, int weight, int height) {
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	//getters and setters 
	
	public void display( ) {
		System.out.printf("Age : %d Weight : %d height : %d\n",age,weight,height);
	}
	
}

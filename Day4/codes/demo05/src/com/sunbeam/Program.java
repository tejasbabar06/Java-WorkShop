package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		Circle c1 = new Circle(3.1); 
		
		//System.out.println("Area : "+c1.calcArea());
		//System.out.println("Peri : "+c1.calcPeri());
		
		//double rad = 5.1; 
		//c1.setRadius(rad);
		
		final Circle c2 = new Circle(4.1); //reference is final 
		System.out.println("Area : "+c2.calcArea());
		System.out.println("Peri : "+c2.calcPeri());
		c2.setRadius(6.1);
		
		//c2 = null; // we cannot modify reference is final 
		
		final int x = 10; // final local variable 
		
		//x = 20; // NOT OK ( final field once init cannot be modified)  
	}

}

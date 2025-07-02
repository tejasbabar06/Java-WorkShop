package com.sunbeam;
/* final field can be initialized using field initializer, obj initializer, or constructor.
 * Once initialized, it cannot be modified again.
 * However, final fields must be initialized (in any of the above options). 
 * If not, compiler raise error.
 */ 
public class Circle {
	private double radius; 
	private final double PI = 3.14; // field init   ( final field)  
	
	{
		//PI = 3.14; // Object init / instance init  
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle() {
		//PI = 3.14; 
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getPI() {
		return PI;
	}
	public double calcArea( ) {
		return PI * this.radius * this.radius; 
	}
	public double calcPeri( ) {
		return 2 * PI * this.radius; 
	}
}

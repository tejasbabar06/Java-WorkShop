package com.sunbeam;

public class Chair {
	private int weight , height; 
	private static int price = 500; // field init 
	
	public Chair() {
		// TODO Auto-generated constructor stub
	}

	public Chair(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}
	
	public static int getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		Chair.price = price;
	}

	public void display( ) {
		System.out.printf("Weight : %d Height : %d Price : %d\n",this.weight,this.height,Chair.price);
	}
	
}

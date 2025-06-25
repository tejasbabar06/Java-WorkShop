package com.dkte;

public class Patterns {

	public static void main(String[] args) {
		int starCount = 1;
		for(int i=0;i<5;i++) {
			for(int j=0;j<starCount;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
			starCount ++;
		}
	}
}


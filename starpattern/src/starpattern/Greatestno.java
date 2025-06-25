package starpattern;

import java.util.Scanner;

public class Greatestno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	
		System.out.print("Enter first number: ");
		int a = sc.nextInt();

		System.out.print("Enter second number: ");
		int b = sc.nextInt();

		System.out.print("Enter third number: ");
		int c = sc.nextInt();

		int greatest;

		if (a >= b && a >= c) {
			greatest = a;
		} else if (b >= a && b >= c) {
			greatest = b;
		} else {
			greatest = c;
		}

		System.out.println("The greatest number is: " + greatest);
		
		sc.close();
	}
}

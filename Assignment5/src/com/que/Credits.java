package com.que;

import java.util.Scanner;
public class Credits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number : ");
		int acc_num = sc.nextInt();
		
		System.out.print("Enter balance at the beginning of the month : ");
		double beginning_bal = sc.nextDouble();
		
		System.out.print("Enter total of all items charged by the customer this month : ");
		double charges = sc.nextDouble();
		
		System.out.print("Enter total of all credits applied to the customer’s account this month : ");
		double credits = sc.nextDouble();
		
		System.out.print("Enter the allowed credit limit : ");
		double limit = sc.nextDouble();
		
		double new_balance = beginning_bal + charges -credits ;
		
		if(new_balance > limit) 
			System.out.println("Credit limit exceeded");
		else
			System.out.println("New Balance : " + new_balance);
		
	}
}
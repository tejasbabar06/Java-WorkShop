package com.ques2;

public class Program {

	public static void main(String[] args) {
		String original = "DOG";
		String reversed = "";
		
		for(int i=original.length()-1; i >= 0; i--) {
			reversed += original.charAt(i);
		}
		
		System.out.println(" Reverse String : " + reversed);

	}

}

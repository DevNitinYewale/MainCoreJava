package com.conditionalStatements;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: "); 
		int number=sc.nextInt();
		
		if(number>0) {
			if(number%2==0) {
				System.out.println("Number is Even");
			}
			else{
				System.out.println("Number is Odd");
			}
		}
		else if(number==0) {
			System.out.println("Number is Zero");
		}
		else {
			System.out.println("Number is Negative");
		}
		
		sc.close();
	}

}

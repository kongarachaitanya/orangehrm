package javaexamples1;

import java.util.Scanner;

public class NumberFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter number:");
		int number = sc.nextInt();
		
		/*
		* Factorial of any number is! n.
		* For example, factorial of 4 is 4*3*2*1.
		*/
		int factorial = number;
		
		
		for(int i =(number - 1); i > 1; i--)
		{
			factorial= factorial *i;
			
		}
		System.out.println("factorial="+factorial);
	}

}

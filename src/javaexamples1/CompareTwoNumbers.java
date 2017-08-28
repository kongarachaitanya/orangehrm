package javaexamples1;

import java.util.Scanner;

public class CompareTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1 > num2)
		{
			System.out.println(num1 + " is greater than " + num2);
			}
		
			else if(num1 < num2)
			{System.out.println(num1 + " is less than " + num2);
			}
		
			else{
			System.out.println(num1 + " is equal to " + num2);
			}
			

	}

}

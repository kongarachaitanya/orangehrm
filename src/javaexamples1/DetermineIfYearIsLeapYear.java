package javaexamples1;

import java.util.Scanner;

public class DetermineIfYearIsLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter numbers:");
		int year = sc.nextInt();
		if(year % 4 == 0) 
		System.out.println("Year " + year + " is a leap year");
		else
		System.out.println("Year " + year + " is not a leap year");
		}
		

	

}

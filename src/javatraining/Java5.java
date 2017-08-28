package javatraining;

import java.util.Scanner;

public class Java5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the value:");
		int a= sc.nextInt();
		if (a%2==0) 
		{
		System.out.println("even");	
		}else
			System.out.println("odd");	

		Scanner sc1= new Scanner(System.in);
		System.out.println("please enter the value:");
		int a1= sc1.nextInt();
		if (a1%5==0) 
		{
		System.out.println("multiple");	
		}else
			System.out.println("not");	

	}

}

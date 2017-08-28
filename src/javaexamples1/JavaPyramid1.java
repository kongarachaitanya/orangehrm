package javaexamples1;

import java.util.Scanner;

public class JavaPyramid1 {

	public static void main(String[] args) 

		{Scanner sc= new Scanner(System.in);
		System.out.println("please enter numbers:");
		int t = sc.nextInt();
		
				
		for(int i=0; i<t ;i++){
			for(int k=0;k<t-i;k++)
			{
				System.out.print(" ");}
			for(int j=0; j < i; j++){
			System.out.print(" * ");
			}
			//generate a new line
			System.out.println("");
		
		}
		
	}}

	
	
	
	/*for(int i=1;i<= 5;i++){
		for(int j=0; j < i; j++){
			System.out.println("*");
		}
		
		System.out.println("");*/
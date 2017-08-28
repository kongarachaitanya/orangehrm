package javatraining;

import java.util.Scanner;

public class Array1 {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		String []arr= new String[2];
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter array:");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.next();
			
		}
		System.out.println("Result:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		

	}

}

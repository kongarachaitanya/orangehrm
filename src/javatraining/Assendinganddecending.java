package javatraining;

import java.util.Arrays;
import java.util.Scanner;

public class Assendinganddecending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*int[] ary = {1,2,3,4,5,6};
	      int[] ary1 = {1,2,3,4,5,6};
	      int[] ary2 = {1,2,3,4};
	      
	      System.out.println("Is array 1 equal to array 2?? "
	      +Arrays.equals(ary, ary1));
	      
	      System.out.println("Is array 1 equal to array 3?? "
	      +Arrays.equals(ary, ary2));*/
		
		int[] num;
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Sort an Array");
		
		System.out.println("Enter 'n' value :");
		n = Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter the numbers :");
		num = new int[n];
		
		for(int i=0; i<n; i++) {
			
			num[i] = Integer.parseInt(scan.nextLine());
		}
	
	   
	
{
	
	System.out.println("Before Sorting");
	
	for(int i=0; i<n; i++) {
		
		System.out.print(" " + num[i]);
	}
	
	Arrays.sort(num);
	
	System.out.println("After Sorting");
	
	System.out.println("Ascending Order");
	
	for(int i=0; i<n; i++) {
		
		System.out.println(" " + num[i]);
	}
	
	System.out.println("Descending Order");

	for(int i=n-1; i>=0; i--) {
		
		System.out.print(" " + num[i]);
	}
}}}


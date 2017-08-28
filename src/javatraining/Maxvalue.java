package javatraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Maxvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*int[] a= new int[3];
	a[0]=10;
	a[1]=120;
	a[2]=100;
	Arrays.sort(a);
	
	
	for (int j = 0; j < a.length; j++) {
		
		System.out.println(a[j]);
		*/
		    int[] arr = new int[] { 6, 8, 7, 4, 312, 78, 54, 9, 12, 100, 89, 74 };

		    for (int i = 0; i < arr.length; i++) {
		     
		    	for (int j = i + 1; j < arr.length; j++) {
		            int tmp = 0;
		        
		            if (arr[i] > arr[j]) {
		                tmp = arr[i];
		                arr[i] = arr[j];
		                arr[j] = tmp;
		               
		            }
		          
		}   System.out.println(arr[i]);
		
	}
	
	
		 
			
			
			
		
		
	}
	}

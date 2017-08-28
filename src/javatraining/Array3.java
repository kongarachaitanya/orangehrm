package javatraining;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []cities= new String[2];
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter array:");
		
		
		for(int i=0;i<cities.length;i++)
		{
			cities[i] = sc.next();
				
		}
		System.out.println("result:");
		for(int i=0;i<cities.length;i++)
		{
						
			System.out.println(cities[i]);
		}
		
	}

}

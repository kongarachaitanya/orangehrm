package javatraining;

import java.util.Scanner;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Testing masters technologies";
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter num");
		String str2= sc.next();
		
		
		if(str1.contains(str2))
		{
			System.out.println("true");
		}else{
			System.out.println("false");

		}
		
		
	}

}

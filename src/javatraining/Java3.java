package javatraining;

import java.util.Scanner;

public class Java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, temp;
	      System.out.println("Enter x and y");
	      Scanner in = new Scanner(System.in);
	 
	      x = in.nextInt();
	      y = in.nextInt();
	 
	      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	 
	      temp = x;
	      x = y;
	      y = temp;
	 
	      System.out.println("After Swapping\nx = "+x+"\ny = "+y);
		
		int a,b,temp1;
		a=10;
		b=20;
		temp1=a;
		a=b;
		b=temp1;
	      System.out.println(a);
	      System.out.println(b);

		
		
	}

}

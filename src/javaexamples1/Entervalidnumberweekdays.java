package javaexamples1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entervalidnumberweekdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	       int num = 0;
	     
	       boolean valid = false;  
	       while( !valid ) {
	      
	         System.out.print("Enter number between 1 and 7: ");
	         try {
	            num = sc.nextInt();
	            if(num >= 1 && num <= 7){
	               valid = true;
	               System.out.println(num + " is a valid number.");
	     	      switch (num) {
	     			case 1:
	     				System.out.println("SUNDAY");
	     				break;
	     			case 2:
	     				System.out.println("MONDAY");
	     				break;
	     		    case 3:
	     					System.out.println("THUSDAY");
	     					break;
	     					
	     			case 4:
	     					System.out.println("WEDNESDAY");
	     						break;
	     					
	     			case 5:
	     					System.out.println("THUSDAY");
	     							break;
	     			case 6:
	     					System.out.println("FRIDAY");
	     								break;
	     			case 7:
	     					System.out.println("SATURADAY");
	     									break;
	     	   }
	            } 
	            else {
	               System.out.println("Out of range.");
	            }
	         } 
	         catch (InputMismatchException e ) {
	            System.out.println("Not a valid number.");
	            sc.next();
	         }
	      }
	     
	      
	}}
			

	



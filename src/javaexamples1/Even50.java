package javaexamples1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Even50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//define limit
        Scanner sc= new Scanner(System.in);
        
        boolean valid = true;  
	       while( valid ) {
	    	   System.out.println("please enter number:");
       try { int a= sc.nextInt();
       System.out.println("Printing Even numbers between 1 and " + a);
    	   for(int i=1; i <= a; i++){
       
           
           // if the number is divisible by 2 then it is even
           if( i % 2 == 0){
                   System.out.print(i + " ");
                   
}}
    	   break;}
		
	 catch (InputMismatchException e ) {
        System.out.println("Not a valid number.");
        sc.next();
     }
        

}}}
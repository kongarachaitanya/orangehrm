package javatraining;

import java.util.Iterator;

public class Stringemailaddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "swapna.kongarachaitanya@gmail.com";
		// prints character at 1st location
		   System.out.println(str.charAt(19));
		          
		   // prints character at 5th location i.e white-space character
		   
		   int counter=0;
		   for (int i = 0; i < str.length(); i++) 
		   {
			   char c= str.charAt(i);
			   if(c=='a'||c=='A'||c=='c')
			   {
				   counter= counter+1;
				   			   
			   }
			
		}	System.out.println(counter);
		   	
	}

}

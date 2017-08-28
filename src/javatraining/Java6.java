package javatraining;

import java.util.Scanner;

public class Java6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the value between 1 to 7:");
		int a= sc.nextInt();
		if (a==1) {System.out.println("sunday");
			
		}
		if (a==2) {System.out.println("monday");
		
		}
					
		if (a==3) {System.out.println("tusday");
		
		}
		if (a==4) {System.out.println("wednesday");
		
		}
		if (a==5) {System.out.println("thusday");
		
		}
		if (a==6) {System.out.println("friday");
		
		}
		if (a==7) {System.out.println("saturday");
		
		}
			if(a>7){
			System.out.println("error");
		}
			if(a<=0){
				System.out.println("error");
			}
	}

}

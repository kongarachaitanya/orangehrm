package javaexamples1;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PLEASE ENTER NUMBER BETWEEN 0 TO 7");
		Scanner sc= new Scanner(System.in);
		int day= sc.nextInt();
		
		switch (day) {
		case 0:
			System.out.println("SUNDAY");
			break;
		case 1:
			System.out.println("MONDAY");
			break;
	    case 2:
				System.out.println("THUSDAY");
				break;
				
		case 3:
				System.out.println("WEDNESDAY");
					break;
				
		case 4:
				System.out.println("THUSDAY");
						break;
		case 5:
				System.out.println("FRIDAY");
							break;
		case 6:
				System.out.println("SATURADAY");
								break;
		
		default:
			System.out.println("PLEASE ENTER VALID NUMBER");
			
			
			
			}
		}

	

}

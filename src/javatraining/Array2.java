package javatraining;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[5];
Scanner sc =new Scanner(System.in);
System.out.println("please enter array:");

for(int i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
	
}
System.out.println("your values are:");
for(int i=0;i<a.length;i++)
{
	
	System.out.println(a[i]);
}
	}

}

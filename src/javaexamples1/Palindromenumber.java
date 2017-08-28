package javaexamples1;

public class Palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array of numbers to be checked
		int numbers[] = new int[]{121,13,34,11,22,54};
		//iterate through the numbers
		for(int i=0; i < numbers.length; i++){
		int number = numbers[i];
		int reversedNumber = 0;
		int temp=0;
		/*
		* If the number is equal to it's reversed number, then
		* the given number is a palindrome number.
		*
		* For ex,121 is a palindrome number while 12 is not.
		*/
		//reverse the number
		while(number > 0){
		temp = number % 10;
		number = number / 10;
		reversedNumber = reversedNumber * 10 + temp;
		}
		if(numbers[i] == reversedNumber)
		System.out.println(numbers[i] + " is a palindrome");
		else
		System.out.println(numbers[i] + " not a palindrome ");
		}
		}
		}


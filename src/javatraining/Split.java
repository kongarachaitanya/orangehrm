package javatraining;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "Testing masters technology";
		String[] arr= str1.split(" ");
		System.out.println(arr.length);
		for (String s : arr) {
			
			System.out.println(s);	
			
		}
		}

}

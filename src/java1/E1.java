package java1;

public class E1 {

	
		// TODO Auto-generated method stub
		public static String generateOTP() {
			int randomPin   =(int)(Math.random()*9000)+1000;
			String otp  =String.valueOf(randomPin);
			return otp;
		}
	   
		public static void main(String[] args) {
			String otpSting  =generateOTP();
			System.out.println("OTP : "+otpSting);
		
		}
	}



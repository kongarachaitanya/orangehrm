package TestNG;


import java.util.concurrent.Callable;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.CaptureScreenshotToString;

import orangehrm.Autoit;

public class TestNG1 {
	@BeforeMethod
	public  void m1(){
		System.out.println("Before method");
	}
	@Test
	public  void tc1(){
		int a,b,c;
		a=1; b=3;c=a+b;
		System.out.println("tc1 method value=" +" "+c);
		
	}
	
	@Test
	public  void tc2(){int c=3;
		System.out.println("tc2 method" +" "  +c);
		
	}
	
	
	@AfterMethod
	public  void m2(){
		System.out.println("After method");
	}

}

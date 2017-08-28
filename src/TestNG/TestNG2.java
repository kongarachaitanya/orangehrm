package TestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javatraining.Array1;
import orangehrm.Autoit;


	public class TestNG2 {
		private WebDriver driver;
		@BeforeMethod
		public  void m1(){
		//	driver=new FirefoxDriver();
			System.out.println("BEFORE METHOD");
		}
	/*	@Test
		public  void tc1_hrm(){
			driver.get("http://www.testingmasters.com/hrm");
			String actualtitle= driver.getTitle();
			Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));			
			System.out.println("HRM  page opened successfully");
		    driver.findElement(By.id("txtUsername")).sendKeys("user02");
		    driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		    driver.findElement(By.id("btnLogin")).click();
		    driver.findElement(By.id("welcome")).click();
		    String a= driver.getTitle();
		    driver.findElement(By.linkText("Logout")).click();
			System.out.println(a);

		
		}
		@Test
		public  void tc2_hrm(){
			driver.get("http://www.testingmasters.com/hrm");
			String actualtitle= driver.getTitle();
			Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));			
			System.out.println("HRM  page opened successfully");
		    driver.findElement(By.id("txtUsename")).sendKeys("user01");//user 2
		    driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		    driver.findElement(By.id("btnLogin")).click();
		    driver.findElement(By.id("welcome")).click();
		    driver.findElement(By.linkText("Logout")).click();
			System.out.println("HRM  page opened successfully");

		
		}*/
		@Test
		public void tc3_hrm() throws Exception{
			
	
		}
		
		
		@AfterMethod
		public  void m2(){
			System.out.println("AFTER METHOD");
			driver.quit();
		}

}

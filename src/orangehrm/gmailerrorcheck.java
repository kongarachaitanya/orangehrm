package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class gmailerrorcheck {
	@Test

	public void gmail(){

	
		

		WebDriver driver= new FirefoxDriver();
		driver.get( "http://www.gmail.com");
	    driver.findElement(By.xpath(".//*[@id='next']")).click();
	
	    
	    String actual_error= driver.findElement(By.xpath(".//[@id='errormsg_0_Email']")).getText();
	    String expected_error="Please enter your email.";
	    Assert.assertEquals(actual_error, expected_error);
	    Assert.assertTrue(actual_error.contains("Please enter your email"));
	    
	    
	}


}

package orangehrm;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Capturingappscreenshot {
	public static void main(String[]args) throws Exception{
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.facebook.com/");
		try {
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("mail")).sendKeys("kongarachaitanya@gmail.com");
			
		} catch (Exception e) {
System.out.println("NOT FOUND");	
getscreenshot(driver);
		}
finally {
	driver.quit();
}

}

	private static void getscreenshot(WebDriver d) throws Exception
	{
		
		File screenshot =((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C://Users/chaitanya/Desktop/screen.jpg"));
		
		System.out.println(" SCREEN IS CAPTURED AND STORED IN DESKTOP:");	

	}
		
	}



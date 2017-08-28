package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javatraining.Contains;

public class VerifyTextxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.facebook.com");
		//String exptext= "Create an account";
		boolean b= false;
		try{
			driver.findElement(By.xpath("//span[contains(text(),'Create an account')]"));
			b= true;
		}catch(Exception e)
		{
			System.out.println("text not displayed in page");
		}
finally {
	driver.quit();
}
		if (b) {
			System.out.println("text  displayed in page");

		}
	}

}

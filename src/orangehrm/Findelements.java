package orangehrm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Findelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver= new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		List<WebElement>gender= driver.findElements(By.name("sex"));
		gender.get(0).click();
		
		//display alllinks in webpage
	List<WebElement>links= driver .findElements(By.tagName("a"));
	int n= links.size();
	System.out.println(n);
	for(int i=0;i<n;i++)
	{
		String txt= links.get(i).getText();
		System.out.println(txt);
		
		
	}
	
	}

}

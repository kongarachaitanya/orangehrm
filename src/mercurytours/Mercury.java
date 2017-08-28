package mercurytours;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Mercury {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		List<WebElement>trip =driver.findElements(By.name("tripType"));
		trip.get(0).click();
		
	    new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Frankfurt");
	    new Select(driver.findElement(By.name("fromMonth"))).selectByVisibleText("January");
	    new Select(driver.findElement(By.name("fromDay"))).selectByVisibleText("23");
	    new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("Paris");
	    new Select(driver.findElement(By.name("toDay"))).selectByVisibleText("17");
	    
	    List<WebElement>serv=driver.findElements(By.name("servClass"));
	    serv.get(1).click();
	    driver.findElement(By.name("findFlights"));
	    Thread.sleep(2000);
	  List<WebElement> clss  =driver.findElements(By.className("frame_action_xrows"));
	  clss.get(4).click();
	    Thread.sleep(2000);
driver.quit();
	    

	    

	    


	    
	}

}

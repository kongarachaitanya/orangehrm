package orangehrm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Workingwithwebtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm");
	    driver.findElement(By.id("txtUsername")).sendKeys("user02");
	    driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
	    driver.findElement(By.id("btnLogin")).click();
	    
	    WebElement leave= driver.findElement(By.id("menu_leave_viewLeaveModule"));
	    Actions act_obj= new Actions(driver);
	    act_obj.moveToElement(leave).build().perform();
	    driver.findElement(By.xpath("html/body/div[1]/div[2]/ul/li[1]/ul/li[2]/a")).click();
	    // webelement is used for tables
	    List<WebElement>tb1_rows= driver.findElements(By.xpath("html/body/div[1]/div[3]/div[2]/div/form/div[3]/table/tbody/tr[1]/td[1]"));
	    int r= tb1_rows.size();
	    System.out.println(r);
	    
	    List<WebElement>tb1_cols= driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr(1)/td"));
	    int c= tb1_cols.size();
	    System.out.println(c);
	    
	    
	    
		
		
		

	}

}

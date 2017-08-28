package orangehrm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Searchcalander {

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
	    driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
	    driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[1]/img")).click();
	    
	    // select by month
	    
	    WebElement month= driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]"));
	    Select month_sel= new Select(month);
	    month_sel.selectByVisibleText("Dec");
	    
	    //select by year
	    
	    WebElement year= driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[2]"));
	    Select year_sel= new Select(year);
	    year_sel.selectByVisibleText("2016");
	    
	    //select date
	    List<WebElement>rows= driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr"));
	    Boolean flag= false;
	    int r= rows.size();
	    for (int i = 1; i <=r; i++) 
	    {
		    List<WebElement>cols= driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr["+i+"]/td"));
		    int c=cols.size();
		    for (int j = 1; j <=c; j++) 
		    {WebElement cell= driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr["+i+"]/td["+j+"]"));
		    String text= cell.getText();
		   
		    if (text.contains("15")) 
		    {
		    	WebElement link= driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr["+i+"]/td["+j+"]/a"));
		    	link.click();
		    	flag=true;
		    	break;
		    				}
				
			}
		    if(flag)
		    {
		    	break;
		    }
			
		}
	    
	    
	    
	   
	}

}

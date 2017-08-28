package orangehrm;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.Close;

public class Autoit {

	public static void main (String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm");
		driver.findElement(By.id("txtUsername")).sendKeys("user02");
	    driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
	    driver.findElement(By.id("btnLogin")).click();
	   
	    WebElement myinfo= driver.findElement(By.id("menu_pim_viewMyDetails"));
	    Actions act_obj= new Actions(driver);
	    act_obj.moveToElement(myinfo).build().perform();
	    myinfo.click();
	    driver.findElement(By.id("btnAddAttachment")).click();
	    
	    driver.findElement(By.id("ufile")).click();
	    Runtime.getRuntime().exec("C:\\Users\\chaitanya\\Desktop\\DESKTOP\\uft training\\selenium\\fileupload.exe");
	    Thread.sleep(3000);
	    driver.findElement(By.id("txtAttDesc")).sendKeys("first one");
	
	    Thread.sleep(5000);
	    	  
	  //  driver.findElement(By.id("btnSaveAttachment")).click();
	    WebElement myin= driver.findElement(By.id("btnSaveAttachment"));
	    Actions act_ob= new Actions(driver);
	    act_ob.moveToElement(myin).build().perform();
	    Thread.sleep(5000);
	  myin.click();
	    driver.findElement(By.id("attachmentsCheckAll")).click();
	    driver.findElement(By.id("btnDeleteAttachment")).click();
	    Thread.sleep(5000);
	    driver.quit();
	 
       //infobox("Uploaded successfully");C:\Users\chaitanya\Desktop\scree.jpg
	  //System.out.println("uploaded");
      //  driver.close();
 	   //JOptionPane.showMessageDialog(null, "Uploaded successfully");
	    
	}

	

}

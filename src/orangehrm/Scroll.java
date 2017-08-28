package orangehrm;

import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.text.Highlighter.Highlight;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.thoughtworks.selenium.webdriven.commands.Close;

public class Scroll {

	// Start browser
	@Test
	public  void scroll() {
		 
		// Start browser
		 
		WebDriver driver=new FirefoxDriver();
		 	// Pass application URL
		 
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		// Create instance of Javascript executor
	 
		JavascriptExecutor je = (JavascriptExecutor) driver;
		//Identify the WebElement which will appear after scrolling down
		WebElement element = driver.findElement(By.xpath("html/body/div[2]/section/div[4]/div/div[1]/p[4]"));
		// now execute query which actually will scroll until that element is not appeared on page.
		 
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		// Extract the text and verify
		 
		System.out.println(element.getText());
		System.out.println(element.getTagName());
		System.out.println(driver.getTitle());


		 
		}
	}

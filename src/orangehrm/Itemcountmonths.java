package orangehrm;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Itemcountmonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:/workspace/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get( "http://www.facebook.com/");
		WebElement ele_month= driver.findElement(By.id("month"));
		List<WebElement>items= ele_month.findElements(By.tagName("option"));
		int n= items.size();
		//System.out.println(n);
		for (WebElement itm: items) {
			String str= itm.getText();
			System.out.println(str);
		}
	    
	}

}

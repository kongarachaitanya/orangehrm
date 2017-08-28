package orangehrm;

import java.util.concurrent.TimeUnit;

import org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.Wait;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("kongara");
		driver.findElement(By.name("lastname")).sendKeys("sahithi");
		driver.findElement(By.name("reg_email__")).sendKeys("konsnsis@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("konsnsis@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Kpass@123");
		WebElement day= driver.findElement(By.name("birthday_day"));
		Select sel_day= new Select(day);
		sel_day.selectByVisibleText("12");
		WebElement month= driver.findElement(By.name("birthday_month"));
		Select sel_month= new Select(month);
		sel_month.selectByVisibleText("Jun");
		WebElement year= driver.findElement(By.name("birthday_year"));
		Select sel_year= new Select(year);
		sel_year.selectByVisibleText("2000");
	  
		driver.findElement(By.id("u_0_k")).click();
		
		driver.findElement(By.name("websubmit")).click();
        driver.quit();

		
	}

}

package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DatadrivenTest {
public WebDriver driver;
@Test(dataProvider ="testdata")
public void login(String username, String password){
driver = new FirefoxDriver();
driver.get("http://www.gcrit.com/build3/admin/");
driver.findElement(By.name("username")).sendKeys(username);
driver.findElement(By.name("password")).sendKeys(password);
driver.findElement(By.id("tdb1")).click();
Assert.assertEquals("http://www.gcrit.com/build3/admin/index.php", driver.getCurrentUrl());
driver.close();
}}
package OOPS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class image {

	public static void main(String[] args) throws Exception {
WebDriver driver = new FirefoxDriver();
driver.get("https://google.com");
String Title = driver.findElement(By.id("hplogo")).getAttribute("Title");
System.out.println(Title);

driver.navigate().to("http://newtours.demoaut.com/");
driver.findElement(By.name("login")).click();

driver.navigate().to("http://www.seleniumhq.org/");
driver.findElement(By.xpath(".//*[@id='choice']/tbody/tr/td[2]/center/a/img")).click();
}}
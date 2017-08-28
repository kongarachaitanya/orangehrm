package OOPS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class button {

	public static void main(String[] args) throws Exception {
WebDriver driver = new FirefoxDriver();
    driver.get("https://gmail.com");
    WebElement button = driver.findElement(By.id("next"));
    boolean a = button.isDisplayed();
    boolean b = button.isEnabled();
  String a1= button.getAttribute("name");
  String b1=  button.getAttribute("class");
    button.click();
    System.out.println(a);
    System.out.println(b);
    System.out.println(a1);
    System.out.println(b1);
	}}
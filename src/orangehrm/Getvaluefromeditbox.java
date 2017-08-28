package orangehrm;

import org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getvaluefromeditbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*WebDriver driver= new FirefoxDriver();
		driver.get( "http://www.facebook.com/");
	    driver.findElement(By.id("email")).sendKeys("kongarachaitanya@gmail.com");
	    Thread.sleep(2000);
	    String editval= driver.findElement(By.id("email")).getAttribute("value");
	    System.out.print(editval);
*//*WebDriver driver= new FirefoxDriver();
driver.get( "http://www.facebook.com/");
String exptext= "create an account";
String pagetext= driver.getPageSource();
boolean b= pagetext.contains(exptext);
System.out.print(b);
if (b) {
	 System.out.print("Text exist on facebookpage");
}else{ System.out.print("Text not exist on facebook page");
	
}*/WebDriver driver= new FirefoxDriver();
driver.get( "http://www.facebook.com/");
boolean b= false;
try{
	driver.findElement(By.xpath("//Span[contains(text(),'Create an Account')]"));
	b=true;
}catch(Exception x){
	 System.out.print("Text exist on facebookpage");
	 
}

finally {
	
	driver.quit();
}if (b) {	 System.out.print("Text NNot exist on facebookpage");

	
}
		
		
	}

}

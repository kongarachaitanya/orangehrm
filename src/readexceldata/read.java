package readexceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class read {

	public static void main(String[] args) throws Exception {
		
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("http://www.w3.org/2010/05/video/mediaevents.html");
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		   
		 //play video
		 js .executeScript("document.getElementById(\"video\").play()");
		 Thread.sleep(5000);
		   
		 //pause playing video 
		 js .executeScript("document.getElementById(\"video\").pause()");
		   
		 //check video is paused
		 System.out.println(js .executeScript("document.getElementById(\"video\").paused"));
		   
		 js .executeScript("document.getElementById(\"video\").play()");
		   
		 // play video from starting
		 js .executeScript("document.getElementById(\"video\").currentTime=0");
		 Thread.sleep(5000);
		   
		 //reload video
		 js .executeScript("document.getElementById(\"video\").load()");
		}
		

}

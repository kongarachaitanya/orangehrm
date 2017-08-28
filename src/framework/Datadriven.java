package framework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Datadriven {

		
			public static String line;
			public static int Iteration;
			public static void main(String[] args) throws IOException {
			FileReader file = new FileReader("C:\\Users\\chaitanya\\Desktop\\DESKTOP\\8099803999.txt");
			BufferedReader br = new BufferedReader(file); 

			int count =0;
			Iteration =0;
			while ((line = br.readLine()) != null){
			count = count +1;
			if (count > 1) {
			Iteration = Iteration + 1;
			String [] InputData = line.split(", ", 2);

			WebDriver driver = new FirefoxDriver();
			driver.get("http://www.gcrit.com/build3/admin");
			driver.findElement(By.name("username")).sendKeys(InputData[0]);
			driver.findElement(By.name("password")).sendKeys(InputData[1]);
			driver.findElement(By.id("tdb1")).click();

			String url = driver.getCurrentUrl();

			if (url.equals("http://www.gcrit.com/build3/admin/index.php")){
			System.out.println("Iteration-"+Iteration+ " - Admin Login Successful - Passed");
			}
			else {
			System.out.println("Iteration-"+Iteration+ " - Admin Login Unsuccessful - Failed"); 
			}
			driver.close();
			}
			}
			file.close();
			br.close();
			}
			
	}


package javaexamples1;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Switchcasemercurytours {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("PLEASE ENTER NUMBER BETWEEN 0 TO 7");
		Scanner sc= new Scanner(System.in);
		int day= sc.nextInt();
		switch (day) {
		case 0:
			System.setProperty("webdriver.chrome.driver","E:/workspace/chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			//WebDriver driver= new FirefoxDriver();
			driver.get("http://newtours.demoaut.com/");
			driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("mercury");
			driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")).sendKeys("mercury");
			driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
			
			String title= driver.getTitle();
			System.out.println(title);
			
			List<WebElement>links= driver .findElements(By.tagName("a"));
			int n= links.size();
			System.out.println(n);
			
			Thread.sleep(2000);
			
			List<WebElement>type=driver.findElements(By.name("tripType"));
		    type.get(1).click();
		   
		    new Select(driver.findElement(By.name("fromMonth"))).selectByVisibleText("January");
		   
		    WebElement day1= driver.findElement(By.name("fromDay"));
			Select sel_day= new Select(day1);
			sel_day.selectByVisibleText("12");
			
			WebElement arri= driver.findElement(By.xpath("//select[@name='toPort']"));
			Select sel_arr= new Select(arri);
			sel_arr.selectByVisibleText("London");
		    
			WebElement arwi= driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[1]"));
			Select sel_arwi= new Select(arwi);
			sel_arwi.selectByVisibleText("July");
			
			WebElement ai= driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[2]"));
			Select sel_ai= new Select(ai);
			sel_ai.selectByVisibleText("22");
			
			List<WebElement>clj=driver.findElements(By.name("servClass"));
		    clj.get(2).click();
		    
		    WebElement cll= driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select"));
		    Select sel_cll= new Select(cll);
		    sel_cll.selectByVisibleText("Unified Airlines");
		    
		    driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")).click();
		    
			List<WebElement>vvs=driver.findElements(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input"));
					vvs.get(0).click();
					
			List<WebElement>vss		 =driver.findElements(By.name("inFlight"));
			vss.get(2).click();
			
			driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/p/input")).click();
			
			String title1= driver.getTitle();
			System.out.println(title1);
			
			List<WebElement>links1= driver .findElements(By.tagName("a"));
			int r= links1.size();
			System.out.println(r);
			
			// personal details
			
			driver.findElement(By.name("passFirst0")).sendKeys("chaitanya");
			driver.findElement(By.name("passLast0")).sendKeys("kongara");
			WebElement pass =driver.findElement(By.name("pass.0.meal"));
			Select sel_pass= new Select(pass);
			sel_pass.selectByVisibleText("Hindu");

			//credit card details
			
			new Select(driver.findElement(By.name("creditCard"))).selectByVisibleText("Visa");
			
			driver.findElement(By.name("creditnumber")).sendKeys("7321736872");
			
			new Select(driver.findElement(By.name("cc_exp_dt_mn"))).selectByVisibleText("07");
			new Select(driver.findElement(By.name("cc_exp_dt_yr"))).selectByVisibleText("2001");
			driver.findElement(By.name("cc_frst_name")).sendKeys("chaitanya");
			driver.findElement(By.name("cc_mid_name")).sendKeys("swetha");

			driver.findElement(By.name("cc_last_name")).sendKeys("kongara");
			
			//address details
			
			driver.findElement(By.name("delAddress1")).sendKeys("4-46/11/1/1 sai nagar colony");
			driver.findElement(By.name("delAddress2")).sendKeys("Ramachandra puram");
			driver.findElement(By.name("delCity")).sendKeys("hyderabad");
			driver.findElement(By.name("delState")).clear();
			driver.findElement(By.name("delState")).sendKeys("Telangana");

			driver.findElement(By.name("delZip")).clear();
			driver.findElement(By.name("delZip")).sendKeys("38299");
			
			WebElement coun= driver.findElement(By.name("billCountry"));
			Select sel_coun= new Select(coun);
			sel_coun.selectByVisibleText("INDIA");
			
			//CLICK
			
			driver.findElement(By.name("buyFlights")).click();
			
			//page name
			String title2= driver.getTitle();
			System.out.println(title2);
			
			List<WebElement>links2= driver .findElements(By.tagName("a"));
			int rl =links2.size();
			System.out.println(rl);
			
			//logout
			
		   driver.findElement(By.xpath("//img[@src='/images/forms/Logout.gif']")).click();
			
			String title21= driver.getTitle();
			System.out.println(title21);
			
			List<WebElement>links21= driver .findElements(By.tagName("a"));
			int rl1 =links21.size();
			System.out.println(rl1);
			driver.findElement(By.linkText("Home")).click();

			
			break;
		default:


			
			break;
	}

}}

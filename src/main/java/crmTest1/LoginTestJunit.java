package crmTest1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestJunit {

//@ will use instead of main method
//below we test 2 logintest we manupulate test 1 is wrong next is good
//if u go below the failure trace and mouse hover it will show where is mistake
//if u click 1st button of failure trace after 1st button fail will come all the down
	
	 WebDriver driver;
	 
	 @Before
	 public  void launchBrowser() {
			
			System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	 @Test
		public  void loginTest() throws InterruptedException {
			
		 try {
			driver.findElement(By.id("email")).sendKeys("dipen_2041karki@yahoo.com");
			driver.findElement(By.name("pass")).sendKeys("basantakarki746");
			driver.findElement(By.name("login")).click();
			
			Thread.sleep(9000);
			
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
			
		}
	 @Test
		public  void loginTest1() throws InterruptedException {
			
			driver.findElement(By.id("email2")).sendKeys("dipen_2041karki@yahoo.com");
			driver.findElement(By.name("pass")).sendKeys("basantakarki746");
			driver.findElement(By.name("login")).click();
			
			Thread.sleep(9000);
			
	 }
	 @After
		public  void tearDown() {
			
			driver.close();

			
		}

	}

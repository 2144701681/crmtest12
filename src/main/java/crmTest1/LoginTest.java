package crmTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
			
	launchBrowser();
	login();
	tearDown();
	
	}
	public static void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	public static void login() throws InterruptedException {
		
		driver.findElement(By.id("email")).sendKeys("dipen_2041karki@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("basantakarki746");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(9000);
		
	}
	public static void tearDown() {
		
		driver.close();

		
	}

}

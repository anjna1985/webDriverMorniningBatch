package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		String execu="C:\\Users\\14012\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",execu);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/facebook.html");
		WebElement emailid  = driver.findElement(By.xpath("//input[@id='email']")); //Email
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']")); //Password
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='u_0_b']")); //Login button
		
		emailid.sendKeys("anjna85");
		password.sendKeys("India");
		loginButton.click();
		
		
		
		
	//	driver.quit();
		
		
		
	}
	
	
	
	
	
}

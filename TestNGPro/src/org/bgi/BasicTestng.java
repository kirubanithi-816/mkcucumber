package org.bgi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class BasicTestng {
	static WebDriver driver1;
	
	@Parameters({"browserName"})
	@Test(priority=1)
	
	private void login(String name) {
		if (name.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\KiruSugu\\eclipse-workspace\\Kiruba\\TestNGPro\\driver\\chromedriver.exe");
			driver1=new ChromeDriver();
		}
		
		else if (name.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\KiruSugu\\eclipse-workspace\\Kiruba\\TestNGPro\\driver\\IEDriverServer.exe");
		driver1=new ChromeDriver();
		}
			
		else
		{
			System.out.println("Browser not found");
		}
	
		driver1.get("http://demo.automationtesting.in/Register.html");
	
	}
	
	
	@Test(priority=2)
	private void login() {
		WebElement username=driver1.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("Kirubanithi");
		WebElement pass=driver1.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("kiru123");
		WebElement logbtn=driver1.findElement(By.xpath("//input[@id='login']"));
		logbtn.click();
	}
	
	@AfterClass
	private void afterclass() {
	driver1.quit();

	}
	



}

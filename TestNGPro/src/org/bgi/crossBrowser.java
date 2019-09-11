package org.bgi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class crossBrowser {

	WebDriver wb=null;
	@Parameter({"ie"})
	@Test
	
	private void login(String name) {
		if (name.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\KiruSugu\\eclipse-workspace\\Kiruba\\TestNGPro\\driver\\chromedriver.exe");
			wb=new ChromeDriver();
		}
		
		else if (name.equals("ie"))
		{
			System.setProperty("webdriver.i.driver", "C:\\Users\\KiruSugu\\eclipse-workspace\\Kiruba\\TestNGPro\\driver\\IEDriverServer.exe");
			wb=new ChromeDriver();
		}
			
		else
		{
			System.out.println("Browser not found");
		}
	
		wb.get("http://demo.automationtesting.in/Register.html");
		wb.quit();
	
	}
	
	
	
	
	
	
}

package org.cucmber.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddTariff {
	static WebDriver driver;

	@Given("Open Telecom Home page")
	public void open_Telecom_Home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KiruSugu\\eclipse-workspace\\Kiruba\\cucumber\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/telecom/");
	    
	}

	@Given("Click Add Tariff button")
	public void click_Add_Tariff_button() {
		driver.findElement(By.xpath("(//a[text()='Add Tariff Plan'])[1]")).click();
	}

	@When("Enter all the fields")
	public void enter_all_the_fields() {
		  driver.findElement(By.name("rental")).sendKeys("699");
		  driver.findElement(By.name("local_minutes")).sendKeys("400");
		  driver.findElement(By.name("inter_minutes")).sendKeys("100");
		  driver.findElement(By.name("sms_pack")).sendKeys("40");
		  driver.findElement(By.name("minutes_charges")).sendKeys("10");
		  driver.findElement(By.name("inter_charges")).sendKeys("50");
		  driver.findElement(By.name("sms_charges")).sendKeys("5");
		  
	}

	@When("Click Submit button")
	public void click_Submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	@Then("Display Congrats Message")
	public void display_Congrats_Message() {
		
		WebElement congrats=driver.findElement(By.xpath("//h2[contains(text(),'Congratulation you add Tariff Plan')]"));
		Assert.assertTrue(congrats.isDisplayed());
		
	}

	
	
	
}

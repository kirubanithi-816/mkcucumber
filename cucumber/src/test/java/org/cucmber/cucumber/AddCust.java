package org.cucmber.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddCust {
	static WebDriver driver;

	@Given("telecom home page")
	public void telecom_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KiruSugu\\eclipse-workspace\\Kiruba\\cucumber\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/telecom/");		
		
	}
	

	@Given("click customber button")
	public void click_customber_button() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	
	}

	@When("enter all the fields")
	public void enter_all_the_fields() {
		 driver.findElement(By.xpath("//label[@for='done']")).click();
		    driver.findElement(By.id("fname")).sendKeys("Kirubanithi");
		    driver.findElement(By.id("lname")).sendKeys("mathi");
		    driver.findElement(By.id("email")).sendKeys("Kirubanithi@bgi.com");
		    driver.findElement(By.name("addr")).sendKeys("Panruti");
		    driver.findElement(By.id("telephoneno")).sendKeys("23242424");

	}

	@When("click submit")
	public void click_submit() {
		    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("display customer id")
	public void display_customer_id() {
	WebElement CusId=driver.findElement(By.xpath("//td[@align='center'])[2]"));
	Assert.assertTrue(CusId.isDisplayed());
	}

	
}

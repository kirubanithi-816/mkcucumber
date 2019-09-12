package org.cucmber.cucumber2;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;


public class AddCusDime {
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
	
	
	@When("enter all the fields.")
	public void enter_all_the_fields(DataTable CusData) {
		List<String> datas=CusData.asList(String.class);
		 driver.findElement(By.xpath("//label[@for='done']")).click();
		   driver.findElement(By.id("fname")).sendKeys(datas.get(0));
		    driver.findElement(By.id("lname")).sendKeys(datas.get(1));
		    driver.findElement(By.id("email")).sendKeys(datas.get(2));
		    driver.findElement(By.name("addr")).sendKeys(datas.get(3));
		    driver.findElement(By.id("telephoneno")).sendKeys(datas.get(4));
   
	}
	
	

	@When("enter all the fields..")
	public void enter_all_the_fields1(DataTable Mapsection) {
		Map<String, String> datas= Mapsection.asMap(String.class,String.class);
		 driver.findElement(By.xpath("//label[@for='done']")).click();
		   driver.findElement(By.id("fname")).sendKeys(datas.get("fname"));
		    driver.findElement(By.id("lname")).sendKeys(datas.get("lname"));
		    driver.findElement(By.id("email")).sendKeys(datas.get("email"));
		    driver.findElement(By.name("addr")).sendKeys(datas.get("address"));
		    driver.findElement(By.id("telephoneno")).sendKeys(datas.get("phno"));
   
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

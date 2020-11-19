package org.cos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {

	WebDriver driver;
	@Given("User Is On The Adaction  Page")
	public void user_Is_On_The_Adaction_Page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dorai\\eclipse-workspace\\Cucumber2\\div\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
	   
	}

	@When("User should enter the{string} and {string}")
	public void user_should_enter_the_and(String string, String string2) {
	WebElement findElement = driver.findElement(By.id("username"));
	findElement.sendKeys(string);
	
	WebElement find = driver.findElement(By.id("password"));
	find.sendKeys(string2);
	

	
	}

	@When("User should click the login btn")
	public void user_should_click_the_login_btn() {
	 
	}

	@Then("User should verify the msg")
	public void user_should_verify_the_msg() {
	  
	}

}

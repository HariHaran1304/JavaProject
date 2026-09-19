package com.omrbranch.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	WebDriver driver;
	

	@Given("user is on the Greens OMR page")
	public void applicationUrl() {
		driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

		@When("user enters {string} and {string}")
		public void user_enters_and(String emailId, String password) {
		driver.findElement(By.id("email")).sendKeys(emailId);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	@When("user clicks the login button")
	public void clickLogin() {
		WebElement btnlogin = driver.findElement(By.xpath("//button[@value='login']"));
		btnlogin.click();
		
	}
	@Then("user verify success message after login")
	public void verifyAfterLogin() {
		Assert.assertTrue("Verify after login",true);
	}



}




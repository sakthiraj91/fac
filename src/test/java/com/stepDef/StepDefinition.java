package com.stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class StepDefinition {
 public WebDriver driver;
	@Given("User login the browser")
	public void user_login_the_browser() {
	     driver=new ChromeDriver();
	     driver.get("https://www.facebook.com/login/");
	    
	}
	@Given("User enter the username and password {string} {string}")
	public void user_enter_the_username_and_password(String us, String ps) {
	   driver.findElement(By.id("email")).sendKeys(us);
	   driver.findElement(By.id("pass")).sendKeys(ps);
	}

}

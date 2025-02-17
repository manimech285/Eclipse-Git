package StepDefenitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenSaucedemo {
WebDriver driver;

@Given("Entering the saucedemo website")
public void entering_the_saucedemo_website() {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://www.saucedemo.com");
}

@When("the user entering {string} and {string}")
public void the_user_entering_and(String string, String string2) {
   driver.findElement(By.id("user-name")).sendKeys("standard_user");
   driver.findElement(By.id("password")).sendKeys("secret_sauce");
   driver.findElement(By.id("login-button")).click();
   
   
}



@Then("user should redirect to home page")
public void user_should_redirect_to_home_page() {
	System.out.println("Then Executed");
}
	
	
	
}

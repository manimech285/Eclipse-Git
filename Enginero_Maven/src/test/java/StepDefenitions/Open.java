package StepDefenitions;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.cucumber.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Open {

	WebDriver driver;
	
	@Given("user is entering google website")
	public void user_is_entering_google_website() {
		System.out.println("test cucumber");
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
	}
	@When("user clicks the search box")
	public void user_clicks_the_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}
	@Then("the user should see the results of Kholi")
	public void the_user_should_see_the_results_of_kholi() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}

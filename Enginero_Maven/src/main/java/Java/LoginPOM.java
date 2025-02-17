package Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
WebDriver driver;
	
	LoginPOM(){
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(tagName = "\\input[@id='email']")
	public WebElement username;
}

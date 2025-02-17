package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class java2 {
	
	@Test(dataProvider="SearchProvider")
	public void edge(String username,String password) {
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	
	}

	@Test
	
	public void invocation() {
		System.out.println("test");
		
		SoftAssert ass = new SoftAssert();
	//	Assert.assertEquals(false, false);
	//	Assert.assertEquals(h1.gettext(), "app made easy");
	
		ass.assertEquals(false, true);
		System.out.println("assert works");
		
	}
	
	@DataProvider(name="SearchProvider")
    public String[][] getDataFromDataprovider(){
    
	String[][] test = new String[2][2];
	test[0][0]="Krishna";
	test[0][1]="Welcome@123";
	
	test[1][0]="Sudhan";
	test[1][1]="Welcome@12345";
	
	return test;
}
}
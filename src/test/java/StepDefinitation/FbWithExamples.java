package StepDefinitation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class FbWithExamples {
	
	WebDriver driver;
	@Given("The user should be in facebook login pages")
	public void the_user_should_be_in_facebook_login_pages() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}



	@When("The user has to fill {string} and {string}")
	public void the_user_has_to_fill_and(String user, String password) {
		  driver.findElement(By.id("email")).sendKeys(user);
		  driver.findElement(By.id("pass")).sendKeys(password);
	}
	 


   


	@When("The user has to click the enter button")
	public void the_user_has_to_click_the_enter_button() {
		driver.findElement(By.name("login")).click();
	    
	}

	@Then("The user should enter the invalide login page")
	public void the_user_should_enter_the_invalide_login_page() {
		
		WebElement ast = driver.findElement(By.xpath("//a[contains(text(),'Find your account and log in.')]"));
		String text = ast.getText();
		System.out.println("Find your account and log in.");
		Assert.assertEquals("Find your account and log in.", text);
		System.out.println("__________________done___________________");
		
	   
	}

}

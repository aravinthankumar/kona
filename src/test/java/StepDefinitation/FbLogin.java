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

public class FbLogin {
	WebDriver driver;
	
	@Given("The user should be in facebook login page")
	public void the_user_should_be_in_facebook_login_page() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	 
	}

	@When("The user has to fill ibnvalid username and password")
	public void the_user_has_to_fill_ibnvalid_username_and_password() {
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("aravinthan@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("ndbhfdgfudgf");
	
	}

	@When("The user has to click login button")
	public void the_user_has_to_click_login_button() {
		driver.findElement(By.name("login")).click();
	  
	}

	@Then("The user should navigate the invalide login page")
	public void the_user_should_navigate_the_invalide_login_page() {
		
		
		 System.out.println("step1");
		WebElement v = driver.findElement(By.xpath("(//h2[contains(text(),'send you a code')])[2]"));
		String t = v.getText();
		System.out.println(t);
		 System.out.println("step2");
		 Assert.assertEquals("We'll send you a code to your email address", t);
		 System.out.println("step3");
		
    }
	}

	

	



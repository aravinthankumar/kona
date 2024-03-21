package StepDefinitation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WithDataDriven {
	WebDriver driver;
	

@Given("To user should be navigate the login page")
public void to_user_should_be_navigate_the_login_page() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
  }

@When("To user has to fill username and password")
public void to_user_has_to_fill_username_and_password(io.cucumber.datatable.DataTable dataTable) {
   List<List<String>> l = dataTable.asLists();
   System.out.println(l.get(0).get(0)+"_____________");
   
   driver.findElement(By.id("email")).sendKeys(l.get(0).get(0));
	
	
}

@When("To user has to click the login button")
public void to_user_has_to_click_the_login_button() {
}

@Then("To user should be enter the invalide login page")
public void to_user_should_be_enter_the_invalide_login_page() {

}



}

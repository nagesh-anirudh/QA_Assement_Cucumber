package testDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Steps_Sample {
	WebDriver driver;
	
	@Given("^Opencart Url is been opened$")
	public void opencart_Url_is_been_opened() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse progs\\driverserver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opencart.com");
	    
	}

	@Then("^I should see \"([^\"]*)\" as page title$")
	public void i_should_see_as_page_title(String arg1) throws Throwable {
		Assert.assertEquals(arg1, driver.getTitle());
	}

	@When("^I Click on login$")
	public void i_Click_on_login() throws Throwable {
		driver.findElement(By.cssSelector(".btn.btn-link.navbar-btn")).click();
	    
	}

	@When("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("input-email")).sendKeys(arg1);
		driver.findElement(By.id("input-password")).sendKeys(arg2);
	}

	@When("^I click on the Login Button$")
	public void i_click_on_the_Login_Button() throws Throwable {
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg hidden-xs']")).click();
	    
	}

	@Then("^I should see error message$")
	public void i_should_see_error_message() throws Throwable {
		String errorMsg = driver.findElement(By.cssSelector(".alert.alert-danger")).getText();
		System.out.println(errorMsg);
		Assert.assertEquals("No match for E-Mail and/or Password.", errorMsg.trim());
	    
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
	    driver.quit();
	    
	}
}

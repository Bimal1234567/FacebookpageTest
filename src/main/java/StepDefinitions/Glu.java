package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Glu {
	WebDriver driver;
	@Given("i open the browser using url as {string}")
	public void i_open_the_browser_using_url_as(String url) {
	    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get(url);
	}

	@Then("i should see the facebook login page")
	public void i_should_see_the_facebook_login_page() {
    boolean loginpage=  driver.findElement(By.id("content")).isDisplayed();
    System.out.println(loginpage);
	}

	@When("i enter the username as {string} and password as {string}")
	public void i_enter_the_username_as_and_password_as(String email, String pwd) {
	  driver.findElement(By.name("email")).sendKeys(email);
	  driver.findElement(By.name("pass")).sendKeys(pwd);
	}

	@And("i click the login button")
	public void i_click_the_login_button() {
		driver.findElement(By.name("login")).click();
	  	}

	@Then("i should see the homepage")
	public void i_should_see_the_homepage() {
	 boolean homepage= driver.findElement(By.xpath("//*[@aria-label='Home']")).isDisplayed();
	 System.out.println(homepage);
	}
}

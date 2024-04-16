package org.com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	public static WebDriver driver;
	
	@Before
	public void beforeMethod() {
		System.out.println("Welcome to initiate the test of adacthtotel testing");
	}
	
	@After
	public void afterMethod() {
		System.out.println("Test is done, Goodbye");
	}
	
	
	@Given("user is given to homepage")
	public void user_is_given_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User is given with site url");
	}
	@When("user logs in")
	public void user_logs_in() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("user will be able to login");
	}
	@Then("user is good to go")
	public void user_is_good_to_go() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User can use the site without any issue");
	}
	@Given("user navigate to the login page")
	public void user_navigate_to_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver =  new EdgeDriver();
	    driver.get("https://adactinhotelapp.com/");
	    driver.manage().window().maximize();
	}
	@When("user enter the correct {string} and {string}")
	public void user_enter_the_correct_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@id=\\\"username\\\"]")).sendKeys("bekenlmm");
	    driver.findElement(By.xpath("//input[@id=\\\"password\\\"]")).sendKeys("b@czzz");
	    driver.findElement(By.xpath("//input[@id=\\\"login\\\"]")).click();
	    
	}
	@Then("user should be directed to Homepage and verify the {string}")
	public void user_should_be_directed_to_homepage_and_verify_the(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(""+string+"User is navigated to the homepage");
	}
	
	@Given("user navigate to search hotel page")
	public void user_navigate_to_search_hotel_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Get ready to enter all detais");
	}
	@When("user fills all details to search the hotel")
	public void user_fills_all_details_to_search_the_hotel() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Filling all the details to search the hotel");
	}
	@Then("user should be navigated to hotel confirmation page")
	public void user_should_be_navigated_to_hotel_confirmation_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Click submit button to go to next page");
	}
}

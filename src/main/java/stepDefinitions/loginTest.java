package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import junit.framework.Assert;
import pageObjects.loginObjects;
import utility.BasePage;


public class loginTest {
	
	loginObjects lo;	
	BasePage bp;
	
	public loginTest() {
		
		//bp = new BasePage();
	}
	
	@Before("@RegressionTest")
	public void LaunchBrowser() {
		System.out.println("Browser Launch");		
	}
	
	@Given("^I have chosen to sign up$")
	public void i_have_chosen_to_sign_up() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		lo= new loginObjects();
		bp = new BasePage();
		
	}

	@When("^I sign up with valid details$")
	public void i_sign_up_with_valid_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    lo.enterDetails();
	}

	@Then("^I should navigate to Welcome page$")
	public void i_should_navigate_to_Welcome_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   Assert.assertTrue("Failed: text mismatch", bp.elementFound(lo.welcome()));
	   Assert.assertEquals(lo.welcomeText(), "Welcome to AdactIn Group of Hotels");
	}
	
	@After
	public void closeBrowser() {
		System.out.println("Close browser");
	}

}

package com.test.automation.ecommerce.test_Cases;

import com.test.automation.EcommerceApplication.commonFunctions.commonFunctions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_001_LoginApplication_ValidCeredentials {
	commonFunctions cf = new commonFunctions();
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		cf.selectBrowser("chrome");
	    
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	   	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
	   
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	   	}


}

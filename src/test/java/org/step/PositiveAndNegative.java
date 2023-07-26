package org.step;

import org.openqa.selenium.WebElement;
import org.sample.BaseClass;
import org.sample.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveAndNegative extends BaseClass{

	@Given("facebook configuration")
	public void facebook_configuration() {
		browserLaunch();
		maxWindow();
	}

	@When("To launch facebook application")
	public void to_launch_facebook_application() {
		launchUrl("https://www.facebook.com/");
	}

	@When("To pass positive and negative {string} on email field")
	public void to_pass_positive_and_negative_on_email_field(String email) {
		LoginPojo l= new LoginPojo();
	    WebElement emailTxt = l.getTxtEmail();
	    fillTextBox (emailTxt,email);
	}

	@When("To pass positive and negative {string}on password field")
	public void to_pass_positive_and_negative_on_password_field(String pass) {
		LoginPojo l= new LoginPojo();
	    WebElement passTxt = l.getTxtPass();
	    fillTextBox (passTxt,pass);
	}

	@When("To click submit button")
	public void to_click_submit_button() {
		LoginPojo l= new LoginPojo();
	    WebElement login = l.getBtnLogin();
	    login.click();
	}

	@Then("browser quit")
	public void browser_quit() {
		browserclose();
	}
	
	
	
	
	
	
	
	
	
	
}

package org.step;

import org.openqa.selenium.WebElement;
import org.sample.BaseClass;
import org.sample.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fb extends BaseClass{

	
	
	@Given("To configure Facebook application of url")
	public void to_configure_Facebook_application_of_url() {
	   browserLaunch();
	   maxWindow();
	}

	@When("To launch facebook url")
	public void to_launch_facebook_url() {
	    launchUrl("https://www.facebook.com/");
	}

	@When("To pass valid userName on email Textbox")
	public void to_pass_valid_userName_on_email_Textbox() {
		LoginPojo l= new LoginPojo();
	    WebElement emailTxt = l.getTxtEmail();
	    fillTextBox (emailTxt,"selenium123@gmail.com");
	}

	@When("To pass valid password on password Textbox")
	public void to_pass_valid_password_on_password_Textbox() {
		LoginPojo l= new LoginPojo();
	    WebElement passTxt = l.getTxtPass();
	    fillTextBox (passTxt,"123456");
	}
	@When("User have to click the login button")
	public void user_have_to_click_the_login_button() {
		LoginPojo l= new LoginPojo();
	    WebElement login = l.getBtnLogin();
	    login.click();	
	}

	@Then("close the browser")
	public void close_the_browser() {
	   browserclose();
	}

}



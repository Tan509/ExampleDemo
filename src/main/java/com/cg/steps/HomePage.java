package com.cg.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage {
	
	@Given("^user is on home page$")
	public void user_is_on_home_page() {
	
		System.out.println("Hello 1");
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password()  {
		System.out.println("Hello 2");  
	}

	@Then("^user login to contact page$")
	public void user_login_to_contact_page()  {
		System.out.println("Hello 3");
	}

}

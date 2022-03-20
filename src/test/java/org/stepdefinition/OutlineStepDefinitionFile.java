package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.pom.SouthWestPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OutlineStepDefinitionFile extends BaseClass {
	WebDriver driver;
	SouthWestPojo sw;
	@Given("launch and hit southwest url")
	public void launch_and_hit_southwest_url() {

		launch();
		loadurl("https://www.southwest.com/");
	}

	@When("pass values in{string} arrive field")
	public void pass_values_in_arrive_field(String Arrive) {

		sw= new SouthWestPojo();
		fill(sw.getArrive(), Arrive);
		
	}

	@When("pass values in {string}depart field")
	public void pass_values_in_depart_field(String Depart) {
	   sw = new SouthWestPojo();
	   fill(sw.getDeparture(), Depart);
	}

	@When("tap the search button")
	public void tap_the_search_button() {
	   sw= new SouthWestPojo();
	   buttonclick(sw.getSearchbutton());
	}

	@Then("close the browser")
	public void close_the_browser() {
	    closebrowser();
	}




}

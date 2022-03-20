package org.stepdefinition;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.pom.SouthWestPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionFile extends BaseClass{
	WebDriver driver;
	SouthWestPojo sw;
	@Given("user has launch the chrome browser and open the southwest url")
	public void user_has_launch_the_chrome_browser_and_open_the_southwest_url() {
		launch();
		loadurl("https://www.southwest.com/");
		
	}

	@When("user has to pass the valid city in departure text box")
	public void user_has_to_pass_the_valid_city_in_departure_text_box(io.cucumber.datatable.DataTable d) {
	    sw = new SouthWestPojo();
	    List<String> list = d.asList();
	    String data= list.get(1);
	    
		fill(sw.getArrive(), data);
	}

	@When("user has to pass the valid city in arrive text box")
	public void user_has_to_pass_the_valid_city_in_arrive_text_box() throws InterruptedException {
	   sw = new SouthWestPojo();
	   fill(sw.getDeparture(), "washington");
	   Thread.sleep(2000);
	}

	@When("user has click the search button")
	public void user_has_click_the_search_button() {
	   sw= new SouthWestPojo();
	   buttonclick(sw.getSearchbutton());
	}

	@Then("user has to close the browser")
	public void user_has_to_close_the_browser() {
	   closebrowser();
		
	}


}

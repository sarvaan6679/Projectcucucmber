package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SouthWestPojo extends BaseClass{
	
	public SouthWestPojo() {

		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(id="LandingAirBookingSearchForm_originationAirportCode")
	private WebElement arrive;
	
	@FindBy(id="LandingAirBookingSearchForm_destinationAirportCode")
	private WebElement departure;
	
	@FindBy(xpath="//button[@aria-label=\"Search button. In the event of an error, focus will move to the error message.\"]")
	private WebElement searchbutton;

	public WebElement getArrive() {
		return arrive;
	}

	public WebElement getDeparture() {
		return departure;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}
	

}

package com.mycompany.qa.pages;

import org.openqa.selenium.WebDriver;


public class HomePage extends PageFactoryBase {//inheritance

	
	public HomePage(WebDriver driver)
	{
		super(driver);
		
	}
	
	public boolean validateHomeButton(){
		js.highlight(homeButton, driver);
 		js.drawBorder(homeButton, driver);
 		//homeButton.click();
 		return homeButton.isDisplayed();

	}
	
	
	public MyFlightPage clickFlight() { // NavigateFlight=Return Type; clickFlight= Method
		flightButton.click();
		return new MyFlightPage(driver);
		
		
	}
	
	
	
 	}
	

	
	
	
	
	


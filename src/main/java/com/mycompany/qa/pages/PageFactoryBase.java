package com.mycompany.qa.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mycompany.qa.util.JSEHelper;

public class PageFactoryBase {
	
	//private WebDriver driver;
	protected WebDriver driver;
	JSEHelper js = new JSEHelper();
	
	
	public PageFactoryBase(WebDriver driver) 
    {
	this.driver=driver;
	PageFactory.initElements(driver, this);//@FindBy page factory kullanabilmek icin
	}
	
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	
	//PAGE FACTORY
	   	
	
		//Home Button
		@FindBy(xpath="//*[@id=\"primary-header-home\"]") 
		WebElement homeButton;
	
	
		//Flight Button
		@FindBy(xpath="//*[@id=\"tab-flight-tab-hp\"]") 
		WebElement flightButton;
		
		
		//OneWay Button
		@FindBy(xpath="//*[@id=\"flight-type-one-way-label-hp-flight\"]") 
		WebElement oneWayButton;
		
		
		//Origin Button
		@FindBy(xpath="//*[@id=\"flight-origin-hp-flight\"]") 
		WebElement originButton;
		
		//Destination Button
		@FindBy(xpath="//*[@id=\"flight-destination-hp-flight\"]") 
		WebElement destinationButton;
		
		
		//Depart Button
		@FindBy(xpath="//*[@id=\"flight-departing-single-hp-flight\"]") 
		WebElement departButton;
		
		//Adult Button
		@FindBy(xpath="//*[@id=\"flight-adults-hp-flight\"]") 
		WebElement adultButton;
		
		//Children Button
		@FindBy(xpath="//*[@id=\"flight-children-hp-flight\"]") 
		WebElement childrenButton;
		
		
		//Child One
		@FindBy(xpath="//*[@id=\"flight-age-select-1-hp-flight\"]") 
		WebElement childOne;
		
		//Child Two
		@FindBy(xpath="//*[@id=\"flight-age-select-2-hp-flight\"]") 
		WebElement childTwo;
				
		//Child Three
		@FindBy(xpath="//*[@id=\"flight-age-select-3-hp-flight\"]") 
		WebElement childThree;
				
		//Child Four
		@FindBy(xpath="//*[@id=\"flight-age-select-4-hp-flight\"]") 
		WebElement childFour;
		
		//Search Button
		@FindBy(xpath="//*[@id=\"gcw-flights-form-hp-flight\"]/div[9]/label/button") 
		WebElement search;
		
		
					
		@FindBy(xpath="//*[@id=\"typeaheadDataPlain\"]/div/li")
		List<WebElement> originListesi;
		
		@FindBy(xpath="//*[@id=\"typeaheadDataPlain\"]/div/li")
		List<WebElement> destinatonListesi;
		
		
	
		
		
	
	
	
}

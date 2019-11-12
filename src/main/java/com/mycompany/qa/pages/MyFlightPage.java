package com.mycompany.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class MyFlightPage extends PageFactoryBase {//inheritance

	
	public MyFlightPage(WebDriver driver)
	{
		super(driver);
		
	}
	
			
	public MyFlightPage oneWayClick() {
		oneWayButton.click();
		return new MyFlightPage(driver); 
		
	}
	
	public MyFlightPage flyingFrom() {
		originButton.click();
		originButton.sendKeys("NEW");
		
		for(WebElement city: originListesi) {
			
		System.out.println(city.getText());
		
		}
		
		System.out.println("====================================");
		originListesi.size();
		System.out.println("Listenin Elemanlari :" +originListesi.size());
		originListesi.get(0).getText();
		System.out.println("Listenin ilk Elemani: " +originListesi.get(0).getText());
		System.out.println("Listenin ilk Elemani: " +originListesi.get(2).getText());
		originListesi.get(3).click();
		
		
		return new MyFlightPage(driver); 
					
	}
	
	
	public MyFlightPage flyingTo() {
		destinationButton.click();
		destinationButton.sendKeys("BA");
		
		for(WebElement city2: destinatonListesi) {
			
		System.out.println(city2.getText());
		
		}
		
		System.out.println("====================================");
		destinatonListesi.size();
		System.out.println("Listenin Elemanlari :" +destinatonListesi.size());
		destinatonListesi.get(0).getText();
		System.out.println("Listenin ilk Elemani: " +destinatonListesi.get(0).getText());
		System.out.println("Listenin ilk Elemani: " +destinatonListesi.get(2).getText());
		destinatonListesi.get(3).click();
		
		
		return new MyFlightPage(driver); 
	
	
	}
	
	public MyFlightPage departTime() {
		departButton.sendKeys("04/22/2019");
		return new MyFlightPage(driver); 
		
	}
	
	
	public MyFlightPage adults() throws InterruptedException {
		adultButton.click();
		Select adultSize = new Select(adultButton);
		adultSize.selectByVisibleText("2");
		adultSize.getFirstSelectedOption();
		System.out.println(adultSize.getFirstSelectedOption().getText());
		
		Thread.sleep(3000);
		return new MyFlightPage(driver); 
		
	}
	
	
	public MyFlightPage children() throws InterruptedException {
		childrenButton.click();
		Select childrenSize = new Select(childrenButton);
		childrenSize.selectByVisibleText("4");
		childrenSize.getFirstSelectedOption();
		System.out.println("Cocuk Yolcu Sayisi: "+childrenSize.getFirstSelectedOption().getText());
		

		if(childrenSize.getFirstSelectedOption().getText().equals("1")) {
			
			Select firstChildNo = new Select(childOne);
			firstChildNo.selectByVisibleText("7");
			firstChildNo.getFirstSelectedOption().getText();
			System.out.println("Ilk Cocugun Yasi : " + firstChildNo.getFirstSelectedOption().getText());
		
		}
		
		if(childrenSize.getFirstSelectedOption().getText().equals("2")) {
			
			Select firstChildNo = new Select(childOne);
			firstChildNo.selectByVisibleText("7");
			firstChildNo.getFirstSelectedOption().getText();
			System.out.println("Ilk Cocugun Yasi : " + firstChildNo.getFirstSelectedOption().getText());
			
			
			Select secondChildNo = new Select(childTwo);
			secondChildNo.selectByVisibleText("12");
			secondChildNo.getFirstSelectedOption().getText();
			System.out.println("Ikinci Cocuk Yasi: " + secondChildNo.getFirstSelectedOption().getText());
			
		}
		
		if(childrenSize.getFirstSelectedOption().getText().equals("3")) {
			
			Select firstChildNo = new Select(childOne);
			firstChildNo.selectByVisibleText("7");
			firstChildNo.getFirstSelectedOption().getText();
			System.out.println("Ilk Cocugun Yasi : " + firstChildNo.getFirstSelectedOption().getText());
			
			
			Select secondChildNo = new Select(childTwo);
			secondChildNo.selectByVisibleText("12");
			secondChildNo.getFirstSelectedOption().getText();
			System.out.println("Ikinci Cocuk Yasi: " + secondChildNo.getFirstSelectedOption().getText());
			
			Select thirdChildNo = new Select(childThree);
			thirdChildNo.selectByVisibleText("14");
			thirdChildNo.getFirstSelectedOption().getText();
			System.out.println("Ucuncu Cocuk Yasi: " + thirdChildNo.getFirstSelectedOption().getText());
			
		}
		
       if(childrenSize.getFirstSelectedOption().getText().equals("4")) {
			
			Select firstChildNo = new Select(childOne);
			firstChildNo.selectByVisibleText("7");
			firstChildNo.getFirstSelectedOption().getText();
			System.out.println("Ilk Cocugun Yasi : " + firstChildNo.getFirstSelectedOption().getText());
			
			
			Select secondChildNo = new Select(childTwo);
			secondChildNo.selectByVisibleText("12");
			secondChildNo.getFirstSelectedOption().getText();
			System.out.println("Ikinci Cocuk Yasi: " + secondChildNo.getFirstSelectedOption().getText());
			
			Select thirdChildNo = new Select(childThree);
			thirdChildNo.selectByVisibleText("14");
			thirdChildNo.getFirstSelectedOption().getText();
			System.out.println("Ucuncu Cocuk Yasi: " + thirdChildNo.getFirstSelectedOption().getText());
			
			Select fourthChildNo = new Select(childFour);
			fourthChildNo.selectByVisibleText("11");
			fourthChildNo.getFirstSelectedOption().getText();
			System.out.println("Dorduncu Cocuk Yasi: " + fourthChildNo.getFirstSelectedOption().getText());
			
		}
		
		return new MyFlightPage(driver); 
		
	}
	
	    public MyFlightPage searchButton() {
		 
	    	search.click();
		 
	    	js.scrollPageDown(driver);
		 return new MyFlightPage(driver); 
		
	}
	
	
	
 	}
	

	
	
	
	
	


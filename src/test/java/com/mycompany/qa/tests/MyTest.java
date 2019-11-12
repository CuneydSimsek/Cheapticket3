package com.mycompany.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;




public class MyTest extends TestBaseER{
	

	 @Test(priority=1)
	  public void oneWayNavigation() throws InterruptedException{//method ismi istedigimiz bir isim 
		    extentTest = extent.startTest("About button validation ");	//test result screenshot almasi icin
			homePage.clickFlight().oneWayClick().flyingFrom().flyingTo().departTime().adults().children().searchButton();
			System.out.println(homePage.getTitle());//gittigimiz sayfanin title ini almak icin
	  
	 }

	 
  }
 
 
  


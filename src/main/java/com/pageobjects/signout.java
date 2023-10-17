package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Utils;
import com.base.Testbase;

public class signout extends Testbase{
	
	@FindBy(xpath="//img[@src='/WebApp/assets/dist/img/avatar5.png']")
	WebElement prf;
	
	@FindBy(xpath="//a[@href='/Authenticate/Logout']")
	WebElement sgn;
	
	
	
	 public signout(WebDriver driver) {
		  
		  PageFactory.initElements(driver, this);
	  }
	
	 public void log() {
		 
		 
		 Utils.Act(prf);
		 prf.click();
		 sgn.click();
		 
	 }

}

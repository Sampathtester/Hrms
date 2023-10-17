package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class Lo‌gin_Functionality extends Testbase{
	
	  @FindBy(name="emailid")
      WebElement usr;
	  
	  @FindBy(id="pword")
	  WebElement pwd;
	  
	  @FindBy(xpath="//button[text()='Login']")
	  WebElement login;
	   
	  
	  public Lo‌gin_Functionality(WebDriver driver) {
		  
		  PageFactory.initElements(driver, this);
	  }
	

	  public Homepage validateLogin() throws Throwable {
		  
		 usr.sendKeys(props.getProperty("username"));
		 pwd.sendKeys(props.getProperty("password"));
		 login.click();
		  
		  
		  return new Homepage();
		  
		  
	
	  }
	  
}

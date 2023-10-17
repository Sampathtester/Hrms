package com.Hrms.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Testbase;
import com.pageobjects.Lo‌gin_Functionality;

public class LoginTest extends Testbase {
	
	Lo‌gin_Functionality lg;
	
	public LoginTest() {
		
		
		super();
	}
	
	
	@BeforeMethod
	
	public void initialize() {
		
		Setup();
		
		 lg = new Lo‌gin_Functionality(driver);
	}
	
	
	@Test
	public void verifylogin() throws Throwable {
		
		lg.validateLogin(); 
		
	}
	
	

}

package com.Hrms.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Testbase;
import com.pageobjects.Lo‌gin_Functionality;
import com.pageobjects.signout;

public class featureTest extends Testbase{
	
	
Lo‌gin_Functionality lg;
signout s;


	
	public featureTest() {
		
		
		super();
	}
	
	
	@BeforeMethod
	
	public void initialize() throws Throwable {
		
		Setup();
		
		 lg = new Lo‌gin_Functionality(driver);
		  s=new signout(driver);
		  lg.validateLogin();
	}
	
	
	@Test
	public void vl() throws Throwable {
			
		s.log();
		
	}

	
	
}

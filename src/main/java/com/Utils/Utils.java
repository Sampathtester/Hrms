package com.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.Testbase;

public class Utils extends Testbase {

	public static void Act(WebElement loc) {

		Actions ac = new Actions(driver);

		ac.moveToElement(loc).perform();

	}

}

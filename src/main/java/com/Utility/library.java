package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class library {

	public static void custom_SendKeys(WebElement element, String value) {
		
		try {
			element.sendKeys(value);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void getExplicitWait(WebDriver driver, WebDriver element) {
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf((WebElement) element));
	}
	public static void getScreenshotCapture( ) {
		
	}
}

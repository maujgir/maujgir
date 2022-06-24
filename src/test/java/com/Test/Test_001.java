package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.Base_Class;
import com.Utility.library;

public class Test_001 extends Base_Class {
	
	@Test
	public void test_01() {
		
		LoginPom Login=PageFactory.initElements(driver, LoginPom.class);
		//Login.getTxt_email().sendKeys("maujgir");
		//Login.getTxt_password().sendKeys("123344");
		
		//use library instead of above for login.get.....
		library.custom_SendKeys(Login.getTxt_email(), "maujgir");
		library.custom_SendKeys(Login.getTxt_password(), "12376");
		library.getScreenshotCapture();
	}

}

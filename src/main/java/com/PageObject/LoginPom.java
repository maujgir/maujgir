package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {

	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement txt_email;

	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement txt_password;
	
	public WebElement getTxt_email() {
		return txt_email;
	}

	public void setTxt_email(WebElement txt_email) {
		this.txt_email = txt_email;
	}

	public WebElement getTxt_password() {
		return txt_password;
	}

	public void setTxt_password(WebElement txt_password) {
		this.txt_password = txt_password;
	}
}


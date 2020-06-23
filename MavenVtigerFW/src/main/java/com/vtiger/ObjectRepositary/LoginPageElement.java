package com.vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElement {
	@FindBy(name="user_name")
	private WebElement username;
	@FindBy(name="user_password")
	private WebElement password;
	@FindBy(id="submitButton")
	private WebElement loginBtn;
	
	public WebElement getUsername()
	{
		return username;
	}
	public WebElement getPassword()
	{
		return password;
	}
	public WebElement getLoginBtn()
	{
		return loginBtn;
	}
 
	
	
}

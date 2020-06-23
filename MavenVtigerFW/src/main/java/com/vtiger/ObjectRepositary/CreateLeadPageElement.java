package com.vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLeadPageElement {

	
	@FindBy(name="lastname")
	private WebElement lastname;
	@FindBy(name="company")
	private WebElement companyname;
	@FindBy(xpath="//input[contains(@value,'Save')]")
	private WebElement save;
	
	public WebElement getLastName()
	{
		return lastname;
	}
	public WebElement getCompanyName()
	{
		return companyname;
	}
	public WebElement getsave()
	{
		return save;
	}
	
	
	
}

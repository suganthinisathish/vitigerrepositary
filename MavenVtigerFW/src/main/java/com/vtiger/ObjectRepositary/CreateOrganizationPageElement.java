package com.vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateOrganizationPageElement {
	
	@FindBy(name="accountname")
	private WebElement organizationName;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement save;
	
	public WebElement getOrganizationName()
	{
		return organizationName;
	}
	public WebElement getSave()
	{
		return save;
	}

}

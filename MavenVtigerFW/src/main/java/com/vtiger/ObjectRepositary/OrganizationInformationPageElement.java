package com.vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationInformationPageElement {
	
	@FindBy(xpath="//span[contains(text(),'Organization Information')]")
	private WebElement succesmesg;
	
	public WebElement getSuccessMesg()
	{
		return succesmesg;
	}

}

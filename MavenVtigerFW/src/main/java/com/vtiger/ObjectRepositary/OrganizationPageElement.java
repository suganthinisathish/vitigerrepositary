package com.vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationPageElement {

	@FindBy(css="img[title='Create Organization...']")
	private WebElement createOrganization;
	
	public WebElement getCreateOrganization()
	{
		return createOrganization;
	}
	
	
}

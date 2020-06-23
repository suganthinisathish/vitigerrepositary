package com.vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadPageElement {
	@FindBy(css="img[title='Create Lead...']")
	private WebElement createLead;
	
	public WebElement getCreateLead()
	{
		return createLead;
	}
	

}

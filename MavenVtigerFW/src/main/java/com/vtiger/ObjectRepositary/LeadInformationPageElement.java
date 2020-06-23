package com.vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadInformationPageElement {
	
	@FindBy(xpath="//span[contains(text(),'Lead Information')]")
	private WebElement successmesg;
	
	public WebElement getSuccessmesg()
	{
		return successmesg;
	}
	
	

}

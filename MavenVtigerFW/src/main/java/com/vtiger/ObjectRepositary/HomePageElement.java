package com.vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElement {
	@FindBy(linkText="Leads")
	private WebElement leads;
	@FindBy(linkText="Organizations")
	private WebElement organization;
	@FindBy(linkText="Products")
	private WebElement products;
	@FindBy(xpath="//span[@class='userName']/../following-sibling::td/img")
	private WebElement signoutDD;
	@FindBy(linkText="Sign Out")
	private WebElement signoutLink;
	
	public WebElement getLeads()
	{
		return leads;
	}
	public WebElement getOrganization()
	{
		return organization;
	}
	public WebElement getProducts()
	{
		return products;
	}
	public WebElement getSignoutDD()
	{
		return signoutDD;
	}
	public WebElement getSignoutLink()
	{
		return signoutLink;
	}
	
	

}

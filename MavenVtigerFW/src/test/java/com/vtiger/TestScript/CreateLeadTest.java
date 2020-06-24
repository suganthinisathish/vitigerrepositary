package com.vtiger.TestScript;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.vtiger.ObjectRepositary.CreateLeadPageElement;
import com.vtiger.ObjectRepositary.HomePageElement;
import com.vtiger.ObjectRepositary.LeadInformationPageElement;
import com.vtiger.ObjectRepositary.LeadPageElement;
import com.vtiger.genericLib.BaseClass;

@Listeners(com.vtiger.genericLib.ListenerFunctionality.class)
public class CreateLeadTest extends BaseClass{
	
@Test()
public void createLead() throws EncryptedDocumentException, IOException, InterruptedException
{
	HomePageElement hp=PageFactory.initElements(driver, HomePageElement.class);
	LeadPageElement lp=PageFactory.initElements(driver, LeadPageElement.class);
	CreateLeadPageElement cp=PageFactory.initElements(driver, CreateLeadPageElement.class);
	LeadInformationPageElement lip=PageFactory.initElements(driver, LeadInformationPageElement.class);
	hp.getLeads().click();
	lp.getCreateLead().click();
	cp.getLastName().sendKeys(data.getDataFromExcel("organization", 2, 1));
	cp.getCompanyName().sendKeys(data.getDataFromExcel("organization", 2, 2));
	cp.getsave().click();
	String actmesg=lip.getSuccessmesg().getText();
	Assert.assertTrue(actmesg.contains(data.getDataFromExcel("Organization", 2, 3)));
	
	System.out.println("lead test created sucessfully");
	
	
}
}

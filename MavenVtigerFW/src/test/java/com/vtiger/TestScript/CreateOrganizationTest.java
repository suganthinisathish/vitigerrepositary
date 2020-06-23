package com.vtiger.TestScript;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.ObjectRepositary.CreateOrganizationPageElement;
import com.vtiger.ObjectRepositary.HomePageElement;
import com.vtiger.ObjectRepositary.OrganizationInformationPageElement;
import com.vtiger.ObjectRepositary.OrganizationPageElement;
import com.vtiger.genericLib.BaseClass;
@Listeners(com.vtiger.genericLib.ListenerFunctionality.class)
public class CreateOrganizationTest extends BaseClass
{
	@Test()
	public void createOrganization() throws EncryptedDocumentException, IOException, InterruptedException
	{
		HomePageElement hp=PageFactory.initElements(driver, HomePageElement.class);
		OrganizationPageElement op=PageFactory.initElements(driver,OrganizationPageElement.class);
		CreateOrganizationPageElement cop=PageFactory.initElements(driver, CreateOrganizationPageElement.class);
		OrganizationInformationPageElement oip=PageFactory.initElements(driver,OrganizationInformationPageElement.class);
		hp.getOrganization().click();
		op.getCreateOrganization().click();
		String orgname=data.getDataFromExcel("organization", 5, 1);
		Random r=new Random();
		int num=r.nextInt(9999);
		orgname=orgname+num;		
		cop.getOrganizationName().sendKeys(orgname);
		cop.getSave().click();
		
		String SuccsMesg=oip.getSuccessMesg().getText();
		Assert.assertTrue(SuccsMesg.contains(data.getDataFromExcel("organization", 5, 3)));
		
	}
	

}

package com.vtiger.genericLib;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtiger.ObjectRepositary.HomePageElement;
import com.vtiger.ObjectRepositary.LoginPageElement;
public class BaseClass {
	public DataUtillity data=new DataUtillity();
	public static WebDriver driver;	
	@BeforeSuite
	public void configBeforeSuit()
	{
		System.out.println("------------DataBase Connection--------------");
	}
	@BeforeClass
	public void configBeforeClass() throws IOException
	{
		System.out.println("------------Browser launching start-----------");
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(data.getDataFromProperties("url"));
		System.out.println("------------Browser launching end-----------");
	}
	@BeforeMethod
	public void configBeforeMethod() throws IOException
	{
		System.out.println("------------Login Start----------------");
		LoginPageElement lp=PageFactory.initElements(driver, LoginPageElement.class);
		lp.getUsername().sendKeys(data.getDataFromProperties("uname"));
		lp.getPassword().sendKeys(data.getDataFromProperties("pword"));
		lp.getLoginBtn().click();
		System.out.println("-------------Login end-----------------");
	}
	@AfterMethod
	public void configAfterMethod()
	{
		System.out.println("------------Logout Start---------------");
		HomePageElement hp=PageFactory.initElements(driver, HomePageElement.class);
		
		Actions act=new Actions(driver);
		act.moveToElement(hp.getSignoutDD()).perform();
		hp.getSignoutLink().click();
		System.out.println("------------Logout end-----------------");
		
	}
	@AfterClass
	public void configAfterClass()
	{
		System.out.println("------------Close browser-----------------");
		driver.quit();
	}
	@AfterSuite
	public void configAfterSuit()
	{
		System.out.println("--------------DataBase Disconnect--------------");
	}
	

}

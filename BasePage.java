package com.bigbasket.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
	public WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//To verify the page
	public void verifyTitle(String eTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		try
		{
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is matching");
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching");
			Assert.fail();
		}
	}
	
	public void verifyElement(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element Found");
		}
		catch(Exception e)
		{
			Reporter.log("Element not Found");
			Assert.fail();
		}
	}
}

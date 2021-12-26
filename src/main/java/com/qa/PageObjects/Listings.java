package com.qa.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class Listings extends TestBase {
	

	public Listings()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement ClickOnSignin;
	
	@FindBy(name="username")
	WebElement EnterEmail;
	
	@FindBy(id="password")
	WebElement EnterPassword;
	
	@FindBy(name="login")
	WebElement ClickOnLogin;
	
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div/div/div[1]/div[3]/div[1]/div/div[1]/div/div[1]/img")
	public WebElement list;
	
	@FindBy(xpath="//span[text()='DESCRIPTION']")
	public WebElement Listingheader;
	
	@FindBy(xpath="//div[@class='seed-details-header']")
	public WebElement headline;
	
	
	public void List() throws InterruptedException
	{
		ClickOnSignin.click();
		EnterEmail.sendKeys("nurturefarmtest1@gmail.com");
		EnterPassword.sendKeys("Nurture@11");
		ClickOnLogin.click();
		Thread.sleep(2000);
		list.click();
		String Listing=Listingheader.getText();
		if(Listing.equalsIgnoreCase("DESCRIPTION"))
		{
			System.out.println("User is in Respective listing page");
		}
		else
		{
			System.out.println("User is not in desired page");
		}
	}
	

}

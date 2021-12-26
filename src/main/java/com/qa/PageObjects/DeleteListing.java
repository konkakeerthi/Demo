package com.qa.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class DeleteListing extends TestBase {
	
	public DeleteListing() {
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
	
	@FindBy(xpath="//a[@class='dropdown-toggle']//img[1]")
	public WebElement Profiledropdown;

	@FindBy(xpath="//button[text()='Profile']")
	public WebElement Profile;

	@FindBy(id="others-tab")
	WebElement HowotherSeeyou;
	
	@FindBy(xpath="//div[@class='icon-text-style icon-text-style-for-listing-count']/following-sibling::div")
	public WebElement SelectList;
	
	@FindBy(xpath="//img[@alt='delete']")
	public WebElement ClickOnDeleteButton;
	
	@FindBy(xpath="//button[text()='Delete']")
	public WebElement ClickOnDelete;
	
	@FindBy(xpath="//p[text()='Listing Deleted Successfully']")
	public WebElement ListDelete;
	
	@FindBy(xpath="//p[text()='Go to dashboard']")
	public WebElement GotoDashboard;
	
public void LoginWithListingUSer(String Email,String Password) throws InterruptedException {
		
		ClickOnSignin.click();
		Thread.sleep(2000);
		EnterEmail.sendKeys(Email);
		Thread.sleep(2000);
		EnterPassword.sendKeys(Password);
		Thread.sleep(1000);
		ClickOnLogin.click();
		Thread.sleep(3000);		
}
public void DeleteTheList() throws InterruptedException	{
	Profiledropdown.click();
	Thread.sleep(2000);
	Profile.click();
	Thread.sleep(2000);
	HowotherSeeyou.click();
	Thread.sleep(3000);
	
	String List=SelectList.getText();
	Thread.sleep(2000);
	if(List.equalsIgnoreCase("LG Maltstar Super Barley")) 
	{
		SelectList.click();
		System.out.println("user selected parcticular List");
	}
	else
	{
		System.out.println("user not selected parcticular List");
	}
	
	Thread.sleep(2000);
	ClickOnDeleteButton.click();
	Thread.sleep(4000);
	ClickOnDelete.click();
	Thread.sleep(3000);
	String deleteList=ListDelete.getText();
	if(deleteList.equalsIgnoreCase("Listing Deleted Successfully")) 
	{
		System.out.println("List Deleted Sucessfully");
	}
	else
	{
		System.out.println("List not Deleted");
	}
	Thread.sleep(2000);
	GotoDashboard.click();
	Thread.sleep(3000);
	
	
	
	
}

}

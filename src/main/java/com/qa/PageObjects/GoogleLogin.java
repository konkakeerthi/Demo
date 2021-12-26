package com.qa.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class GoogleLogin extends TestBase {
	
public GoogleLogin(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Get Started']")
	WebElement GetStart;
	@FindBy(xpath="//span[text()='Google']")
	WebElement ClickOnGoogle;
	@FindBy(xpath="//div[@data-item-index='4']")
	WebElement ClickOnGoogleUser;
	@FindBy(xpath="//input[@type='email']")
	WebElement EnterGmail;
	@FindBy(xpath="//span[text()='Next']/following-sibling::div")
	WebElement Next;
	@FindBy(name="password")
	WebElement Password;
	@FindBy(xpath="//span[text()='Next']/following-sibling::div")
	WebElement NextPassword;
	
	public void GoogleSocialLogin() throws InterruptedException {
		GetStart.click();
		Thread.sleep(1000);
		ClickOnGoogle.click();
		Thread.sleep(2000);
		EnterGmail.sendKeys("chalama23@gmail.com");
		Thread.sleep(2000);
		Next.click();
		Thread.sleep(5000);
		Password.sendKeys("@452dear");
		Thread.sleep(2000);
		NextPassword.click();
		//ClickOnGoogleUser.click();
		
	}

}

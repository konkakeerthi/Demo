package com.qa.PageObjects;



import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class FacebookLogin extends TestBase{
	
public FacebookLogin(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//button[text()='Get Started']")
WebElement GetStart;
		@FindBy(xpath="//span[text()='Facebook']")
		WebElement ClickOnFacebook;
		@FindBy(id="email")
		WebElement EnterFacebookEmail;
		@FindBy(id="pass")
		WebElement EnterFacebookPassword;
		@FindBy(id="loginbutton")
		WebElement FacebookLoginClick;
		
		@FindBy(xpath="//*[@id=\"platformDialogForm\"]/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td[2]/button[2]")
		WebElement Ok;
		
		@FindBy(xpath="//u[text()='May be Later']")
		WebElement MaybeLater;
		
		@FindBy(xpath="//li[contains(@class,'dropdown mt-2')]//a[1]")
		WebElement MousehoverToUser;
		@FindBy(xpath="//button[text()='Profile']/following-sibling::button")
		WebElement ClickOnLogout;
		
		//Verify if user click on Signin with Facebook Button navigating user to Facebook Api Screen and validate the details
		public void FacebookSocialLogin() throws InterruptedException {
			Thread.sleep(3000);
			GetStart.click();
			Thread.sleep(2000);
			ClickOnFacebook.click();
			EnterFacebookEmail.sendKeys("sudharshanchowdary4@gmail.com");
			EnterFacebookPassword.sendKeys("ammananaanna");
			FacebookLoginClick.click();	
			Thread.sleep(5000);
			Ok.click();
			//Thread.sleep(5000);
			//MaybeLater.click();
			Actions act=new Actions(driver);
			act.moveToElement(MousehoverToUser).perform();
			Thread.sleep(3000);
			ClickOnLogout.click();
			
			
		}
		



}

package com.qa.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Base.InvalidLoginDataExcelUtil;
import com.qa.Base.TestBase;
import com.qa.Base.ValidLoginDataExcelUtil;

public class ManualLogin extends TestBase {
	
public ManualLogin() {
		
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
		
		@FindBy(xpath="//span[text()='Invalid username or password.']")
		WebElement InvalidUserNameAndPassword;
		
		@FindBy(xpath="//u[text()='Complete now']")
		WebElement MaybeLater;
		
		@FindBy(xpath="//a[@class='dropdown-toggle']//img[1]")
		WebElement MousehoverToUser;
		
		@FindBy(xpath="//button[text()='Logout']")
		WebElement ClickOnLogout;
	
		
		
		//Verify the login page for both, when the fields(Email & Password) is blank and Login button is clicked.
		public void LoginWithBlank() 
		{
			ClickOnSignin.click();
			ClickOnLogin.click();
			String Message=InvalidUserNameAndPassword.getText();
			System.out.println(Message);		
		}
		
		//Verify the login page with Negative Scenarios
		public void LoginWithNegativeData(String Email,String Password) throws InterruptedException
		{
			InvalidLoginDataExcelUtil EX=new InvalidLoginDataExcelUtil();
			EnterEmail.sendKeys(Email);
			Thread.sleep(2000);
			EnterPassword.sendKeys(Password);
			Thread.sleep(1000);
			ClickOnLogin.click();
			Thread.sleep(1000);
			EnterEmail.clear();
			String Message=InvalidUserNameAndPassword.getText();
			System.out.println(Message);
		}
		
		public void LoginWithValidEmailAndValidPassword(String Email,String Password) throws InterruptedException {
			ValidLoginDataExcelUtil vd=new ValidLoginDataExcelUtil();
			//GetStart.click();
			Thread.sleep(2000);
			EnterEmail.sendKeys(Email);
			Thread.sleep(2000);
			EnterPassword.sendKeys(Password);
			Thread.sleep(1000);
			ClickOnLogin.click();
			Thread.sleep(3000);
		//	MaybeLater.click();
		//	Thread.sleep(5000);
			
		}
	
		public void VerifyTheLogo() throws InterruptedException {
			boolean logo = driver.findElement(By.xpath("//a[@class='navbar-brand mt-2']//img[1]")).isDisplayed();
			if (!logo) {
				System.out.println("Logo is not displayed--User has not been loggedin");
			}
			else {
				System.out.println("Logo is displayed-->User has been Loggedin");
			}
			
			Actions act=new Actions(driver);
			act.moveToElement(MousehoverToUser).perform();
			Thread.sleep(3000);
			ClickOnLogout.click();
		}


}

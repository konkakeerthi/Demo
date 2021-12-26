package com.qa.PageObjects;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.Base.TestBase;
import com.qa.Base.ValidLoginDataExcelUtil;

public class Registration extends TestBase {
	public Registration()
	{
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//p[text()='Click here to add a photo']")
	public WebElement AddPhoto;

	@FindBy(xpath="/html/body/div/div[1]/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/form/div[1]/div[1]/div[1]/div/div/div[1]/div/input")
	public WebElement Fullname;

	@FindBy(xpath="/html/body/div/div[1]/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/form/div[1]/div[1]/div[2]/div/div/div[1]/div/input")
	public WebElement Shortbio;

	@FindBy(xpath="/html/body/div/div[1]/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/form/div[2]/div[1]/div/div[1]/div/input")
	public WebElement BusinessName;

	@FindBy(id="businessEmail")
	public WebElement BusinessEmail;

	@FindBy(xpath="(//input[@placeholder='ex. claireSimpson@gmail.com'])[2]")
	public WebElement AlternateEmailID;
	
	@FindBy(id="businessPhone")
	public WebElement BusinessPhonenumber;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/form/div[4]/div[1]/div/input")
	public WebElement ABN;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/form/div[4]/div[2]/div/div")
	public WebElement ABNdocument;

	@FindBy(xpath="(//input[@id='nationalGrowerRegister'])[2]")
	public WebElement NGR;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/form/div[6]/div[2]/div/div")
	public WebElement NGRdocument;

	@FindBy(id="postCode")
	public WebElement postcode;

	@FindBy(xpath="(//span[text()='ADDRESS']/following::input)[2]")
	public WebElement YourAddress;

	@FindBy(xpath="//input[@placeholder='ex. NEW CANBERRA']")
	public WebElement Locality;
	
	@FindBy(id="identityProof")
	public WebElement State;

	@FindBy(xpath="//button[text()='Next']")
	public WebElement Next;
	
	@FindBy(xpath="//button[text()='Go to Stripe']")
	public WebElement PaymentDetails;

	@FindBy(xpath="//label[@for='termsCheck']")
	public WebElement TermsandConditions;
	
	@FindBy(xpath="//button[text()='Complete Registration']")
	public WebElement RegistrationComplete;
	
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement ClickOnSignin;
	
	@FindBy(name="username")
	WebElement EnterEmail;
	
	@FindBy(id="password")
	WebElement EnterPassword;
	
	@FindBy(name="login")
	WebElement ClickOnLogin;
	
	@FindBy(xpath="//u[text()='Complete now']")
	WebElement CompleteNow;
	
	@FindBy(xpath="//u[text()='View Profile']")
	WebElement ViewProfile;
	
	@FindBy(xpath="//label[text()='Business Email']/following-sibling::div")
	WebElement VerifyEmail;
	
	
	
	public void LoginWithNonRegister_GeneralDetails(String NonRegisterMail,String Pwd,
			String Name,String ShortBio,
			String businessname,String AEmail,String Phone,
			String abn,String ngr,
			String postalcode,String address,String town
			) throws InterruptedException, IOException {
		
		Thread.sleep(2000);
		ClickOnSignin.click();
		EnterEmail.sendKeys(NonRegisterMail);
		Thread.sleep(2000);
		EnterPassword.sendKeys(Pwd);
		Thread.sleep(1000);
		ClickOnLogin.click();
		Thread.sleep(5000);
		CompleteNow.click();
		Thread.sleep(2000);

		
	//	Registration_PersonalDetails
		AddPhoto.click();
		Thread.sleep(9000);
		Runtime.getRuntime().exec("C:\\Users\\CHALAMA\\Desktop\\Nature Farming\\Autoit-Upload Documents\\ProfileImage.exe");
		Thread.sleep(9000);
		Fullname.sendKeys(Name);
		Thread.sleep(3000);
		Shortbio.sendKeys(ShortBio);
		Thread.sleep(3000);	
		
	//	Registration_BusinessDetails
		BusinessName.sendKeys(businessname);
		Thread.sleep(3000);
	//	BusinessEmail.sendKeys();
	//	Thread.sleep(3000);
		AlternateEmailID.sendKeys(AEmail);
		Thread.sleep(3000);
		BusinessPhonenumber.sendKeys(Phone);
		Thread.sleep(3000);
		
	//	Registration_DocumentDetails
		ABN.sendKeys(abn);
		Thread.sleep(3000);
		NGR.sendKeys(ngr);
		Thread.sleep(3000);
	//	Registration_AddressDetails
	//	postcode.clear();
		postcode.sendKeys(postalcode);
		Thread.sleep(3000);
		YourAddress.sendKeys(address);
		Thread.sleep(3000);
		Locality.sendKeys(town);
		Thread.sleep(3000);
		Select slx = new Select(State);
		slx.selectByIndex(1);
		Thread.sleep(3000);
		Next.click();
		Thread.sleep(4000);
}
	
	@FindBy(xpath="//span[text()='the test phone number']")
	WebElement TestPhone;
	
	@FindBy(id="email")
	WebElement Email;
	
	@FindBy(xpath="//span[text()='Use test code']")
	WebElement UseTestCode;
	
	@FindBy(xpath="//span[text()='Use a new business']")
	WebElement newbusiness;
	
	@FindBy(xpath="(//input[contains(@class,'Radio-source PressableContext')])[2]")
	WebElement TypeofEntity;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement next;
	
	@FindBy(id="company[name]")
	WebElement BuniessName;
	
	@FindBy(id="company[tax_id]")
	WebElement CompanyABN;
	
	@FindBy(name="address")
	WebElement Address1;
	
	@FindBy(name="address-line2")
	WebElement Address2;
	
	@FindBy(name="locality")
	WebElement City;
	
	@FindBy(id="subregion")
	WebElement state;
	
	@FindBy(name="zip")
	WebElement PostalCode;
	
	@FindBy(id="business_profile[url]")
	WebElement BusinessWebsite;
	
	@FindBy(xpath="//span[text()='Use test account']")
	WebElement UseTestAccount;
	
	@FindBy(xpath="/html/body/div/div/div[1]/div[3]/div/div/div[11]/div/div/div[1]/button/div/div[2]/span/span")
	WebElement Done;
	
	@FindBy(xpath="//button[text()='Close']")
	WebElement Close;

	
//Verifying the update stripe details	
	public void Registration_FinancialDetails(String Mail,String Name,String Abn,String address1,String address2,String city,String postcodee,String website) throws InterruptedException {
		PaymentDetails.click();
		ArrayList<String> Tab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(Tab.get(1));
		Thread.sleep(4000);
		TestPhone.click();
		Thread.sleep(2000);
		Email.sendKeys(Mail);
		Thread.sleep(1000);
		next.click();
		Thread.sleep(1000);
		
		UseTestCode.click();
		Thread.sleep(2000);
	//	newbusiness.click();
	//	Thread.sleep(2000);
	//	next.click();
		TypeofEntity.click();
		Thread.sleep(1000);
		next.click();	
		Thread.sleep(2000);
		
		BuniessName.sendKeys(Name);
		Thread.sleep(1000);
		CompanyABN.sendKeys(Abn);
		Thread.sleep(1000);
		Address1.sendKeys(address1);
		Thread.sleep(1000);
		Address2.sendKeys(address2);
		Thread.sleep(1000);
		City.sendKeys(city);
		Thread.sleep(1000);
		Select Selectstate=new Select(state);
		Selectstate.selectByIndex(3);
		Thread.sleep(1000);
		PostalCode.sendKeys(postcodee);
		Thread.sleep(1000);
		BusinessWebsite.sendKeys(website);
		next.click();
		Thread.sleep(2000);
		
		UseTestAccount.click();
		Thread.sleep(3000);
		Done.click();
		Thread.sleep(3000);
		Close.click();
		Thread.sleep(4000);
		
		driver.switchTo().window(Tab.get(0));
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		Next.click();
		Thread.sleep(3000);
		
		Next.click();
		Thread.sleep(1000);
	
	}
	public void Registration_TermsACondtions() throws InterruptedException{
		TermsandConditions.click();
		Thread.sleep(3000);
		RegistrationComplete.click();
		Thread.sleep(2000);
	
	}
	public void Registration_Complete() throws InterruptedException {
		ViewProfile.click();
		Thread.sleep(4000);
	
		String Text = VerifyEmail.getText();
		Thread.sleep(2000);
		
		if (Text.equalsIgnoreCase("nurturefarmtest4@gmail.com")) {
			System.out.println("User Verification Pending-->Registration not Completed");
		}
		else {
			System.out.println("User Verified-->Registration Completed");
		}
		Thread.sleep(2000);
		
	}

}

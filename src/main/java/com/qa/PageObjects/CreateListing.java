package com.qa.PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.Base.TestBase;
import com.qa.Base.ValidLoginDataExcelUtil;

public class CreateListing extends TestBase {
	public CreateListing() {
			
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="profile-tab")
	WebElement ClickOnActivity;
	
	@FindBy(xpath="//div[text()=' + Create New Listing']")
	public WebElement CreateNewListing;
	
	@FindBy(xpath="//input[@id='headline']")
	WebElement ListingHeadLine;
	
	@FindBy(xpath="//input[@id='description']")
	WebElement ListDescription;
	
	@FindBy(xpath="//label[text()='Same as business location']")
	WebElement SameAsBusinessLocation;
	
	@FindBy(xpath="//input[@placeholder='ex. 5024']")
	WebElement PostCode;
	
	@FindBy(xpath="//input[@placeholder='ex. 200 Broadway Av']")
	WebElement yourAddress;
	
	@FindBy(xpath="//input[@placeholder='ex. New Canberra']")
	WebElement LocalityTown;
	
	@FindBy(id="identityProof")
	WebElement Statee;
	
	@FindBy(xpath="//button[text()='Next']")
	WebElement Next;
	
	@FindBy(xpath="//input[@value='1']")
	WebElement CropCategory;
	
	@FindBy(xpath="//input[@placeholder='Choose Category']")
	WebElement WheatVariety;
	
	
	@FindBy(xpath="//input[@step='1']")
	WebElement AvailableQuality;
	
	@FindBy(xpath="(//input[@id='state'])[2]")
	WebElement MinimumQuality;
	
	@FindBy(xpath="(//input[@id='state'])[3]")
	WebElement Price;
	
	@FindBy(id="identityProof")
	WebElement SelectSeason;
	
	@FindBy(xpath="//div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[8]/div[1]/div[1]/label[1]/i[1]")
	WebElement UploadSeedImages;
	
	@FindBy(xpath="//button[text()='Preview Listing']")
	WebElement PreviewListing;
	
	@FindBy(xpath="//input[contains(@class,'form-check-input filled-in')]")
	WebElement CheckTandC;
	
	@FindBy(xpath="//button[text()='Create Listing']")
	WebElement CreatListing;
	
	@FindBy(xpath="//button[text()='View Dashboard']")
	WebElement ViewDashboard;
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement ClickOnSignin;
	
	@FindBy(name="username")
	WebElement EnterEmail;
	
	@FindBy(id="password")
	WebElement EnterPassword;
	
	@FindBy(name="login")
	WebElement ClickOnLogin;
	
	
public void LoginWithRegisterUSer(String Email,String Password) throws InterruptedException {
		
		ClickOnSignin.click();
		Thread.sleep(2000);
		EnterEmail.sendKeys(Email);
		Thread.sleep(2000);
		EnterPassword.sendKeys(Password);
		Thread.sleep(1000);
		ClickOnLogin.click();
		Thread.sleep(3000);
		
}
public void NavigateCreateListManual() throws InterruptedException {
	ClickOnActivity.click();
	Thread.sleep(2000);
	CreateNewListing.click();
	Thread.sleep(2000);
}

public void CreateListManual(String ListHead, String ListDesc,String seedQuantity,String MinQuantity,String SeedPrice,String Postcode,String Address,String Locality) throws IOException, InterruptedException 
   {
		
		ListingHeadLine.sendKeys(ListHead);
		Thread.sleep(3000);
		ListDescription.click();
		Thread.sleep(2000);
		ListDescription.sendKeys(ListDesc);
		Thread.sleep(3000);
	//	SameAsBusinessLocation.click();
	//	Thread.sleep(2000);
	//	SameAsBusinessLocation.click();
	//	Thread.sleep(2000);
	//	PostCode.clear();
	//	Thread.sleep(2000);
		PostCode.sendKeys(Postcode);
		Thread.sleep(2000);
	//	yourAddress.clear();
	//	Thread.sleep(2000);
		yourAddress.sendKeys(Address);
		Thread.sleep(2000);
	//	LocalityTown.clear();
	//	Thread.sleep(2000);
		LocalityTown.sendKeys(Locality);
		Thread.sleep(1000);
		Select selectstate=new Select(Statee);
		selectstate.selectByIndex(2);
		Thread.sleep(3000);
		Next.click();
		Thread.sleep(3000);
		
		CropCategory.click();
		Thread.sleep(2000);
		WheatVariety.click();
		Thread.sleep(2000);
		WheatVariety.sendKeys("Bremer");
		Thread.sleep(2000);
		Next.click();
		Thread.sleep(3000);
		
		AvailableQuality.sendKeys(seedQuantity);
		Thread.sleep(3000);
		MinimumQuality.sendKeys(MinQuantity);
		Thread.sleep(3000);
		Price.sendKeys(SeedPrice);
		Thread.sleep(3000);
		
		Select slt=new Select(SelectSeason);
		slt.selectByIndex(1);
		Thread.sleep(4000);
		
		//UploadSeedImages.click();
		//Runtime.getRuntime().exec("C:\\Users\\CHALAMA\\Desktop\\Nature Farming\\Autoit-Upload Documents\\Upload.exe");
		//Thread.sleep(2000);
		PreviewListing.click();	
		Thread.sleep(5000);
		CheckTandC.click();
		Thread.sleep(4000);
		CreatListing.click();
		Thread.sleep(3000);
		ViewDashboard.click();
		Thread.sleep(3000);
		
}

}

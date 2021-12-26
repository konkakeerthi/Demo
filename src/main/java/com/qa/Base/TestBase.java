package com.qa.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.qa.Utility.TestUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class TestBase extends TestUtil {
	
	
	public static  WebDriver driver;
	public static Properties prop;
	
	public ExtentReports extent;
	public ExtentTest extentTest;
	
	
	
	
	//here TestBase is constructor
	public TestBase(){
		
		try {
			prop = new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\CHALAMA\\eclipse-workspace\\NurtureFarm\\src\\main\\java\\com\\qa\\Config\\config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
	}
	
	@BeforeClass(alwaysRun=true)
	public static void initalization() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
			driver=new ChromeDriver(options);
		}else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "F:\\ChromeDriver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//button[text()='Get Started'])[2]")).click();
		
	}

	/* @BeforeTest
		public void setExtent()
	    {
		 extent = new ExtentReports(System.getProperty("user.dir")+"/TestReport/NautureFarm-Test-Automaton-Report.html", true);
			extent.addSystemInfo("Host Name", "chalama Windows");
			extent.addSystemInfo("User Name", "VNC Automation Labs");
			extent.addSystemInfo("Environment", "QA");
		}
	 @AfterTest
		public void endReport()
	    {
			extent.flush();
			extent.close();
			driver.quit();
		}
	 
	 public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException{
			String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			// after execution, you could see a folder "FailedTestsScreenshots"
			// under src folder
			String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + dateName
					+ ".png";
			File finalDestination = new File(destination);
			FileUtils.copyFile(source, finalDestination);
			return destination;
		}
	
	 @AfterMethod(alwaysRun=true)
		public void tearDown(ITestResult result) throws IOException {
			
		 try {
			if(result.getStatus()==ITestResult.FAILURE)
			{
				String screenshotPath = TestBase.getScreenshot(driver, result.getName());
			//	String image = extentTest.addScreenCapture(screenshotPath);
				//extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
				extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
				
				
				extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath)); //to add screenshot in extent report
				// extentTest.log(LogStatus.FAIL, extentTest.addScreencast(screenshotPath)); //to add screencast/video in extent report
			}
			else if(result.getStatus()==ITestResult.SKIP)
			{
				extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
			}
			else if(result.getStatus()==ITestResult.SUCCESS)
			{
				extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());

			}
			
			extent.endTest(extentTest); //ending test and ends the current test and prepare to create html report
			//driver.quit();
		 }
		 catch(Throwable t) {
			 extentTest.log(LogStatus.ERROR,t.fillInStackTrace());
		 }
	 }
	 */
	
	@AfterClass
	public void End() {
	//	driver.quit();
	}

	@DataProvider
		public Iterator<Object[]> InvalidLogin()
	    {
			ArrayList<Object[]> testdata=InvalidLoginDataExcelUtil.getDataFromExcel();
			return testdata.iterator();
		}
	 @DataProvider
		public Iterator<Object[]> ValidLogin()
		    {
				ArrayList<Object[]> testdata=ValidLoginDataExcelUtil.getDataFromExcel();
				return testdata.iterator();
			}
	@DataProvider
		public Iterator<Object[]> ValidSignup()
		    {
				ArrayList<Object[]> testdata=SignupExcelUtil.getDataFromExcel();
				return testdata.iterator();
			}
	@DataProvider
	public Iterator<Object[]> InvalidSignup()
	{
			ArrayList<Object[]> testdata=InvalidSignupExcelUtil.getDataFromExcel();
			return testdata.iterator();
	}
	   
	@DataProvider
	public Iterator<Object[]> CreateListing()
	{
			ArrayList<Object[]> testdata=CreateListExcelUtil.getDataFromExcel();
			return testdata.iterator();
	}
	
	@DataProvider
	public Iterator<Object[]> Registration()
	{
			ArrayList<Object[]> testdata=RegistrationExcelUtil.getDataFromExcel();
			return testdata.iterator();
	}
	
	
	@DataProvider
	public Iterator<Object[]> StripeDetails()
	{
			ArrayList<Object[]> testdata=StripeDetailsExcelUtil.getDataFromExcel();
			return testdata.iterator();
	}

}

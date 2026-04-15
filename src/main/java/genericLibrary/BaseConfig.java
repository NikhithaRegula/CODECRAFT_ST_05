package genericLibrary;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import pageRepository.LoginPage;
import pageRepository.WelcomePage;
import pageRepository.BookPage;
import pageRepository.ComputerAccessories;
import pageRepository.ComputerDesktop;
import pageRepository.ComputerNotebook;

public class BaseConfig extends WebDriverLibrary{
	
	public WelcomePage wpobj;
	public LoginPage lpobj;
	public PropertiesLibrary plib;
	public ExcelLibrary excellib;
	public ExtentReports report;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	public BookPage bpobj;
	public ComputerDesktop cdobj;
	public ComputerNotebook cnobj;
	public ComputerAccessories caobj;
	public SoftAssert assertobj;
	
		@Parameters({"url", "browser"})
		@BeforeClass
		public void browserSetup(String url, String browser) 
		{
			
			//open the browser
			openBrowser(browser);
			
			
			maximizeBrowser();
			waitStatement();
			navigateToApp(url);
			
			Reporter.log("Browser Setup Success", true);
		
		}
		
		@BeforeMethod
		public void login() {
			
			excellib=new ExcelLibrary(); 
			
			plib = new PropertiesLibrary();
			
			waitStatement();
			
			wpobj = new WelcomePage(driver);
			clickOnElement(wpobj.getloginLink());
			
			
			lpobj = new LoginPage(driver);
			
			enterDataOnElement(lpobj.getemailTextBox(), plib.readData("email"));
			enterDataOnElement(lpobj.getPasswordTextBox(), plib.readData("Password"));
			clickOnElement(lpobj.getLoginButton());
			
			
			Reporter.log("Login success", true);
			
//			bpobj=new BookPage(driver);
//			cdobj =new ComputerDesktop(driver);
//			cnobj=new ComputerNotebook(driver);
//			caobj=new ComputerAccessories(driver);
			assertobj=new SoftAssert();
		}
		
		@BeforeTest
		public void ReportSetup() {
			
			//create the spark report
			spark=new ExtentSparkReporter("./AdvanceReport/index.html");
			
			//configure the spark report information
			spark.config().setDocumentTitle("regression Testing for the swag labs");
			spark.config().setReportName("regression suite");
			spark.config().setTheme(Theme.STANDARD);
			
			//create the extent report
			report=new ExtentReports();
			
			//attach the spark report and extent report
			
			report.attachReporter(spark);
			
			//configure the system information in extent report
			report.setSystemInfo("DeviceName", "DESKTOP-MJD127G");
			report.setSystemInfo("OperatingSystem", "windows 11");
		    report.setSystemInfo("Browser", "Chrome");
		    report.setSystemInfo("DrowserVersion", "chrome-138.8");
		}
		
		
		@AfterTest
		public void ReportTerminate() {
			//flush the report information
			report.flush();
		}
		
		@AfterMethod
		public void logout() {
			
			waitStatement();
			
			wpobj = new WelcomePage(driver);
			clickOnElement(wpobj.getlogoutlink());
			
			Reporter.log("Logout success", true);
		}
		
		@AfterClass
		public void browserTerminate() {
			closeBrowser();
			Reporter.log("Browser Terminate Success", true);
		}
		
		
	

	}

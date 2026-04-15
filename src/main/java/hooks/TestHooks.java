package hooks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericLibrary.WebDriverLibrary;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestHooks extends WebDriverLibrary{
	private static final Logger logger=LogManager.getLogger(TestHooks.class);
	
	public static WebDriver driver;
	@Before
	public void browserSetup() {
		System.out.println("[Hook]-Starting browser setup");
//		driver =new ChromeDriver();s
//		driver.manage().window().maximize();
//		logger.info("Browser setup is successful");
		openBrowser("chrome");
		maximizeBrowser();
		
		
		
	}
	@After
	public void browserTeardown() {
		System.out.println("[Hook]-Test finished, closing browser");
		if(driver!= null) {
			closeAllBroswer();
			logger.info("Browser terminated successfully");
		}
	}
	
	

}

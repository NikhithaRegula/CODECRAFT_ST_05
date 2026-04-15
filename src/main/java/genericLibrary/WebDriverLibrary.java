package genericLibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import hooks.TestHooks;

public class WebDriverLibrary implements FrameworkConstant{

	public WebDriver driver;
	public static WebDriver stdriver;
	public Actions actionobj;

	public WebDriver openBrowser(String browser) {

		if (browser.equals("chrome"))
		{
			driver = new ChromeDriver();
			stdriver = driver;
		} 
		else if (browser.equals("Edge"))
		{
			driver = new EdgeDriver();
			stdriver = driver;
		} 
		else if (browser.equals("firefox")) 
		{
			driver = new FirefoxDriver();
			stdriver = driver;
		}
		else 
		{
			System.out.println("Invalid Browser");
		}

		return driver;
	}

	//WebDriver driver=TestHooks.driver;
	
	public void navigateToApp(String url) 
	{ 
		
		stdriver.get(url);
	}
	
	
	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}
	
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public void closeAllBroswer()
	{
		driver.quit();
	}
	
	
	public void waitStatement()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitduration));
	}
	
	
	public void waitStatement(By locator) {
		WebDriverWait wait = new WebDriverWait(stdriver, Duration.ofSeconds(waitduration));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		
		
	}
	
	public void waitStatement(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(stdriver, Duration.ofSeconds(waitduration));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	public void clickOnElement(WebElement element)
	{
		element.click();
	}
	
	public void hoverOnElement(WebElement element) {
		actionobj=new Actions(stdriver);
		actionobj.moveToElement(element).perform();
		
	}
	
	public void clickOnElement_UsingActions(WebElement element)
	{
		actionobj=new Actions(stdriver);
		actionobj.moveToElement(element).click().perform();
	}
	
	
	public void enterDataOnElement(WebElement element, String data)
	{
		element.clear();
		element.sendKeys(data);
	}
	
	
	public void enterDataOnElement_UsingActions(WebElement element, String data)
	{
		element.clear();
		actionobj=new Actions(stdriver);
		actionobj.click(element).sendKeys(data).perform();
	}
	
	
	public void mouseHoverToElement(WebElement element) {
		
		actionobj =new Actions(stdriver);
		actionobj.moveToElement(element).perform();
	}

}

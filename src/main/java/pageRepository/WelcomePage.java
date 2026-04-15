package pageRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	
	@FindBy(xpath = "//a[text() = 'Register']")
	private WebElement registerlink;
	
	@FindBy(partialLinkText = "Log")
	//Identify and Declare Securely
	private WebElement loginlink;
	
	@FindBy(xpath = "//a[@href = '/logout']")
	private WebElement logoutlink;
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingcartlink;
	
	@FindBy(xpath="//a[contains(text(),'@gmail.com')]")
	private WebElement verifyGmail;
	
	@FindBy(xpath="(//a[contains(text(),'Computers')])[1]")
	private WebElement computerHeader;
	
	@FindBy(xpath = "(//a[contains(text(),'Computers')])[1]/../ul/li")
	private List<WebElement> computerHeaderList;
	
	@FindBy(xpath = "(//a[contains(text(),'Notebooks')])[1]")
	private WebElement notebooksHeader;
	
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization via getters
	
	
	public WebElement getregisterlink() {
		return registerlink;
	}
	
	public WebElement getloginLink() {
		return loginlink;
	}
	
    public WebElement getlogoutlink() {
		
		return logoutlink;
	}
	
	public WebElement getshoppingcartlink() {
		return shoppingcartlink;
	}
	public WebElement getverifyGmail() {
		return verifyGmail;
	}
	
	public WebElement getcomputerHeader() {
		return computerHeader;
	}
	public List<WebElement> getcomputerHeaderList() {
		return computerHeaderList;
	}
	public WebElement getnotebooksheader() {
		return notebooksHeader;
	}

}

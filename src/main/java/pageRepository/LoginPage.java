package pageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
	private WebElement loginTextBox;
	
	@FindBy(id = "Email")
	private WebElement emailTextBox;
	
	@FindBy(id = "Password")
	private WebElement PasswordTextBox;

	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement LoginButton;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getloginTextBox() {
		return loginTextBox;
	}
	
	public WebElement getemailTextBox() {
		return emailTextBox;
	}
	
	public WebElement getPasswordTextBox() {
		return PasswordTextBox;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

}

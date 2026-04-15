package pageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	@FindBy(xpath = "//h1[text()='Register']")
	private WebElement registerText;
	
	@FindBy(xpath = "//input[@id = 'gender-male']")
	private WebElement maleRadioBtn;
	
	@FindBy(xpath = "//input[@id='gender-female']")
	private WebElement femaleRadioBtn;
	
	@FindBy(xpath = "//input[@id='FirstName']")
	private WebElement firstnameTextBox;
	
	@FindBy(xpath = "//input[@id='LastName']")
	private WebElement lastnameTextBox;
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement emailTextBox;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement passwordTextBox;
	
	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	private WebElement cnfpasswordTextBox;
	
	@FindBy(xpath = "//input[@id='register-button']")
	private WebElement registerButton;
	
	
	//Initialization via constructor
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getregistertext() {
		return registerText;
	}
	public WebElement getmaleradiobtn() {
		return maleRadioBtn;
	}
	
	public WebElement getfemaleradiobtn() {
		return femaleRadioBtn;
	}
	
	public WebElement getfirstnameTextBox() {
		return firstnameTextBox;
	}
	
	public WebElement getlastnameTextBox() {
		return lastnameTextBox;
	}
	
	public WebElement getemailTextBox() {
		return emailTextBox;
	}
	
	public WebElement getpasswordTextBox() {
		return passwordTextBox;
	}
	
	public WebElement getcnfpasswordTextBox() {
		return cnfpasswordTextBox;
	}
	
	public WebElement getregisterButton() {
		return registerButton;
	}
}



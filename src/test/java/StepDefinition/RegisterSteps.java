package StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import genericLibrary.BaseConfig;
import genericLibrary.PropertiesLibrary;
import genericLibrary.WebDriverLibrary;
import hooks.TestHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageRepository.RegisterPage;
import pageRepository.WelcomePage;

public class RegisterSteps extends BaseConfig {
	WebDriver driver=TestHooks.driver;
	
	WelcomePage wpobj=new WelcomePage(driver);
	RegisterPage rpobj=new RegisterPage(driver);
	
	PropertiesLibrary plib=new PropertiesLibrary();
	
	private static final Logger logger=LogManager.getLogger(RegisterSteps.class);
	

	@Given("i opened demowebshop app")
	public void i_opened_demowebshop_app() {
		navigateToApp(plib.readData("url"));
	    logger.info("Opened the demowebshop application via url");
	}

	@When("i click on register")
	public void i_click_on_register() {
		clickOnElement(wpobj.getregisterlink());
	    logger.info("Clicked on the register link in the welcome page");
	}

	@Then("i should see register page")
	public void i_should_see_register_page() {
		System.out.println(rpobj.getregistertext().getText());
	}

	@Then("i clicked gender female radiobutton")
	public void i_clicked_gender_female_radiobutton() {
		clickOnElement(rpobj.getfemaleradiobtn());
	
	}

	@Then("i entered firstname {string}")
	public void i_entered_firstname(String firstname) {
		enterDataOnElement(rpobj.getfirstnameTextBox(), firstname);
		 
	}

	@Then("i entered lastname {string}")
	public void i_entered_lastname(String lastname) {
		enterDataOnElement(rpobj.getlastnameTextBox(), lastname);
	}

	@Then("i entered email {string}")
	public void i_entered_email(String email) {
		enterDataOnElement(rpobj.getemailTextBox(), email);
	}

	@Then("i entered password {string}")
	public void i_entered_password(String password) {
		enterDataOnElement(rpobj.getpasswordTextBox(), password);
	}

	@Then("i entered confirmpassword {string}")
	public void i_entered_confirmpassword(String confirmpswd) {
		enterDataOnElement(rpobj.getcnfpasswordTextBox(), confirmpswd);
	}

	@Then("i clicked on register button")
	public void i_clicked_on_register_button() {
		clickOnElement(rpobj.getregisterButton());
	}

	@Then("i should see success message")
	public void i_should_see_success_message() {
		driver.findElement(By.xpath("//div[contains(text(),'Your registration')]"));
	}

}

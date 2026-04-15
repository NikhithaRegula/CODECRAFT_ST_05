package StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import genericLibrary.BaseConfig;
import genericLibrary.PropertiesLibrary;
import genericLibrary.WebDriverLibrary;
import hooks.TestHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageRepository.LoginPage;
import pageRepository.WelcomePage;

public class LoginSteps extends WebDriverLibrary{
//	WebDriver driver=TestHooks.driver;
	WelcomePage wpobj=new WelcomePage(stdriver);
	LoginPage lpobj=new LoginPage(stdriver);
	PropertiesLibrary plib=new PropertiesLibrary();
	
	private static final Logger logger=LogManager.getLogger(LoginSteps.class);
	
	@Given("i opened demowebshop app for ordering product")
	public void i_opened_demowebshop_app() {
		navigateToApp(plib.readData("url"));
		logger.info("Opened the demowebshop application via url");
	}
	    
	@When("i click on login link")
	public void i_click_on_login_link() {
		clickOnElement(wpobj.getloginLink());
		logger.info("Step 1:Clicked on the login link in the welcome page");
	}

	@Then("i should see login page")
	public void i_should_see_login_page() {
		System.out.println(lpobj.getloginTextBox().getText());
		logger.info("Step 2: login page opened and text is displayed on the console");
	}

	@Then("i entered Email on the email text box {string}")
	public void i_entered_email_on_the_email_text_box(String email) {
		enterDataOnElement(lpobj.getemailTextBox(), email);
	    logger.info("Step 3:Entered the email on the email text box",email);
	}
	
	@Then("i entered Password text box {string}")
	public void i_entered_password_text_box(String password) {
		enterDataOnElement(lpobj.getPasswordTextBox(), password);
	    logger.info("Step 4:Entered the password on the password text box",password);
	}

	@Then("i clicked on Login button")
	public void i_clicked_on_login_button() {
		clickOnElement(lpobj.getLoginButton());
	    logger.info("Step 5:Clicked on the login button");
	}

	@Then("i should see demo web shop welcome page")
	public void i_should_see_demo_web_shop_welcome_page() {
		System.out.println(wpobj.getverifyGmail().getText());
	    logger.info("Step 6:verified welcome page using gmail");
	}

}

package StepDefinition;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;

import genericLibrary.WebDriverLibrary;
import hooks.TestHooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageRepository.CheckoutPage;
import pageRepository.ComputerNotebook;
import pageRepository.ShoppingCart;
import pageRepository.WelcomePage;

public class F1OrderProduct extends WebDriverLibrary{
	
//	WebDriver driver=TestHooks.driver;
	
	WelcomePage wpobj=new WelcomePage(stdriver);
	Actions actionobj =new Actions(stdriver);
	ComputerNotebook cnobj=new ComputerNotebook(stdriver);
	ShoppingCart scobj=new ShoppingCart(stdriver);
	CheckoutPage cpobj=new CheckoutPage(stdriver);
	WebDriverWait wait=new WebDriverWait(stdriver, Duration.ofSeconds(20));
	
	
	private static final Logger logger=LogManager.getLogger(LoginSteps.class);

	
	@When("i hovered on computers header")
	public void i_hovered_on_computers_header() {
		hoverOnElement(wpobj.getcomputerHeader());
		logger.info("Step 7:Moved and hovered on the Computer Header");
		
	}

	@Then("i should see list of product Headers")
	public void i_should_see_list_of_products() {
	    for(int i=0; i<wpobj.getcomputerHeaderList().size(); i++) {
	    	System.out.println(wpobj.getcomputerHeaderList().get(i).getText());
	    	
	    }
	    logger.info("Step 8:verified the all the names of  product headers in the computer header");
	}

	@Then("i clicked on Notebooks")
	public void i_clicked_on_notebooks() {
		clickOnElement_UsingActions(wpobj.getnotebooksheader());
	    logger.info("Step 9: Clicked on notebooks header");
	}

	@Then("i should see list of laptop products")
	public void i_should_see_list_of_laptop_products() {
	    System.out.println(cnobj.getnotebookProduct().isDisplayed());
	    logger.info("Step 10:Verified the list of products displayed or not");
	}

	@Then("i clicked on add to cart button of Laptop")
	public void i_clicked_on_add_to_cart_button_of_laptop() {
		clickOnElement(cnobj.getaddToCart());
	    logger.info("Step 11:Clicked on the add to cart button under the product image");
	}

	@Then("i clicked on shopping cart link")
	public void i_clicked_on_shopping_cart_link() {
		clickOnElement(wpobj.getshoppingcartlink());
	    logger.info("Step 12:Clicked on the shooping cart link");
	}

	@Then("i should see added product in shopping cart")
	public void i_should_see_added_product_in_shopping_cart() {
	    System.out.println(scobj.getproductAdded().isDisplayed());
	    logger.info("Step 13:Verified the product added is displayed in the shopping cart or not");
	}

	@Then("i clicked on terms and conditions checkbox")
	public void i_clicked_on_terms_and_conditions_checkbox() {
		clickOnElement(scobj.gettermsCheckbox());
	    logger.info("Step 14:Clicked on terms and conditions checkbox");
	}

	@Then("i clicked on checkout button")
	public void i_clicked_on_checkout_button() {
		clickOnElement(scobj.getcheckoutButton());
	    logger.info("Step 15:Clicked on checkout button");
	}

	@Then("i should see checkout page")
	public void i_should_see_checkout_page() {
	    System.out.println(cpobj.getcheckoutText().getText());
	    logger.info("Step 16:checkout text is displayed in the checkout page");
	}

	@Then("i clicked on Billing address continue button")
	public void i_clicked_on_billing_address_continue_button() {
		clickOnElement(cpobj.getBillingContinueButton());
	    logger.info("Step 17:clicked on billing address continue button");
	}

	@Then("i clicked on shipping address continue button")
	public void i_clicked_on_shipping_address_continue_button() {
		waitStatement(By.xpath("//input[@onclick='Shipping.save()']"));
		clickOnElement(cpobj.getshippingContinueButton());
	    logger.info("Step 18:clicked on shipping address continue button");
	}

	@Then("i clicked on shipping method continue button")
	public void i_clicked_on_shipping_method_continue_button() {
		waitStatement(By.xpath("//input[@onclick='ShippingMethod.save()']"));
		clickOnElement(cpobj.getshippingMethodButton());
	    logger.info("Step 19:clicked on shipping method continue button");
	}

	@Then("i clicked on payment method continue button")
	public void i_clicked_on_payment_method_continue_button() {
		waitStatement(By.xpath("//input[@onclick='PaymentMethod.save()']"));
		clickOnElement(cpobj.getpaymentMethodButton());
	    logger.info("Step 20:clicked on payment method continue button");
	}

	@Then("i clicked on payment information continue button")
	public void i_clicked_on_payment_information_continue_button() {
		waitStatement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
		clickOnElement(cpobj.getpaymentInfoButton());
	    logger.info("Step 21:clicked on payment information continue button");
	}

	@When("i clicked on confirm order button")
	public void i_clicked_on_confirm_order_button() {
		waitStatement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
		clickOnElement(cpobj.getconfirmButton());
	    logger.info("Step 22:clicked on confirm order button");
	}
	
	@Then("i should see-Your order has been successfully processed!")
	public void i_should_see_your_order_has_been_successfully_processed() {
		waitStatement(cpobj.getsuccessfulMsg());
	    System.out.println(cpobj.getsuccessfulMsg().getText());
	    logger.info("Step 23:successful msg is displayed after ordering the product");
	}

}

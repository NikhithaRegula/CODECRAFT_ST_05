package pageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CheckoutPage {
	
	@FindBy(xpath = "//h1[text()='Checkout']")
	private WebElement checkoutText;
	
	@FindBy(xpath = "//input[@onclick='Billing.save()']")
	private WebElement BillingContinueButton;
	
	@FindBy(xpath = "//input[@onclick='Shipping.save()']")
	private WebElement shippingContinueButton;
	
	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']")
	private WebElement shippingMethodButton;
	
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
	private WebElement paymentMethodButton;
	
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
	private WebElement paymentInfoButton;
	
	@FindBy(xpath="//input[@onclick='ConfirmOrder.save()']")
	private WebElement confirmButton;
	
	
	@FindBy(xpath = "//div[@class='title']")
	private WebElement successfulMsg;
	
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getcheckoutText() {
		return checkoutText;
	}
	
	public WebElement getBillingContinueButton() {
		return BillingContinueButton;
	}
	
	public WebElement getshippingContinueButton() {
		return shippingContinueButton;
	}
	
	public WebElement getshippingMethodButton() {
		return shippingMethodButton;
	}
	
	public WebElement getpaymentMethodButton() {
		return paymentMethodButton;
	}
	
	public WebElement getpaymentInfoButton() {
		return paymentInfoButton;
	}
	
	public WebElement getconfirmButton() {
		return confirmButton;
	}
	public WebElement getsuccessfulMsg() {
		return successfulMsg;
	}
}

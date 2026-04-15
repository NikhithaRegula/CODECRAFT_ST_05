package pageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {
	
	@FindBy(xpath = "(//img[@title='Show details for 14.1-inch Laptop'])[2]")
	private WebElement productAdded;
	
	@FindBy(id = "termsofservice")
	private WebElement termsCheckbox;
	
	@FindBy(id="checkout")
	private WebElement checkoutButton;
	
	public ShoppingCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getproductAdded() {
		return productAdded;
	}
	
	public WebElement gettermsCheckbox() {
		return termsCheckbox;
	}
	
	public WebElement getcheckoutButton() {
		return checkoutButton;
	}
}

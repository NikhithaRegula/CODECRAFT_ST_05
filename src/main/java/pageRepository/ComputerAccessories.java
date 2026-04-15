package pageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerAccessories {
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[2]")
	private WebElement addToCart1;
	
	@FindBy(xpath = "//input[@id='add-to-cart-button-66']")
	private WebElement addToCartButton;
	
	public ComputerAccessories(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getaddToCart1() {
		return addToCart1;
	}
	
	public WebElement getaddToCartButton() {
		return addToCartButton;
	}

}

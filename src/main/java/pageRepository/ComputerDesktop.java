package pageRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerDesktop {
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
	private WebElement addToCart1;
	
	@FindBy(xpath = "//input[@id='add-to-cart-button-72']")
	private WebElement addToCartButton;
	
	public ComputerDesktop(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getaddToCart1() {
		return addToCart1;
	}
	
	public WebElement getaddToCartButton() {
		return addToCartButton;
	}
}

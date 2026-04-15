package pageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage {
	
	@FindBy(xpath = "//input[@value='Add to cart']")
    private WebElement addToCart;
	
	public BookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getaddToCart() {
		return addToCart;
	}

}

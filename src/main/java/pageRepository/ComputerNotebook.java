package pageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerNotebook {
	
	@FindBy(xpath="//div[@class='product-item']")
	private WebElement notebookProduct;
	
	@FindBy(xpath = "//input[@value='Add to cart']")
	private WebElement addToCart;
	
	public ComputerNotebook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getnotebookProduct() {
		return notebookProduct;
	}
	public WebElement getaddToCart() {
		return addToCart;
	}

}

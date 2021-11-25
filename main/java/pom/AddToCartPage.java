package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage
{
    @FindBy(id="add")
    private WebElement addBtn;

	public WebElement getAddBtn() {
		return addBtn;
	}
    
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocartBtn;
	
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void addtocartBtn()
	{
		addtocartBtn.click();
	}
}

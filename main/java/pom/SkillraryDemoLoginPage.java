package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage
{
    @FindBy(id="course")
    private WebElement courseTab;

	public WebElement getCourseTab()
	{
		return courseTab;
	}
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumTraining;
	
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	public WebElement getCoursedd() {
		return coursedd;
	}

	public SkillraryDemoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void seleniumtrainingbtn()
	{
		seleniumTraining.click();
	}    
}

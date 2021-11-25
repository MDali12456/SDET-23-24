package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pom.AddToCartPage;
import pom.SkillraryDemoLoginPage;
import pom.SkillraryLoginPage;

public class AddingcourseTocart extends BaseClass

{
   @Test
   public void tc1() throws FileNotFoundException, IOException
   {
	   SkillraryLoginPage s=new SkillraryLoginPage(driver);
	   s.gearsButton();
	   s.demoApplication();
	   
	   SkillraryDemoLoginPage d=new SkillraryDemoLoginPage(driver);
	   utilities.switchTabs(driver);
	   utilities.mouseHover(driver, d.getCourseTab());
	   d.seleniumtrainingbtn();
	   
	   AddToCartPage a=new AddToCartPage(driver);
	   utilities.doubleClick(driver,a.getAddBtn());
	   a.addtocartBtn();
	   utilities.alertPopup(driver);
	   
	   Assert.assertEquals(driver.getTitle(),pdata.getData("skillrarytitle"));
	   
	   
	   
   }
}

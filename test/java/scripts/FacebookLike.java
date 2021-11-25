package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pom.FacebookPage;
import pom.SkillraryDemoLoginPage;
import pom.SkillraryLoginPage;
import pom.TestingPage;

public class FacebookLike extends BaseClass 
{
	@Test
	public void tc2() throws FileNotFoundException, IOException
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.demoApplication();
		
		SkillraryDemoLoginPage d=new SkillraryDemoLoginPage(driver);
		utilities.switchTabs(driver);
		utilities.dropDown(d.getCoursedd(),pdata.getData("coursedd"));
		
		TestingPage t=new TestingPage(driver);
	    utilities.dragAndDrop(driver, t.getSeleniumTraining(),t.getCartbtn());
	    
	    FacebookPage fb=new FacebookPage(driver);
	    fb.likebtn();
		
		
	}
}

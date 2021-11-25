package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pom.SeleniumPage;
import pom.SkillraryLoginPage;
import pom.TakeThisCoursePage;

public class ShareViaTwitter extends BaseClass
{
      @Test
      public void shareviatwitter() throws FileNotFoundException, IOException, InterruptedException
      {
    	  
    	  SkillraryLoginPage s=new SkillraryLoginPage(driver);
    	  s.searchTab(pdata.getData("coursename"));
    	  s.searchButton();
    	  
    	  SeleniumPage sp=new SeleniumPage(driver);
    	  sp.SeleniumTrainingtab();
    	  
    	  TakeThisCoursePage t=new TakeThisCoursePage(driver);
    	  utilities.switchFrame(driver);
    	  t.playButton();
    	  Thread.sleep(1000);
    	  t.pauseButton();
    	  utilities.switchBackFrame(driver);
    	  t.shareViaTwitter();
    	  
    	  Assert.assertEquals(driver.getCurrentUrl(),pdata.getData("url2"));
    	  
    	  
      }
      
}

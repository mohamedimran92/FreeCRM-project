package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.BrokenLinks;

public class BrokenLinksGoogle extends TestBase {
	
	@Test(threadPoolSize=2, invocationCount=2)
	public void init(){
		BrokenLinks BL=PageFactory.initElements(driver, BrokenLinks.class);
		BL.googlePage();
	}

}

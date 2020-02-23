package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomePageTest extends TestBase {

	@Test
	public void init(){
		
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		hp.getTittleOfThePage();
		hp.homePageTextVerification();
		hp.menuListVerification();
		
	}

	

}

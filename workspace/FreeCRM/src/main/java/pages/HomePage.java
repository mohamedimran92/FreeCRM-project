package pages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage{
	
	public WebDriver driver;
	public String heading;
	public int size;
	public int size1;
	public String textValue1;
	public String textValue2;
	public String text3;
	public String text4;
	public Actions action;
	
public HomePage(WebDriver driver) {
		this.driver=driver;
	}

@FindBy(how=How.XPATH, using=".//h1[contains(text(),'Free CRM Software in the Cloud')]") WebElement text1;
@FindBy(how=How.XPATH, using=".//h2[contains(text(),'Free Customer Relationship Management')]") WebElement text2;
@FindBy(how=How.XPATH, using=".//li[@class='rd-navbar--has-dropdown rd-navbar-submenu']/a") WebElement menuCRM;


	public void getTittleOfThePage(){
	heading=driver.getTitle();
	System.out.println("The title of the page is: " +heading );
	}
	
	public void homePageTextVerification(){
		textValue1=text1.getText();
		System.out.println("The text1 on the home page is :" +textValue1);
		assertEquals(textValue1,"Free CRM Software in the Cloud");
		textValue2=text2.getText();
		System.out.println("The text2 on the home page is :" +textValue2);
		assertEquals(textValue2,"Free Customer Relationship Management");	
	}
	
public void menuListVerification(){
	List<WebElement> menuList=driver.findElements(By.xpath(".//ul[@class='rd-navbar-nav']/li"));
	size=menuList.size();
	System.out.println("The size of the menu list is : " +size);
	
	for(int i=0;i<size;i++){
		text3=menuList.get(i).getText();
			System.out.println("The menu's are " + i + " is " +text3);
	}
	
	
}



}

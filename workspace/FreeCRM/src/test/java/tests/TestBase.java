package tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import util.TestUtil;


public class TestBase extends TestUtil	{
	public static WebDriver driver=null;
    
	@BeforeSuite
	public void initialization() throws Exception{
		
		
		driver=new FirefoxDriver();
	
		//System.setProperty("webdriver.chrome.driver", "E:\\testing\\eclipse-standard-luna-R-win32\\chromedriver.exe");
		//driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TestUtil TU=new TestUtil();
		TU.propertiesFileReader();
		driver.get(prop.getProperty("Url1"));

	}
	
	
	@AfterSuite
	public void TeardownTest(){
		//TestBase.driver.quit();
	}
	

}


//for loading configurations from properties files
//initializing webdriver
//including implicit waits
//extent reports
//create an object for FileInputStream to read data

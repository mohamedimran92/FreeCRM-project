package pages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BrokenLinks {
WebDriver driver;
public BrokenLinks(WebDriver driver) {
		this.driver=driver;
	}
	
public void googlePage(){
	
	List<WebElement> links=driver.findElements(By.tagName("a"));
	int size=links.size();
	System.out.println("There are "+size + "links available in google page");
	for(int i=0;i<size;i++){
		WebElement clickLink=links.get(i);
		String linkValue=clickLink.getAttribute("href");
		verifyTheLinkStatus(linkValue);
	}
	
	
}
	
public void verifyTheLinkStatus(String linkValue){
	
	try {
		URL url=new URL(linkValue);
		HttpURLConnection httpConnect=(HttpURLConnection)url.openConnection();
		httpConnect.setConnectTimeout(3000);
		httpConnect.connect();
		
		if(httpConnect.getResponseCode()==200){
			System.out.println("The link " + linkValue + "=" + httpConnect.getResponseMessage());
		}
		else
			if(httpConnect.getResponseCode()==404){
				System.out.println("The link " +linkValue + httpConnect.getResponseMessage());	
			}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
}
	
	
	
	
	
}

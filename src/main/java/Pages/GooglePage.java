package Pages;

import base.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends TestBase {


	@FindBy(xpath = "/html/body/div[7]/div/div[10]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div[1]/a/h3")
	WebElement link;
	
 	// Initializing the Page Objects:
	public GooglePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	

	public Wikipedia googleWikipedia(){
		link.click();

		return new Wikipedia();
	}



	
	
	
	
	
	
	

}

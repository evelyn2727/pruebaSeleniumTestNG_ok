package Pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

	//Page Factory - OR:
	@FindBy(name="q")
	WebElement texto;
	
	@FindBy(name="btnK")
	WebElement boton;
	
	@FindBy(className="lnXdpd")
	WebElement logo;

	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		boolean displayed =logo.isDisplayed();
		System.out.println("verificapaina Google:"+displayed);
		return driver.getTitle();
	}
	

	
	public GooglePage buscarWiki(String palabra){

		texto.click();
		 texto.sendKeys(palabra);
		boton.click();


		    	
		return new GooglePage();
	}
	
}

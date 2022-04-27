package Pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wikipedia extends TestBase {

    //Page Factory - OR:
    @FindBy(name="search")
    WebElement texto;

    @FindBy(id="searchButton")
    WebElement boton;

    @FindBy(id="Bienvenidos_a_Wikipedia,")
    WebElement logo;

    @FindBy(xpath="/html/body/div[3]/div[3]/div[5]/div[1]/ul[4]/li[2]/a")
    WebElement enlace;




    //Initializing the Page Objects:
    public Wikipedia(){
        PageFactory.initElements(driver, this);
    }

    //Actions:
    public String validateLogoWiki(){
        boolean displayed =logo.isDisplayed();
        System.out.println("verificapagina Wikipedia:"+displayed);
        return driver.getTitle();
    }



    public SeleniumPage buscarSelenium(String palabra){

        texto.click();
        texto.sendKeys(palabra);
        boton.click();

        return new SeleniumPage();
    }
    public SeleniumPage linkExterno( ){
        enlace.click();

        return new SeleniumPage();
    }

    public String verificarSitioWiki(){

        System.out.println("verificarSitioWiki:");

        return driver.getCurrentUrl();

    }
}

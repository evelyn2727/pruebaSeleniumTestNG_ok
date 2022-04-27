package Pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPage extends TestBase {
    @FindBy(xpath="/html/body/div[1]/div/div/div[1]/main/article/div/div/p[2]")
    WebElement texto;

    public SeleniumPage(){
        PageFactory.initElements(driver, this);
    }



    public String verificarTexto(){
        System.out.println("verificarTexto:");
       String bodyText = texto.getText();
        System.out.println("bodyText:"+bodyText);
          return  bodyText;
    }

    public String verificarSitioEnlace(){

        System.out.println("verificarSitioEnlace:");

        return driver.getCurrentUrl();

    }
}

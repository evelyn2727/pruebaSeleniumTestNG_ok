package com.company.testcases;


import Pages.GooglePage;
import Pages.LoginPage;
import Pages.SeleniumPage;
import Pages.Wikipedia;
import Utils.TestUtil;
import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.*;


public class HomePageTest extends TestBase {
    LoginPage loginPage;
    GooglePage homePage;
    TestUtil testUtil;
    Wikipedia wikiPedia;
    SeleniumPage seleniumPage;

    public HomePageTest() {
        super();
    }

    @BeforeClass
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        System.out.println("propety trxt:"+prop.getProperty("text"));
        homePage = loginPage.buscarWiki(prop.getProperty("text"));
    }


    @Test(priority=1)
    public void verifyHomePageTitleTest(){
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle, "wikipedia - Buscar con Google","Home page title not matched");
    }
    @Test(priority=2)
    public void googleWikipedia(){
        System.out.println("seleccionar página wikipedia:");
        wikiPedia= homePage.googleWikipedia();
        wikiPedia.verificarSitioWiki();
        Assert.assertEquals(prop.getProperty("sitiowiki"), "WWW.Wikipedia.com","Url diferentes");

    }

    @Test(priority=3)
    public void wikiSelenium(){
        wikiPedia = new Wikipedia();
        System.out.println("propety Wikipedia:"+prop.getProperty("Wikipedia"));
        seleniumPage = wikiPedia.buscarSelenium(prop.getProperty("Wikipedia"));
    }
    @Test(priority=4)
    public void linkExterno(){
        seleniumPage = wikiPedia.linkExterno();
        seleniumPage.verificarSitioEnlace();
        Assert.assertEquals(prop.getProperty("sitio"), "https//www.tutorialdeprogramacion.com/2019/08/tutorial-phyton-con-selenium.html","Url son diferentes");

    }
    @Test(priority=5)
    public void verificarTexto(){
     seleniumPage.verificarTexto();
     Assert.assertEquals(seleniumPage.verificarTexto(), "Selenium es un set de herramienta desarrolladas en java para automatización de tareas en navegadores orientadas al testing de páginas web.","Texto son diferentes");

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }



}

package com.company.testcases;


import Pages.SeleniumPage;
import Pages.Wikipedia;
import Utils.TestUtil;
import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class WikipediaPageTest extends TestBase {

    Wikipedia wikiPedia;
    SeleniumPage seleniumPage;
    TestUtil testUtil;

    public WikipediaPageTest() {
        super();
    }

    //test cases should be separated -- independent with each other
    //before each test case -- launch the browser and login
    //@test -- execute test case
    //after each test case -- close the browser

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
      //  contactsPage = new ContactsPage();
        wikiPedia = new Wikipedia();
        System.out.println("propety Wikipedia:"+prop.getProperty("Wikipedia"));
        seleniumPage = wikiPedia.buscarSelenium(prop.getProperty("Wikipedia"));
    }


    @Test(priority=1)
    public void verifyHomePageTitleTest(){
        String homePageTitle = wikiPedia.validateLogoWiki();
        Assert.assertEquals(homePageTitle, "Bienvenidos a Wikipedia,","Home page title not matched");
    }



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



}

package com.vg.webdriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestAutomation {
    //Init webdriver for chrome
    WebDriver driver;
    public final String USERNAME = "test.bruker.kenneth1234512@gmail.com";
    public final String ACCESS_KEY = "@awef11231";

    @Before
    public void init(){
        //Set chromedriver
        driver = new ChromeDriver();
        //Set property for chromedricer
        System.setProperty("webdriver.chrome.driver", "/Users/kennethngo/Documents/Selenium/chromedriver");
    }
    @Test
    public void logInVgTest(){

        //Navigate to VG mainpage
        driver.get("https://www.vg.no/");

        //Find login button and clock

        //Assert check to see if the title is correct
        Assert.assertEquals("Title check failed!", "Forsiden - VG", driver.getTitle());

    }

    @After
    public void exit(){
        //Close and quit driver
        driver.close();
        driver.quit();
    }

    public void css_click(String css_link){

    }
}

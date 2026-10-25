package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    @Test
    public void verifyHomePageTitle() {

        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();

            driver.get("https://the-internet.herokuapp.com/");

            String actualTitle = driver.getTitle();

            System.out.println("Page Title: " + actualTitle);

            Assert.assertEquals(actualTitle, "The Internet");

            System.out.println("Test Passed!");

        } finally {
            driver.quit();
        }
    }
}

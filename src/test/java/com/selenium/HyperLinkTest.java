
package com.selenium;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HyperLinkTest {

    @Test
    public void verifyHyperLink() throws Exception {

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {

            driver.manage().window().maximize();

            // 1. Navigate to the website
            driver.get("https://the-internet.herokuapp.com/");
                // Verify page title
    String actualTitle = driver.getTitle();

    System.out.println("Actual Title: " + actualTitle);

    Assert.assertEquals(actualTitle, "The Internet");


            // 2. Identify hyperlinks excluding footer
    WebElement element= driver.findElement(By.xpath("//*[text()='A/B Testing']"));
    element.click();
    driver.navigate().back();
            List<WebElement> hyperlinks =
                    driver.findElements(By.cssSelector("#content a"));

            // Store URLs locally
            List<String> urls = new ArrayList<>();

            for (WebElement link : hyperlinks) {

                String url = link.getAttribute("href");

                urls.add(url);
            }

            // 3. Print total number of links
            System.out.println("Total number of links: " + urls.size());

            // Print all URLs
            System.out.println("All Hyperlink URLs:");

            for (String url : urls) {

                System.out.println(url);
            }

        } catch (Exception | AssertionError e) {

            // Capture screenshot when test fails
            File screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);

            Files.copy(
                    screenshot.toPath(),
                    Path.of("screenshot.png"),
                    StandardCopyOption.REPLACE_EXISTING
            );

            throw e;

        } finally {

            // Close browser
            driver.quit();
        }
    }
}

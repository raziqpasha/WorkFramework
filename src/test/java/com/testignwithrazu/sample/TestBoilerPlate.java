package com.testignwithrazu.sample;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestBoilerPlate {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeTest
    public void setup(){
         driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
         wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://app.vwo.com/#/login");
    }

    @Test
    @Description("Login test for OrangeHRM")
    @Owner("raziq")
    public void logt(){
        // Locate and enter username
        WebElement emailField = driver.findElement(By.id("login-username"));
        emailField.sendKeys("testuser@example.com");

        // Locate and enter password
        WebElement passwordField = driver.findElement(By.id("login-password"));
        passwordField.sendKeys("Test@123");

        // Locate and click login button
        WebElement loginButton = driver.findElement(By.id("js-login-btn"));
        loginButton.click();

        Assert.assertTrue(driver.getTitle().equals("Login - VWO"));

    }

    @AfterTest
    public void teardown() throws InterruptedException {
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }


}

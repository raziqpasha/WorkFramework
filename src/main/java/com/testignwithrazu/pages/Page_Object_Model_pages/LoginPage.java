package com.testignwithrazu.pages.Page_Object_Model_pages;

import com.testignwithrazu.utils.propertyReader;
import com.testignwithrazu.utils.waitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginPage {


    WebDriver driver;

    //constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //action
    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");

    //method
    public String loginToVWOLoginInvalidCreds(String user, String pwd) {
        driver.get(propertyReader.readKey("url"));
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signButton).click();
        String error_msg = driver.findElement(error_message).getText();
        waitHelper.presenceOfElement(error_message);


        return error_msg;

    }


    //method
    public String loginToVWOLoginValidCreds(String users, String pwds) {
        driver.get(propertyReader.readKey("url"));
        waitHelper.implicitWait(driver,10);
       // driver.get("https://app.vwo.com/#/login");
        driver.findElement(username).sendKeys(users);
        driver.findElement(password).sendKeys(pwds);
        driver.findElement(signButton).click();

        waitHelper.waitJVM(3000);

        String error_msg = driver.findElement(error_message).getText();

        waitHelper.visibilityeOfElement(error_message);


        return error_msg;
    }
}
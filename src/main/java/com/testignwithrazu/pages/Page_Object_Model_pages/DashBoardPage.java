package com.testignwithrazu.pages.Page_Object_Model_pages;

import com.testignwithrazu.driver.DriverManager;
import com.testignwithrazu.utils.propertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoardPage {
     WebDriver driver;
    public DashBoardPage(WebDriver driver){
        DriverManager.driver=driver;
    }

    By singup = By.xpath("//a[@data-qa=\"bericafeqo\"]");

    public  void singfree(){
    driver.get(propertyReader.readKey("url"));
     driver.findElement(singup).click();
    }
}

package com.testignwithrazu.base;

import com.testignwithrazu.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static com.testignwithrazu.driver.DriverManager.driver;

public class commonToAllTest {

    @BeforeMethod
    public void setup(){
        DriverManager.init();;
    }

    @AfterMethod
    public void teardown(){
        if(driver!=null){
            driver.quit();
        }
    }
}

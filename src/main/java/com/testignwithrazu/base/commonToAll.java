package com.testignwithrazu.base;

import com.testignwithrazu.driver.DriverManager;
import com.testignwithrazu.utils.propertyReader;

import static java.sql.DriverManager.getDriver;

public class commonToAll {

    public void openUrl() {

        DriverManager.getDriver().get(propertyReader.readKey("url"));
    }

}

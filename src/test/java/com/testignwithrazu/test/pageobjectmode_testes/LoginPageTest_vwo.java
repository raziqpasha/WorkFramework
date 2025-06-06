package com.testignwithrazu.test.pageobjectmode_testes;

import com.testignwithrazu.base.commonToAllTest;
import com.testignwithrazu.driver.DriverManager;
import com.testignwithrazu.pages.Page_Object_Model_pages.DashBoardPage;
import com.testignwithrazu.pages.Page_Object_Model_pages.LoginPage;
import com.testignwithrazu.utils.propertyReader;
import io.qameta.allure.Description;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



import static com.testignwithrazu.driver.DriverManager.driver;
import static com.testignwithrazu.driver.DriverManager.getDriver;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



public class LoginPageTest_vwo extends commonToAllTest {
    private static final Logger logger = LogManager.getLogger(LoginPageTest_vwo.class);

    @Test(priority = 1)
    @Description("verify the negative testtcase")
    public void test_negative_vwo_login() {
        logger.info("login test starts");
        //  WebDriver driver = new EdgeDriver();
        LoginPage loginPage = new LoginPage(driver);

       // String actualError =




                loginPage.loginToVWOLoginInvalidCreds(propertyReader.readKey("username"), propertyReader.readKey("password"));
        //assertThat(actualError).isNotNull().isNotEmpty().isNotBlank();
      //  Assert.assertEquals(actualError, propertyReader.readKey("error_message"));

    }

    @Test(priority = 2)
    @Description("verify the dashboard page")
    public void test_vwo_dashbord() {
        WebDriver driver = new EdgeDriver();
        DashBoardPage dashBoardPage = new DashBoardPage(driver);
        dashBoardPage.singfree();
    }

}
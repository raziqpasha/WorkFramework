package com.testignwithrazu.test.pageobjectmode_testes;

import com.testignwithrazu.base.commonToAllTest;
import com.testignwithrazu.listerner.RetryAnalyzer;
import com.testignwithrazu.pages.Page_Object_Model_pages.DashBoardPage;
import com.testignwithrazu.pages.Page_Object_Model_pages.LoginPage;
import com.testignwithrazu.utils.propertyReader;
import io.qameta.allure.Description;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.testignwithrazu.driver.DriverManager.driver;

@Test(retryAnalyzer = RetryAnalyzer.class)
public class listerner_test extends commonToAllTest {
    private static final Logger logger = LogManager.getLogger(listerner_test.class);

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
            DashBoardPage dashBoardPage = new DashBoardPage(driver);
            dashBoardPage.singfree();
        }

    }



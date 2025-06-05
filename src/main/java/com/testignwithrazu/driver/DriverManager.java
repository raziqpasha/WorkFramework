package com.testignwithrazu.driver;

import com.testignwithrazu.utils.propertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverManager {
public static WebDriver driver;
//public static WebDriverWait wait;
    public static void setDriver(WebDriver driver){

        DriverManager.driver=driver;
    }

    public static WebDriver getDriver(){

        return driver;
    }

    public static void init(){
        String browser = propertyReader.readKey("browser");
        switch (browser){
            case "Edge":
                EdgeOptions options1 = new EdgeOptions();
                options1.addArguments("--guest");
                options1.addArguments("--start maximized");
                driver=new EdgeDriver(options1);
                break;

            case "Chrome":
                ChromeOptions options2 = new ChromeOptions();
                options2.addArguments("--guest");
                options2.addArguments("--start maximized");
                driver=new ChromeDriver(options2);
                break;

            case "firefox":
                FirefoxOptions options3 = new FirefoxOptions();
                options3.addArguments("--guest");
                options3.addArguments("--start maximized");
                driver=new FirefoxDriver(options3);
                break;

            default:
                System.out.println("Browser Not Supported");

        }
    }

}

package com.testignwithrazu.utils;

import com.testignwithrazu.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static com.google.common.util.concurrent.Futures.withTimeout;
import static com.testignwithrazu.driver.DriverManager.driver;

public class waitHelper {

    //java wait
    public static void waitJVM(int time){
        try{
            Thread.sleep(time);
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
    //implimity wait
    public static void implicitWait(WebDriver driver,int time){
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    //visibility of element to be loacted
    public static void checkVisibilty(WebDriver driver, By locator,int time){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    //visibility of element to be loacted without time
    public static void checkVisibilty(WebDriver driver, By locator){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    //text to be present in the elemnt
    public static void toCheckTextToBePresent(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.textToBePresentInElement(element,"Your email, password, IP address or location did not match"));
    }

//fluentwait
        public static void fluentwait(WebDriver driver, By locator) {
            FluentWait<WebDriver> wait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(10))
                    .pollingEvery(Duration.ofSeconds(5))
                    .ignoring(NoSuchElementException.class);

            WebElement error_message = wait.until(new Function<WebDriver, WebElement>() {
                public WebElement apply(WebDriver driver) {

                    return driver.findElement(locator);
                }
            });
    }
public static WebElement presenceOfElement(By elementLocation){
        return new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
}

    public static WebElement presenceOfElement(WebDriver driver,By elementLocation){
        return new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public static WebElement visibilityeOfElement(By elementLocation){
        return new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public static WebElement visibilityeOfElement(WebDriver driver,By elementLocation){
        return new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public static WebElement getElement(By key){
        return driver.findElement(key);
    }




}

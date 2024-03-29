package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class TestBaseUtils {
    WebDriver driver;
    public TestBaseUtils(WebDriver driver) {
        this.driver = driver;
    }



    public void login(String emailAddress, String password,WebElement email_Web,WebElement pass_Web, WebElement login_Web) {
        waitAndSendkeys(email_Web,emailAddress);
        waitAndSendkeys(pass_Web,password);
        waitAndClick(login_Web);
    }

    public WebElement waitAndSendkeys(WebElement element, Object value) {
        WebElement find;
        WebDriverWait wait = new WebDriverWait(driver, 3);
        find = wait.until(ExpectedConditions.visibilityOf(element));

        highLightElement(driver, element);
        if (value != null) {
            element.sendKeys(value.toString());
        }
        return find;
    }

    public void waitAndClick(WebElement element){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofMillis(100)).ignoring(NoSuchElementException.class);
        highLightElement(driver,element);
        wait.until(ExpectedConditions.visibilityOf(element)).click();
        System.out.println(element.toString() + "is clicked sucessfully");
    }

//    public void waitAndClick(WebElement element){
//        highLightElement(driver, element);
//
//        WebElement find;
//        WebDriverWait wait = new WebDriverWait(driver,3);
//        find = wait.until(ExpectedConditions.visibilityOf(element));
//        find.click();
//        System.out.println(element + "is clicked sucessfully");
//
//    }







    public static void highLightElement(WebDriver driver , WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js. executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:yellow')", element);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){

        }
        js. executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:white')", element);


    }
}


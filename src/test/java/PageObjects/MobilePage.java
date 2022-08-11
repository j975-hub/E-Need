package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MobilePage {
    WebDriver driver;
    public MobilePage(WebDriver driver){
        this.driver=driver;
    }

    private By mobileText = By.xpath("//h1[text()='Mobile']");


    public String getMobileText(){
       return driver.findElement(mobileText).getText();
    }
}

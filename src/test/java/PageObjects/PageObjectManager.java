package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    WebDriver driver;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public HomePage HomePage(){

        HomePage homePage = new HomePage(driver);
        return homePage;
    }

    public  MobilePage mobilePage(){
        MobilePage mobilePage = new MobilePage(driver);
        return mobilePage;
    }
    public  CommonPage commonPage(){
        CommonPage commonPage = new CommonPage(driver);
        return  commonPage;
    }
}

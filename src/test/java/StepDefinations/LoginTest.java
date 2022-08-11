package StepDefinations;

import Base.BaseClass;
import PageObjects.HomePage;
import PageObjects.PageObjectManager;
import Utils.TestBaseUtils;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;

public class LoginTest extends TestBaseUtils {
  public TestContextSetup testContextSetup;
    public LoginTest(TestContextSetup testContextSetup) throws IOException {
        super(testContextSetup.baseClass.driver);
        this.testContextSetup = testContextSetup;
    }


    @Given("User will enter credential to Login Page")
    public void user_will_enter_credential_to_login_page() throws IOException {

//        testContextSetup.driver.findElement(By.xpath("")).sendKeys("");
//
//        HomePage hp = new HomePage(testContextSetup.driver);
//        hp.setEmailAddress().sendKeys();
//
//        PageObjectManager pageObjectManager = new PageObjectManager(testContextSetup.driver);
//        pageObjectManager.HomePage().setEmailAddress().sendKeys();
    try{
        String email_ID = testContextSetup.baseClass.prop.getProperty("Email-address");
        String password = testContextSetup.baseClass.prop.getProperty("Password");
        WebElement email_Web = testContextSetup.pageObjectManager.HomePage().setEmailAddress();
        WebElement pass_Web = testContextSetup.pageObjectManager.HomePage().setPassword();
        WebElement login_Web = testContextSetup.pageObjectManager.HomePage().setLoginButton();

        login(email_ID ,password ,email_Web ,pass_Web ,login_Web);

    } catch (Exception e){
        Assert.fail("Failed To Login The Browser......!" + e );
        e.printStackTrace();
    }


    }


}

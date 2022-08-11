package StepDefinations;

import Utils.TestBaseUtils;
import Utils.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.IOException;

public class TestCase1 extends TestBaseUtils {
    TestContextSetup testContextSetup;
    public TestCase1(TestContextSetup testContextSetup) throws IOException {
        super(testContextSetup.baseClass.driver);
        this.testContextSetup = testContextSetup;
    }

    @Given("User Is On Landing Page")
    public void user_is_on_landing_page() {
        System.out.println("We are in the Landing page");

        try{
           WebElement mobileLink_Web = testContextSetup.pageObjectManager.HomePage().clickMagentoLogoLink();
           waitAndClick(mobileLink_Web);
        } catch (Exception e){
            Assert.fail("User Failed to Landing Page : "+e);
            e.printStackTrace();
        }
    }
    @Given("^User see the title of the Home page$")
    public void user_see_the_title_of_the_home_page() throws Throwable {
       try{
           String title = testContextSetup.baseClass.driver.getTitle();
           System.out.println("Home Page Title : "+title );
       }catch (Exception e){
           Assert.fail("User do not see the title of the Home page "+e);
           e.printStackTrace();
       }
    }
    @When("^User click on mobile menu$")
    public void user_click_on_mobile_menu() throws Throwable {
      try{
          WebElement mobile_Web = testContextSetup.pageObjectManager.HomePage().clickMobileLink();
          waitAndClick(mobile_Web);
      } catch (Exception e){
          Assert.fail("User Failed to Click on Mobile Menu : "+e);
          e.printStackTrace();
      }
    }
    @Then("^User see the title of the Mobile page$")
    public void user_see_the_title_of_the_mobile_page() throws Throwable {
        try {
            String title = testContextSetup.baseClass.driver.getTitle();
            System.out.println("Mobile Page Title : "+title );
        }catch (Exception e){
            Assert.fail("User do not see the title of the Mobile page "+e);
            e.printStackTrace();
        }
    }
    @And("^User sort mobile using \"([^\"]*)\" dropdown$")
    public void user_sort_mobile_using_dropdown(String strArg) throws Throwable {
        try {
            WebElement sort_Web = testContextSetup.pageObjectManager.commonPage().setSortDropDown();
            Select sc = new Select(sort_Web);
            sc.selectByVisibleText(strArg);
        }catch (Exception e){
            Assert.fail("User unable to sort the "+strArg+" dropdown "+e);
            e.printStackTrace();
        }
    }
    @And("^User see all products are sorted by \"([^\"]*)\"$")
    public void user_see_all_products_are_sorted_by_something(String strArg) throws Throwable {
       try {
            String expectedText = strArg;
            String actualText = testContextSetup.pageObjectManager.commonPage().setSortBy().getText();
            System.out.println("Expected Text : "+expectedText);
           System.out.println("Actual Text : "+actualText);
            Assert.assertEquals(expectedText,actualText);
       }catch (Exception e){
           Assert.fail("User unable see all products  sorted by "+strArg+" dropdown "+e);
           e.printStackTrace();
       }
    }
}

package StepDefinations;

import Base.BaseClass;
import Utils.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Hooks {
    TestContextSetup testContextSetup;


    public Hooks(TestContextSetup testContextSetup){

        this.testContextSetup = testContextSetup;
    }



    @After
    public void tearDownBrowser() throws IOException, InterruptedException {
        Thread.sleep(3000);
       // testContextSetup.baseClass.initializeDriver().quit();
    }
}

package Utils;

import Base.BaseClass;
import PageObjects.PageObjectManager;
import StepDefinations.Hooks;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;

public class TestContextSetup  {

public BaseClass baseClass;
//public WebDriver driver;
public PageObjectManager pageObjectManager;
//public TestBaseUtils testBaseUtils;



    public TestContextSetup() throws IOException {
    baseClass = new BaseClass();
    pageObjectManager = new PageObjectManager(baseClass.initializeDriver());
   // testBaseUtils = new TestBaseUtils(baseClass.initializeDriver());

    }
}

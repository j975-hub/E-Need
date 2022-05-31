package PageObjects;

import org.openqa.selenium.By;

public class CommonPage {

    By aboutUs = By.xpath("//span[text()='Company']/ancestor::div/following-sibling::ul//a[text()='About Us']");
    By contactUs = By.xpath("//span[text()='Company']/ancestor::div/following-sibling::ul//a[text()='Contact Us']");
    By customerService = By.xpath("//span[text()='Company']/ancestor::div/following-sibling::ul//a[text()='Customer Service']");
    By privacyPolicy = By.xpath("//span[text()='Company']/ancestor::div/following-sibling::ul//a[text()='Privacy Policy']");
    By siteMap = By.xpath("//span[text()='Quick Links']/../../following-sibling::ul//a[text()='Site Map']");
    By searchItem = By.xpath("//span[text()='Quick Links']/../../following-sibling::ul//a[text()='Search Terms']");
    By advanceSearch = By.xpath("//span[text()='Quick Links']/../../following-sibling::ul//a[text()='Advanced Search']");
    By myAccount = By.xpath("//span[text()='Account']/ancestor::div/following-sibling::ul//a[text()='My Account']");
    By ordersAndReturns = By.xpath("//span[text()='Account']/ancestor::div/following-sibling::ul//a[text()='Orders and Returns']");
    By subscribeButton = By.xpath("//span[text()='Subscribe']/../parent::button");
    By newsLetterTextBox = By.xpath("//span[text()='Subscribe']/ancestor::div/child::div//input[@id='newsletter']");
    By paypalOption = By.xpath("//img[@title='Additional Options']");
    By sortByDropDown = By.xpath("//label[text()='Sort By']/following-sibling::select");
    By arrowDirection = By.xpath("//label[text()='Sort By']/following-sibling::a");
    By viewAs = By.xpath("//label[text()='View as']/following-sibling::strong");
    By hamburgerMenu = By.xpath("//label[text()='View as']/following-sibling::a");
    By showDropDown = By.xpath("//label[text()='Show']/following-sibling::select");

}

package PageObjects;

import org.openqa.selenium.By;

public class HomePage {

    By emailAddress = By.xpath("//label[text()='Email Address']/following-sibling::div/input[@type='email']");
    By password = By.xpath("//label[text()='Password']/following-sibling::div/input[@type='password']");
    By forgotYourPassword = By.xpath("//a[text()='Forgot Your Password?']");
    By backToLogin = By.xpath("//label[text()='Email Address']/ancestor::div/following-sibling::div/descendant::a[text()='Back to Login']");
    By submitButton = By.xpath("//label[text()='Email Address']/ancestor::div/following-sibling::div/child::button//span[text()='Submit']");
    By loginButton = By.xpath("//label[text()='Email Address']/ancestor::div/following-sibling::div/child::button//span[text()='Login']");
    By createAnAccount = By.xpath("//span[text()='Create an Account']/parent::span/parent::a");
}

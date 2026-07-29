package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locate username input by XPath (using attribute @name='username')
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement usernameField;

    // Locate password input by XPath (using attribute @name='password')
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordField;

    // Locate login button by XPath (button element with type='submit')
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButton;

    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}

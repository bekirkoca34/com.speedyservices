package com.speedyservices.pages;

import com.speedyservices.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@href='/login'])[1]")
    public WebElement signInIcon;

    @FindBy(id = "userName")
    public  WebElement userName;

    @FindBy(id = "Password")
    public  WebElement password;

    @FindBy(id = "loginBtn")
    public  WebElement loginBtn;


    @FindBy(xpath = "//div[@class='custom-validation-alert']")
    public WebElement assertMessage;

}

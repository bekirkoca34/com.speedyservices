package com.speedyservices.stepDefinitions;

import com.speedyservices.pages.LoginPage;
import com.speedyservices.utilities.ConfigReader;
import com.speedyservices.utilities.Driver;
import com.speedyservices.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SpeedyServicesLogin_StepDefs {

    // create an object from LoginPage
    LoginPage loginPage=new LoginPage();

    @Given("user Open chrome browser and navigates to URL {string}")
    public void user_navigates_to_url(String speedyservices_url) {

        Driver.getDriver().get(ConfigReader.getProperty(speedyservices_url));

    }
    @Then("user click sign in icon and login using {string} and {string}")
    public void user_login_using_and(String Username, String Password) throws InterruptedException {


    loginPage.signInIcon.click();
    Thread.sleep(2);
    loginPage.userName.sendKeys(ConfigReader.getProperty("Username"));
    Thread.sleep(2);
    loginPage.password.sendKeys(ConfigReader.getProperty("Password"));
    Thread.sleep(2);

    }
    @Then("user click login button")
    public void user_click_login_button() {

   loginPage.loginBtn.click();

    }
    @Then("user verifies Assert message “Username or password is invalid”")
    public void user_verifies_assert_message_username_or_password_is_invalid() {

        // There are many diffrent ways for verifying the massage, first one is isDisplayed() method
        Assert.assertTrue(loginPage.assertMessage.isDisplayed());

    }

    }

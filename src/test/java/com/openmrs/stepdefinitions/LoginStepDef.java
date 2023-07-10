package com.openmrs.stepdefinitions;

import com.openmrs.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ConfigReader;
import utils.DriverHelper;

public class LoginStepDef {
    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage=new LoginPage(driver);

    @Given("User Provides the username and password with {string}")
    public void userProvidesTheUsernameAndPasswordWith(String location) {
        loginPage.login(ConfigReader.readProperty("QA_username"),ConfigReader.readProperty("QA_password"),location);

    }
    @Then("User validates the {string} and {string}")
    public void userValidatesTheAnd(String expectedTitle, String expectedUrl) {
        Assert.assertEquals(expectedTitle,driver.getTitle().trim());
        Assert.assertEquals(expectedUrl,driver.getCurrentUrl().trim());
    }

    @Given("User provides {string} and {string} with {string}")
    public void userProvidesAndWith(String username, String password, String location) {
    loginPage.login(username,password,location);
    }
    @Then("User validates {string}")
    public void userValidates(String expMessage) {
        Assert.assertEquals(expMessage, loginPage.validateMessage());
    }




}

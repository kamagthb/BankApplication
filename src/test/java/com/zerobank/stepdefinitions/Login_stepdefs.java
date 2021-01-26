package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_stepdefs {

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials()  {
        LoginPage loginPage=new LoginPage();
        loginPage.loginValidCredentials();


    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        String actual_Title= Driver.get().getTitle();
        Assert.assertEquals("http://zero.webappsecurity.com/index.html",actual_Title);


    }

    @When("the user enters {string} {string} as invalid credentials")
    public void the_user_enters_as_invalid_credentials(String username, String password) {
        LoginPage loginPage=new LoginPage();
        loginPage.loginİnvalidCredentials(username,password);

    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {
        Assert.assertTrue("get error message",new LoginPage().errorMessage.isDisplayed());
    }

}

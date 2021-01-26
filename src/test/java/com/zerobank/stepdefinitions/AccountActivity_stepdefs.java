package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityage;
import com.zerobank.pages.AccountSummarypage;
import com.zerobank.pages.LoginPage;
import com.zerobank.pages.PayBillspage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivity_stepdefs {


    @Given("the user is logged in")
    public void the_user_is_logged_in() {
      new LoginPage().loginValidCredentials();
    }

    @When("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {
        new AccountSummarypage().Savingstab.click();

    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        Assert.assertTrue(Driver.get().getTitle().equals("Zero - Account Activity"));
    }

    @Then("Account drop down should have Savings selected")
    public void account_drop_down_should_have_Savings_selected() {

        Select dropdown=new Select(new AccountActivityage().DropDownList);
        Assert.assertTrue(dropdown.getFirstSelectedOption().getText().equals("Savings"));
    }

    @When("the user clicks on Brokerage link on the Account Summary page")
    public void the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page() {
        new AccountSummarypage().Brokeragetab.click();
    }

    @Then("Account drop down should have Brokerage selected")
    public void account_drop_down_should_have_Brokerage_selected() {
        Select dropdown=new Select(new AccountActivityage().DropDownList);
        dropdown.selectByValue("Brokerage");
        Assert.assertTrue(dropdown.getFirstSelectedOption().getText().equals("Brokerage"));
    }

    @When("the user clicks on Checking link on the Account Summary page")
    public void the_user_clicks_on_Checking_link_on_the_Account_Summary_page() {
     new AccountSummarypage().Checkingtab.click();
    }

    @Then("Account drop down should have Checking selected")
    public void account_drop_down_should_have_Checking_selected() {
        Select dropdown=new Select(new AccountActivityage().DropDownList);
        dropdown.selectByValue("Checking");
        Assert.assertTrue(dropdown.getFirstSelectedOption().getText().equals("Checking"));
    }

    @When("the user clicks on Credit card link on the Account Summary page")
    public void the_user_clicks_on_Credit_card_link_on_the_Account_Summary_page() {
        new AccountSummarypage().CreditCardtab.click();

    }

    @Then("Account drop down should have Credit Card selected")
    public void account_drop_down_should_have_Credit_Card_selected() {
        Select dropdown=new Select(new AccountActivityage().DropDownList);
        dropdown.selectByValue("Credit Card");
        Assert.assertTrue(dropdown.getFirstSelectedOption().getText().equals("Credit Card"));
    }

    @When("the user clicks on Loan link on the Account Summary page")
    public void the_user_clicks_on_Loan_link_on_the_Account_Summary_page() {
       new AccountSummarypage().Loantab.click();
    }

    @Then("Account drop down should have Loan elected")
    public void account_drop_down_should_have_Loan_elected() {
        Select dropdown=new Select(new AccountActivityage().DropDownList);
        dropdown.selectByValue("Loan");
        Assert.assertTrue(dropdown.getFirstSelectedOption().getText().equals("Loan"));
    }

}

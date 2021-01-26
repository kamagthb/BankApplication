package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityage;
import com.zerobank.pages.AccountSummarypage;
import com.zerobank.pages.Homepage;
import com.zerobank.pages.PayBillspage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountSummary_stepdefs {



    @Then("Page title should be changed to {string}")
    public void page_title_should_be_changed_to(String expectedPagetitle) {
        String actualPageTitle= Driver.get().getTitle();
        Assert.assertEquals(expectedPagetitle,actualPageTitle);

    }

    @Then("Account	summary	page	should	have	to	following	account	types:")
    public void account_summary_page_should_have_to_following_account_types(List<String> expectedTitles) {
        List<String> actualTitles= BrowserUtils.getElementsText(new AccountSummarypage().AllTitles);
        Assert.assertEquals(expectedTitles,actualTitles);

    }

    @Then("In	the	Account	drop down default option should	be Savings")
    public void ın_the_Account_drop_down_default_option_should_be_Savings() {

        Select dropdown=new Select(new AccountActivityage().DropDownList);
        Assert.assertTrue(dropdown.getFirstSelectedOption().getText().equals("Savings"));
    }

    @Then("Account	drop	down	should	have	the	following	options:")
    public void account_drop_down_should_have_the_following_options(List<WebElement>expecteddropoptions) {
        Select dropdown=new Select(new AccountActivityage().DropDownList);
        List<WebElement> actualdropoptions=dropdown.getOptions();

       Assert.assertEquals(expecteddropoptions,actualdropoptions);

    }

    @Then("Transactions table should have following column names:")
    public void transactions_table_should_have_following_column_names(List<WebElement> expectedcolumnames) {
    List<WebElement> actualcolumnames=new AccountActivityage().ColumnList;
    Assert.assertEquals(expectedcolumnames,actualcolumnames);
    }

    @When("user completes a successful Pay operation takes success message")
    public void user_completes_a_successful_Pay_operation_takes_success_message() {
        Select select1=new Select(new PayBillspage().Date);
        select1.selectByIndex(1);
        Select select2=new Select(new PayBillspage().Account);
        select2.selectByIndex(1);
        PayBillspage payBillspage=new PayBillspage();
        payBillspage.Amount.sendKeys("1");
        payBillspage.Date.sendKeys("1");
        payBillspage.Discription.sendKeys("a");
        payBillspage.PayClickButton.click();

        Assert.assertEquals("The payment was successfully submitted.",payBillspage.PayMessage.getText());




    }

    @When("user tries to make a payment without entering the	amount or date,error message should	be displayed")
    public void user_tries_to_make_a_payment_without_entering_the_amount_or_date_error_message_should_be_displayed() {
        Select select1=new Select(new PayBillspage().Date);
        select1.selectByIndex(1);
        Select select2=new Select(new PayBillspage().Account);
        select2.selectByIndex(1);
        PayBillspage payBillspage=new PayBillspage();
        payBillspage.Amount.sendKeys("1");

        payBillspage.Discription.sendKeys("a");
        payBillspage.PayClickButton.click();



    }


    @When("user clicks on Account Summary")
    public void userClicksOnAccountSummary() {
        new Homepage().AccountSummary.click();
    }

    @When("user clicks on AccountActivity")
    public void userClicksOnAccountActivity() {
        new Homepage().AccountActivity.click();
    }

    @When("user clicks on Pay Bills")
    public void userClicksOnPayBills() {
        new PayBillspage().PayBiilstab.click();
    }
}

package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillspage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PurchaseForeignCur_stepdefs {

    @Given("the user accesses the Purchase foreign currency cash tab")
    public void the_user_accesses_the_Purchase_foreign_currency_cash_tab() {
        new PayBillspage().PurchaseForeignCurrencytab.click();
    }

    @Then("following currencies should be available")
    public void following_currencies_should_be_available(List<String> expectedlist) {

       List<String> actuallist= BrowserUtils.getElementsText(new PayBillspage().currencylist);
        Assert.assertTrue(actuallist.contains(expectedlist));
    }

    @When("user tries	to	calculate cost without selecting a  currency")
    public void user_tries_to_calculate_cost_without_selecting_a_currency() {
      PayBillspage payBillspage=new PayBillspage();
      new PayBillspage().AmountTab.sendKeys("5");
     payBillspage.CalculateButton.click();
    }

    @Then("error message should be	displayed")
    public void error_message_should_be_displayed() {
        Alert alert= Driver.get().switchTo().alert();
        alert.accept();


    }


    @When("user tries to calculate	cost without  entering  a value")
    public void user_tries_to_calculate_cost_without_entering_a_value() {
        PayBillspage payBillspage=new PayBillspage();
        payBillspage.selectbutton.click();
        payBillspage.CalculateButton.click();



    }
}

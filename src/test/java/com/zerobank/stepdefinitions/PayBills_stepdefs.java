package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillspage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Map;

public class PayBills_stepdefs {
    @Given("Add New Payee	tab")
    public void add_New_Payee_tab() {
       new PayBillspage().AddNewPayeeTab.click();


    }

    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String,String> Info) {

        PayBillspage payBillspage=new PayBillspage();
        payBillspage.PayeenameTab.sendKeys(Info.get("Payee Name"));
        payBillspage.PayeeadressTab.sendKeys(Info.get("Payee Address"));
        payBillspage.PayeeaccountTab.sendKeys(Info.get("Account"));
        payBillspage.PayeedetailsTab.sendKeys(Info.get("Payee details"));
        payBillspage.addButton.click();

    }

    @Then("message The new payee The Law Offices of Hyde, Price & Scharks was successfully created. should be displayed")
    public void message_The_new_payee_The_Law_Offices_of_Hyde_Price_Scharks_was_successfully_created_should_be_displayed() {
        Assert.assertEquals("The new payee The Law Offices of Hyde, Price & Scharks was successfully created.",new PayBillspage().addMessage.getText());


    }


}

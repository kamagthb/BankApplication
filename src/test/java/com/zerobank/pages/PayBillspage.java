package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PayBillspage {

    public PayBillspage(){

        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(id = "sp_payee")
    public  WebElement   Payee;

    @FindBy(id = "sp_account")
    public WebElement  Account;

    @FindBy(id = "sp_amount")
    public WebElement Amount;

    @FindBy(id = "sp_date")
    public WebElement Date;

    @FindBy(id = "sp_description")
    public WebElement Discription;

    @FindBy(id = "pay_saved_payees")
    public WebElement PayClickButton;

    @FindBy(id = "pay_bills_tab")
    public WebElement PayBiilstab;

    @FindBy(xpath = "//*[.='The payment was successfully submitted.']")
    public WebElement PayMessage;

    @FindBy(linkText = "Add New Payee")
    public WebElement AddNewPayeeTab;

    @FindBy(xpath = "//*[.='Payee Name']")
    public WebElement PayeenameTab;

    @FindBy(xpath = "//*[.='Payee Address']")
    public WebElement PayeeadressTab;

    @FindBy(xpath = "//*[.='Account']")
    public WebElement PayeeaccountTab;

    @FindBy(xpath = "//*[.='Payee Details']")
    public WebElement PayeedetailsTab;

    @FindBy(id = "add_new_payee")
    public WebElement addButton;

    @FindBy(id = "alert_content")
    public WebElement addMessage;

    @FindBy(linkText = "Purchase Foreign Currency")
    public WebElement PurchaseForeignCurrencytab;

    @FindBy(id = "pc_currency")
    public WebElement currencylist;

    @FindBy(xpath = "(//label[.='Amount'])[2]")
    public WebElement AmountTab;

    @FindBy(id = "purchase_cash")
    public WebElement PurchaseButton;

    @FindBy(id = " c_calculate_costs")
    public WebElement CalculateButton;

    @FindBy(xpath = "(//*[@class='radio inline'][2]")
    public WebElement selectbutton;







    public void verifyPageTitle(){
        String pagetitle=Driver.get().getTitle();
        Assert.assertEquals("Zero-Pay Bills",pagetitle);
        
    }
}


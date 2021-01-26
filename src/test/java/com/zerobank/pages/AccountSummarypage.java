package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountSummarypage {

    public AccountSummarypage (){

        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "//h2")
    public List<WebElement> AllTitles;

    @FindBy(xpath = "//h2[1]")
    public WebElement Cash_Accounts;

    @FindBy(xpath = "//h2[2]")
    public WebElement Investment_Accounts;

    @FindBy(xpath = "//h2[3]")
    public WebElement Credit_Accounts;

    @FindBy(xpath = "//h2[4]")
    public WebElement Loan_Accounts;

    @FindBy(xpath = "(//table)[3]//tr//th[1]")
    public WebElement Account;

    @FindBy(xpath = "(//table)[3]//td[1]")
    public WebElement Checking;

    @FindBy(xpath = "//*[.='Savings']")
    public WebElement Savingstab;

    @FindBy(xpath = "((//table)[3]//tr)[3]//td//a")
    public WebElement CreditCard;

    @FindBy(xpath = "//*[.='Brokerage']")
    public WebElement Brokeragetab;

    @FindBy(xpath = "//*[.='Checking']")
    public WebElement Checkingtab;

    @FindBy(xpath = "(//*[.='Credit Card'])[2]")
    public WebElement CreditCardtab;

    @FindBy(xpath = "//*[.='Loan']")
    public WebElement Loantab;








    public void verifyPageTitle(){
        String pagetitle=Driver.get().getTitle();
        Assert.assertEquals("Zero-Account Summary",pagetitle);

    }
}


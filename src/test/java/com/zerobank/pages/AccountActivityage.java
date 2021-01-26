package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountActivityage {

    public AccountActivityage(){

        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "//table[1]//tr//th")
    public List<WebElement> ColumnList;

    @FindBy(id = "aa_accountId")
    public WebElement DropDownList;

    @FindBy(xpath = "//table[1]//tr//th[1]")
    public WebElement Date;

    @FindBy(xpath = "//table[1]//tr//th[2]")
    public WebElement Description;

    @FindBy(xpath = "///table[1]//tr//th[3]")
    public WebElement Deposit;

    @FindBy(xpath = "//table[1]//tr//th[4]")
    public WebElement Withdrawal;

    @FindBy(xpath = "//*[.='Find Transactions']/a")
    public WebElement FindTransactionsTab;


    public void verifyPageTitle(){
        String pagetitle=Driver.get().getTitle();
        Assert.assertEquals("Zero-Account Activity",pagetitle);
        
    }
}


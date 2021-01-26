package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    public Homepage(){

        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(id = "account_summary_link")
    public WebElement AccountSummary;

    @FindBy(id = "account_activity_link")
    public WebElement AccountActivity;




}


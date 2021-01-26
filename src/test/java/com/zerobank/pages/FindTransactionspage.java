package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FindTransactionspage {

    public FindTransactionspage(){

        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(id = "aa_description")
    public WebElement Descriptiontab;

    @FindBy(id = "aa_fromDate")
    public WebElement FromdateTAB;

    @FindBy(id = "aa_toDate")
    public WebElement Todatetab;

    @FindBy(id = "aa_fromAmount")
    public WebElement FromAmounttab;

    @FindBy(id = "aa_fromAmount")
    public WebElement Toamounttab;

    @FindBy(id = "aa_fromAmount")
    public WebElement Typetab;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement Findbutton;

    @FindBy(xpath = "(//tbody//tr)/td[1]")
    public List<WebElement> datetable;

    @FindBy(xpath = "((//table)[2]//tr)/td[2]")
    public List<WebElement> rowinfo;

    @FindBy(xpath = "((//table)[2]//tr)/td[4]")
    public List<WebElement> withdrawalinfo;

    @FindBy(xpath = "((//table)[2]//tr)/td[3]")
    public List<WebElement> depositinfo;









}

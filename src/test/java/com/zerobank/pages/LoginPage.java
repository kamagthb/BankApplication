package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy (id="signin_button")
    public  WebElement signin_button;

    @FindBy (id="user_login")
    public  WebElement user_login;

    @FindBy (id="user_password")
    public  WebElement user_password;

    @FindBy (name="submit")
    public  WebElement submit_button;

    @FindBy (css="alert.alert-error")
    public  WebElement errorMessage;

    @FindBy (id="primary-button")
    public  WebElement popUpMessage;

    @FindBy (xpath="p//strong[.='Online Banking']")
    public  WebElement OnlineBankingButton;

    @FindBy (id="account_summary_link")
    public  WebElement AccountSummaryLink;



    public void loginValidCredentials()  {
        Driver.get().get(ConfigurationReader.get("url"));
        signin_button.click();
       String username= ConfigurationReader.get("username");
       String password= ConfigurationReader.get("password");

        user_login.sendKeys(username);
        user_password.sendKeys(password);
        submit_button.click();

        popUpMessage.click();
        Alert alert=Driver.get().switchTo().alert();
        alert.accept();


    }
    public void loginİnvalidCredentials(String username,String password)  {

        Driver.get().get(ConfigurationReader.get("url"));
        signin_button.click();
        user_login.sendKeys(username);
        user_password.sendKeys(password);
        submit_button.click();




    }

}


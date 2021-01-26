package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityage;
import com.zerobank.pages.FindTransactionspage;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FindTransactions_stepdefs {

    @Given("the	user	accesses	the	Find	Transactions	tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
      new AccountActivityage().FindTransactionsTab.click();
    }

    @When("the	user	enters	date	range	from	“{int}-{int}-{int}”	to	“{int}-{int}-{int}”")
    public void the_user_enters_date_range_from_to(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6) {
        FindTransactionspage findTransactionspage=new FindTransactionspage();
        findTransactionspage.FromdateTAB.sendKeys(int1+"-"+int2+"-"+int3);
        findTransactionspage.Todatetab.sendKeys(int4+"-"+int5+"-"+int6);




    }

    @When("clicks	search")
    public void clicks_search() {
        new FindTransactionspage().Findbutton.click();
    }

    @Then("results	table	should	only	show	transactions	dates	between	“{int}-{int}-{int}”	to	“{int}-{int}-{int}”")
    public void results_table_should_only_show_transactions_dates_between_to(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6) {
        List<WebElement> table=new FindTransactionspage().datetable;
        for (WebElement eachrow : table) {
            String date=eachrow.getText();
            Integer actualdate=Integer.parseInt(date.substring(8,10));
            Assert.assertTrue(actualdate<=int6);

        }
    }

    @Then("the	results	should	be	sorted	by	most	recent	date")
    public void the_results_should_be_sorted_by_most_recent_date() {
    FindTransactionspage findTransactionspage=new FindTransactionspage();
    List<WebElement> datelist=findTransactionspage.datetable;
    int max=32;
    if(datelist.size()==0){
        Assert.assertTrue(datelist.size()==0);
    }else if(datelist.size()==1){
        Assert.assertTrue(datelist.size()==1);
    }else{
        for (WebElement webElement : datelist) {
            Integer datenum=Integer.parseInt(webElement.getText().substring(8,10));
           if (datenum<max){
               Assert.assertTrue(datenum<max);
               max=datenum;

           }else{
               Assert.assertTrue(datenum>max);
           }
        }
    }

    }

    @Then("the	results	table	should	only	not	contain	transactions	dated	“{int}-{int}-{int}”")
    public void the_results_table_should_only_not_contain_transactions_dated(Integer int1, Integer int2, Integer int3) {
        List<WebElement> table = new FindTransactionspage().datetable;
        for (WebElement eachrow : table) {
            String date = eachrow.getText();
            Integer actualdate = Integer.parseInt(date.substring(8, 10));
            Assert.assertFalse(actualdate==1);
        }

    }







    @Then("results	table	should	show	at	least	one	result	under	Deposit")
    public void results_table_should_show_at_least_one_result_under_Deposit() {
        FindTransactionspage findTransactionspage=new FindTransactionspage();
        List<WebElement> infolist=findTransactionspage.rowinfo;
        for (WebElement webElement : infolist) {
            Assert.assertTrue(webElement.isDisplayed());
            break;
        }

    }



    @Then("results	table	should	show	no	result	under	Withdrawal")
    public void results_table_should_show_no_result_under_Withdrawal() {
        FindTransactionspage findTransactionspage=new FindTransactionspage();
        List<WebElement> infolist=findTransactionspage.withdrawalinfo;
       Assert.assertTrue(infolist.size()==0);

    }




    @When("the user enters description {string}")
    public void theUserEntersDescription(String data) {
        new FindTransactionspage().Descriptiontab.sendKeys(data);
    }

    @Then("results table should only show descriptions containing {string}")
    public void resultsTableShouldOnlyShowDescriptionsContaining(String data) {
        FindTransactionspage findTransactionspage=new FindTransactionspage();
        List<WebElement> infolist=findTransactionspage.rowinfo;
        for (WebElement webElement : infolist) {
            Assert.assertTrue(webElement.getText().contains(data));
        }

    }



    @But("results	table should not show descriptions containing {string}")
    public void resultsTableShouldNotShowDescriptionsContaining(String data) {
        FindTransactionspage findTransactionspage = new FindTransactionspage();
        List<WebElement> infolist = findTransactionspage.rowinfo;
        for (WebElement webElement : infolist) {
            Assert.assertTrue(webElement.getText().contains(data));
        }

    }

    @Then("results	table	should	show	at	least	one	result	under	Withdrawal")
    public void resultsTableShouldShowAtLeastOneResultUnderWithdrawal() {
        FindTransactionspage findTransactionspage=new FindTransactionspage();
        List<WebElement> infolist=findTransactionspage.withdrawalinfo;
        for (WebElement webElement : infolist) {
            Assert.assertTrue(webElement.isDisplayed());
            break;
        }}

    @When("user selects type {string}")
    public void userSelectsType(String selecttype) {
        FindTransactionspage findTransactionspage=new FindTransactionspage();
        WebElement selectlist=findTransactionspage.Typetab;
        Select select=new Select(selectlist);
        select.selectByValue(selecttype);
    }

    @But("results	table	should	show	no	result	under	Deposit")
    public void resultsTableShouldShowNoResultUnderDeposit() {
        FindTransactionspage findTransactionspage=new FindTransactionspage();
        List<WebElement> infolist=findTransactionspage.depositinfo;
        Assert.assertTrue(infolist.size()==0);

    }}




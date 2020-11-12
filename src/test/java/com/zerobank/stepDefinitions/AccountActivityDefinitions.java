package com.zerobank.stepDefinitions;

import com.zerobank.pages.AccountActivityPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountActivityDefinitions {

    AccountActivityPage accountActivityPage= new AccountActivityPage();

    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_account_summary_page(String btnName) {
        accountActivityPage.accountTypes(btnName);
    }


/*
    @Then("the {string} page should be displayed")
    public void the_page_should_be_displayed(String string) {


    }
    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String string) {

    }
*/
}

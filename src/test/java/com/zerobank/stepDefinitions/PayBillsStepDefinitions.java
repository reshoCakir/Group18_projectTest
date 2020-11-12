package com.zerobank.stepDefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.pages.PayBillsPage;
import com.zerobank.utils.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Map;

public class PayBillsStepDefinitions {

    PayBillsPage payBillsPage = new PayBillsPage();
    LoginPage loginPage = new LoginPage();



    @Given("Add New Payee tab")
    public void add_new_payee_tab() {
        loginPage.login();
        loginPage.click_topTab_PayBillsTab();
        payBillsPage.click_On_tab_Add_New_Payee();

    }

    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String,String> dataPayee) {

        Browser.waitToVisible(payBillsPage.getElementsOfAddNewPayee());

        payBillsPage.expected_Msg_Success_Add_New_Payee = "The new payee "+dataPayee.get("Payee Name")+" was successfully created.";

        String payeeName = dataPayee.get("Payee Name");
        String payeeAddress = dataPayee.get("Payee Address");
        String payeeAccount = dataPayee.get("Account");
        String payeeDetails = dataPayee.get("Payee details");

        payBillsPage.enterPayeeName(payeeName);
        payBillsPage.enterPayeeAddress(payeeAddress);
        payBillsPage.enterPayeeAccount(payeeAccount);
        payBillsPage.enterPayeeDetails(payeeDetails);
        payBillsPage.click_On_Add_Btn();



    }

    @Then("message The new payee The Law Offices of Hyde, Price & Scharks was successfully created. should be displayed")
    public void message_the_new_payee_the_law_offices_of_hyde_price_scharks_was_successfully_created_should_be_displayed() {

        payBillsPage.success_Msg_New_Payee_is_Visible();

        Assert.assertEquals(payBillsPage.expected_Msg_Success_Add_New_Payee,
                payBillsPage.text_Of_Success_Msg_New_Payee());



    }





}

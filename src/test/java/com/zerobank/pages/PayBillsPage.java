package com.zerobank.pages;

import com.library.utils.BrowserUtilities;
import com.zerobank.utils.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PayBillsPage extends BasePage{

    public String expected_Msg_Success_Add_New_Payee;

    @FindBy(id = "np_new_payee_name")
    private WebElement box_Payee_Name;

    @FindBy(id = "np_new_payee_address")
    private WebElement box_Payee_Address;

    @FindBy(id = "np_new_payee_account")
    private WebElement box_Account;

    @FindBy(id = "np_new_payee_details")
    private WebElement box_Payee_Details;

    @FindBy(xpath = "//a[.='Add New Payee']")
    private WebElement tab_Add_New_Payee;

    @FindBy(id = "add_new_payee")
    private WebElement add_Btn;

    @FindBy(id = "alert_content")
    private WebElement success_Msg_New_Payee;





    @FindBy(xpath = "//div[@id='ui-tabs-2']//div[@class= 'control-group']")
    private List<WebElement> elementsOfAddNewPayee;

    public void click_On_tab_Add_New_Payee(){
        Browser.waitElementToBeClickableAndClick(tab_Add_New_Payee);
    }

    public void enterPayeeName(String payeeName){
        Browser.enterTextWhenVisible(box_Payee_Name,payeeName);
    }

    public void enterPayeeAddress(String payeeAddress){
        Browser.enterTextWhenVisible(box_Payee_Address,payeeAddress);
    }

    public void enterPayeeAccount(String payeeAccount){
        Browser.enterTextWhenVisible(box_Account,payeeAccount);
    }

    public void enterPayeeDetails(String payeeDetails){
        Browser.enterTextWhenVisible(box_Payee_Details,payeeDetails);
    }

    public void click_On_Add_Btn(){
        add_Btn.click();
    }

    public WebElement getSuccess_Msg_New_Payee(){
        return success_Msg_New_Payee;
    }

    public String text_Of_Success_Msg_New_Payee(){
        return getSuccess_Msg_New_Payee().getText();
    }

    public void success_Msg_New_Payee_is_Visible(){
       Browser.elementIsVisible(success_Msg_New_Payee);
    }






    public List<WebElement> getElementsOfAddNewPayee(){
        return elementsOfAddNewPayee;
    }



}

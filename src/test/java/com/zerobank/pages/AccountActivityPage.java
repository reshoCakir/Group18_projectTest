package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class AccountActivityPage {

    @FindBy(xpath = "//li[@id=\"onlineBankingMenu\"]/div/strong")
    private WebElement onlineBankingLink;

    @FindBy(id="account_summary_link")
    private WebElement accountSummaryLink;

    @FindBy(xpath = "(//table[@class=\"table\"]//tr/td/a[1])[1]")
    private WebElement savingButton;

    @FindBy(xpath = "(//table[@class=\"table\"]//tr/td/a[1])[3]")
    private WebElement brokerageButton;

    @FindBy(xpath = "(//table[@class=\"table\"]//tr/td/a[1])[4]")
    private WebElement checkingButton;

    @FindBy(xpath = "(//table[@class=\"table\"]//tr/td/a[1])[5]")
    private WebElement creditCardButton;

    @FindBy(xpath = "(//table[@class=\"table\"]//tr/td/a[1])[6]")
    private WebElement loanButton;



    @FindBy(xpath="//select[@name='accountId']")
    private WebElement accountSelectDropDown;



}

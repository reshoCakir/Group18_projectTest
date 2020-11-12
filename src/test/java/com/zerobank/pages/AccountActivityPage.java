package com.zerobank.pages;

import com.zerobank.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;

public class AccountActivityPage extends BasePage{

    @FindBy(xpath = "//li[@id=\"onlineBankingMenu\"]/div/strong")
    private WebElement onlineBankingLink;

    @FindBy(id="account_summary_link")
    private WebElement accountSummaryPage;

    @FindBy(xpath = "(//table[@class=\"table\"]//tr/td/a[1])[1]")
    private WebElement savingsButton;

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


    public void clickOnAccountSummary(){
        wait.until(ExpectedConditions.elementToBeClickable(accountSummaryPage)).click();
        System.out.println("clicking on the Account Summary link");
    }

        public void accountTypes(String btnName){
           WebElement btn = Driver.getDriver().findElement(By.xpath("//a[.='"+btnName+"'] "));
            wait.until(ExpectedConditions.elementToBeClickable(savingsButton)).click();
            System.out.println("clicking on "+btnName);

        }




}

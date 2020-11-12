package com.zerobank.pages;

import com.zerobank.utils.ConfigurationReader;
import com.zerobank.utils.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{

    @FindBy(id = "user_login")
    private WebElement userName_Enter;

    @FindBy(id = "user_password")
    private WebElement userName_Password;

    public void getUrl(){
        String url = ConfigurationReader.getProperty("onlineBankURL");
        Driver.getDriver().get(url);
    }


    public void login(){
        getUrl();
        userName_Enter.sendKeys(ConfigurationReader.getProperty("onlineBankUsername"));
        userName_Password.sendKeys(ConfigurationReader.getProperty("onlineBankPassword")+Keys.ENTER);
    }

}

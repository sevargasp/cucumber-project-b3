package io.loop.pages;

import io.loop.utilities.BrowserUtils;
import io.loop.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartBearLoginPage extends SmartBearBasePage{
    @FindBy(xpath = "//label[.='Username:']/following-sibling::input[1]")
    public WebElement username;

    @FindBy(xpath = "//label[.='Password:']/following-sibling::input[1]")
    public WebElement password;

    @FindBy(xpath = "//label[.='Password:']/following-sibling::input[2]")
    public WebElement logginButton;

    public  void LoggIn(){
//        username.clear();
        BrowserUtils.waitForVisibility(username, 10);//wait upto
        username.sendKeys(ConfigurationReader.getProperties("smart.username"));
//        password.clear();
        password.sendKeys(ConfigurationReader.getProperties("smart.password"));
        logginButton.click();



    }
}

package io.loop.pages;

import io.loop.utilities.BrowserUtils;
import io.loop.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SmartBearOrderPage extends SmartBearBasePage {

    Select dropdown;

    JavascriptExecutor js;
    @FindBy(xpath = "//label[contains(.,'Quantity:')]/following-sibling::input")
    public WebElement quantity;
    @FindBy(xpath = "//label[contains(.,'Customer name:')]/following-sibling::input")
    public WebElement customerName;
    @FindBy(xpath = "//label[contains(.,'Street:')]/following-sibling::input")
    public WebElement street;

    @FindBy(xpath = "//label[contains(.,'City:')]/following-sibling::input")
    public WebElement city;

    @FindBy(xpath = "//label[contains(.,'State:')]/following-sibling::input")
    public WebElement state;

    @FindBy(xpath = "//label[contains(.,'Zip:')]/following-sibling::input")
    public WebElement zip;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$cardList']//following-sibling::label")
    public List<WebElement> cardList;
    @FindBy(xpath = "//label[contains(.,'Card Nr:')]/following-sibling::input")
    public WebElement cardNro;
    @FindBy(xpath = "//label[contains(.,'Expire date (mm/yy):')]/following-sibling::input")
    public WebElement cardExpiration;

    @FindBy (xpath = "//a[contains(.,'Process')]")
    public WebElement processButton;

    //methods

    public void clicking(){
        BrowserUtils.waitForVisibility(processButton, 10);
        js=(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()",processButton);

    }
    public void sendCardExpiration(String cardExpirationNum){
        cardExpiration.sendKeys(cardExpirationNum);
    }

    public void sendCardNro(String cardNumber){
        cardNro.sendKeys(cardNumber);
    }

    public void sendCard(String cardOption) {
//        for (int i = 0; i < cardList.size(); i++) {
//            if(cardList.get(i).getText().contains(cardOption)){
//                cardList.get(i).click();
//                break;
//            }
//
//        }
        cardList.forEach(each -> {
            if (each.getText().contains(cardOption)) {
                each.click();
            }
        });

    }

    public void sendState(String stateName) {
        state.sendKeys(stateName);
    }

    public void sendZip(String zipName) {
        zip.sendKeys(zipName);
    }

    public void sendCity(String cityName) {
        city.sendKeys(cityName);
    }

    public void sendStreet(String streetName) {
        street.sendKeys(streetName);
    }

    public void sendCustomerName(String name) {
        customerName.sendKeys(name);
    }

    public void sendQuantity(Integer quantity) {
        this.quantity.clear();
        this.quantity.sendKeys(quantity + "");
    }

    public void goesToProduct(String product) {
        dropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")));
        dropdown.selectByVisibleText(product);
    }
}

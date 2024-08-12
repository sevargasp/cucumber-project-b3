package io.loop.pages;

import io.loop.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.List;

public class SmartBearBasePage {
    public SmartBearBasePage() {
        //initialize my constructor
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2[contains(.,'List of All Orders')]//following-sibling::div//td[2]")
    public List<WebElement> rows;
    @FindBy(xpath = "//strong[contains(text(),'New order has been successfully added.')]")
    public WebElement doneMessage;
    @FindBy(xpath = "//a[.='Order']")
    public WebElement order;

    public void orderPage() {
        order.click();
    }

    @FindBy(xpath = "//a[.='View all orders']")
    public WebElement viewAllOrders;

    public void allOrdersButton() {
        viewAllOrders.click();

    }

    public void getRows(String nameOrder) {
//        rows.forEach(each -> {
//            if (each.getText().contains(nameOrder)) {
//                System.out.println("this is truth");
//
//            }

//        });

    }
}
package io.loop.pages;

import io.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    //initialize my constructor
    public GoogleSearchPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "q")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@id='gbqfbb']/preceding-sibling::input")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='PZPZlf ssJ7i B5dxMb']")
    public WebElement capital;
}
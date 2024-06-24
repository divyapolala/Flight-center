package com.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class SearchResultsPage {
    private WebDriver driver;

    @FindBy(className = "Non-stop")
    private WebElement Nonstop;

    @FindBy(className = "test-oneStop")
    private WebElement oneStop;

    @FindBy(xpath = "//*[@id=\"results-screen\"]/div/div[1]/div[1]/div/div/div/div[3]/div[4]/label/span[2]")
    private WebElement twoStops;

    @FindBy(className = "tabDetail-0-119")
    private WebElement Cheapest;

    @FindBy(className = "tabDetail-0-119")
    private WebElement Quickest;

    @FindBy(className = "tabDetail-0-119")
    private WebElement Best;

    @FindBy(className = "jss207")
    private WebElement ButtonWrapper;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void Nonstop() {
        if (!Nonstop.isSelected()) {
            Nonstop.click();
        }
    }

    public void oneStop() {
        if (!oneStop.isSelected()) {
            oneStop.click();
        }
    }

    public void twoStops() {
        if (!twoStops.isSelected()) {
            twoStops.click();
        }
    }

    public void Cheapest() {
        Cheapest.click();
    }

    public void Quickest() {
        Quickest.click();
    }

    public void Best() {
        Best.click();
    }

    public void ButtonWrapper() {
        ButtonWrapper.click();
        {

        }
    }
}

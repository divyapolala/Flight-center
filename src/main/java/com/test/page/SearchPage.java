package com.test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    private WebDriver driver;

    @FindBy(id="origin")
    private WebElement origin;

    @FindBy(id = "destination")
    private WebElement destination;

    @FindBy(xpath = "//*[@id=\"__next\"]/main/div[2]/div/div[2]/div[1]/div/div/div/div/div/div/div[4]/div[1]/div/div/input")
    private WebElement dates;

//    @FindBy(xpath = "//*[@id=\"__next\"]/main/div[2]/div/div[2]/div[1]/div/div/div/div/div/div/div[4]/div[1]/div/div/input")
//    private WebElement fromAndToDates;
//
      @FindBy(xpath = "//*[@id=\"__next\"]/main/div[2]/div/div[2]/div[1]/div/div/div/div/div/div/div[4]/div[2]/button")
       private WebElement searchFlight;

    public SearchPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public void origin(String fromlocation) {

        origin.sendKeys(fromlocation);
        driver.findElement(By.id("origin-option-1")).click();
    }

    public void destination(String tolocation){

        destination.sendKeys(tolocation);
        driver.findElement(By.id("destination-option-0")).click();
    }

    public void travelDates(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='Wed,  Jun - Sun, 16 Jul';", dates);

    }

    public void searchFlight(){

        searchFlight.click();
    }

    public WebElement getSearchFlight(){
        return searchFlight;
    }

    }


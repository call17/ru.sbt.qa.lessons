package ru.sbt.lesson3.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Felix on 22.06.2017.
 */
public class PageMail extends Page {

    @FindBy(xpath = "//div[@class='mail-MessageSnippet-FromText']/@title")
    private WebElement mailClick;

    public void srchMail(){
        mailClick.click();

    }

}
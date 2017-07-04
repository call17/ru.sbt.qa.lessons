package ru.sbt.lesson3.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Created by dmitriy on 20.06.17.
 */
public class Page {
    private WebDriver driver;

    WebDriver getDriver() {
        if (driver == null) {

            String pathToDriver = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";
            System.setProperty("webdriver.chrome.driver",pathToDriver);
            driver = new ChromeDriver();
        }
        return driver;
    }

    public void openUrl(String url){
        getDriver().get(url);
    }
}
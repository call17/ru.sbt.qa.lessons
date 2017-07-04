package ru.sbt.lesson2.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Created by Felix on 07.06.2017.
 */
public class PageLogin extends Page {


    public void loginMail(String mail, String pass) {
        getDriver().findElement(By.name("login")).sendKeys(mail);
        getDriver().findElement(By.name("passwd")).sendKeys(pass);
        getDriver().findElement(By.xpath("//button/span[text()='Войти']")).submit();
    }
}
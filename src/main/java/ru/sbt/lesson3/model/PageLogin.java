package ru.sbt.lesson3.model;

import org.openqa.selenium.By;


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
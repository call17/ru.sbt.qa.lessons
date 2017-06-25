package ru.sbt.lesson3.model.page;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MainMailPage extends PageObject{

        public static Target BUTTON_INBOX= Target.the("Войти").locatedBy("//span[contains(., 'Входящие')]");

}

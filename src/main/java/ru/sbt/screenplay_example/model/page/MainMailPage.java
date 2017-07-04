package ru.sbt.screenplay_example.model.page;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MainMailPage extends PageObject{

        public static Target CREATE_MAIL_BUTTON = Target.the("Войти").locatedBy(".//span[text() = 'Написать']");
        public static Target DESCRIPTION_MAIL_FORM = Target.the("Тема письма").locatedBy(".//*[@id='cke_1_contents']/div");
        public static Target CONTACT_ADRESS_FORM = Target.the("Адрес получателя").locatedBy(".//*[@name='to']");
        public static Target SEND_MAIL_BUTTON = Target.the("Отправить письмо").locatedBy(".//span[text() = 'Отправить']");

}

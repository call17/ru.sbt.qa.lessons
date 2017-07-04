package ru.sbt.screenplay_example.model.page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;


@DefaultUrl("https://mail.yandex.ru/")
public class AuthorizeMailPage extends PageObject{

    public static Target LOGIN_FIELD = Target.the("Поле логина").locatedBy(".//*[@id='nb-1']/span/input");
    public static Target PASSWORD_FIELD  = Target.the("Поле пароля").locatedBy(".//*[@id='nb-2']/span/input");

}

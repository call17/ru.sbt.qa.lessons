package ru.sbt.screenplay_example.model.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ru.sbt.screenplay_example.model.page.MainMailPage;

public class MailPageQuestions implements Question<Boolean> {

    private MainMailPage mainMailPage;

    public Boolean answeredBy(Actor actor) {


        return mainMailPage.containsElements(".//span[text() = 'Входящие']");
    }

    public static Question<Boolean> displayed() {
        return new MailPageQuestions();
    }


}

package ru.sbt.lesson3.model.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ru.sbt.lesson3.model.page.MainMailPage;

public class MailPageQuestions implements Question<Boolean> {

    private MainMailPage mainMailPage;

    public Boolean answeredBy(Actor actor) {


        return mainMailPage.containsElements(String.valueOf(mainMailPage.BUTTON_INBOX));
    }

    public static Question<Boolean> displayed() {
        return new MailPageQuestions();
    }


}

package ru.sbt.screenplay_example.model.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import ru.sbt.screenplay_example.model.page.AuthorizeMailPage;


public class OpenMailHome implements Task {

    private AuthorizeMailPage yandexMailPage;

    @Step("Open the application")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(yandexMailPage)
        );
    }
}

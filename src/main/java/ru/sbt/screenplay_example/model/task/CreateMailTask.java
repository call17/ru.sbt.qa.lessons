package ru.sbt.screenplay_example.model.task;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ru.sbt.screenplay_example.model.page.MainMailPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateMailTask implements Task {


    private String mailDescription;
    private String address;

    protected CreateMailTask(String mailDescription, String adress) {

        this.mailDescription = mailDescription;
        this.address = adress;
    }

    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(MainMailPage.CREATE_MAIL_BUTTON)
        );


        actor.attemptsTo(
                Enter.theValue(mailDescription)
                        .into(MainMailPage.DESCRIPTION_MAIL_FORM)
        );

        actor.attemptsTo(
                Enter.theValue(address)
                        .into(MainMailPage.CONTACT_ADRESS_FORM)

        );

        actor.attemptsTo(
                Click.on(MainMailPage.SEND_MAIL_BUTTON)

        );
    }

    public static CreateMailTask sendMailWithDescriprion(String mailDescription, String adress) {
        return instrumented(CreateMailTask.class, mailDescription, adress);
    }
}

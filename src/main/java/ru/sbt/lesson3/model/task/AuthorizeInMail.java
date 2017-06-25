package ru.sbt.lesson3.model.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import ru.sbt.lesson3.model.page.AuthorizeMailPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ru.sbt.lesson3.model.page.AuthorizeMailPage.LOGIN_FIELD;
import static ru.sbt.lesson3.model.page.AuthorizeMailPage.PASSWORD_FIELD;


public class AuthorizeInMail implements Task {

    private AuthorizeMailPage loginPage;

    private String login;
    private String password;

    protected AuthorizeInMail(String login, String password) {

        this.login = login;
        this.password = password;
    }

    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(login)
                .into(LOGIN_FIELD)
        );

        actor.attemptsTo(
                Enter.theValue(password)
                .into(PASSWORD_FIELD)
                        .thenHit(Keys.ENTER)

        );
    }

    public static AuthorizeInMail authorizeWithLoginAndPasswod(String login, String password) {
        return instrumented(AuthorizeInMail.class, login, password);
    }

}

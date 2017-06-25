package serenity;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import ru.sbt.lesson3.model.questions.MailPageQuestions;
import ru.sbt.lesson3.model.task.AuthorizeInMail;
import ru.sbt.lesson3.model.task.OpenMailHomePage;


import static net.serenitybdd.screenplay.GivenWhenThen.*;


@RunWith(SerenityRunner.class)
public class SimpleTest {

    private Actor vasya = Actor.named("James");

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    @Steps
    private OpenMailHomePage openTheApplication;

    @Before
    public void jamesCanBrowseTheWeb() {
        vasya.can(BrowseTheWeb.with(hisBrowser));
    }

    @Test
    public void login_in_mail(){

        givenThat(vasya).wasAbleTo(openTheApplication);

        when(vasya).attemptsTo(AuthorizeInMail
                .authorizeWithLoginAndPasswod("sbt.lesson.qa", "q12345678"));

        then(vasya).should(seeThat(MailPageQuestions.displayed()));

    }

}

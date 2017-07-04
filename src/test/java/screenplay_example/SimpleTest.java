package screenplay_example;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import ru.sbt.screenplay_example.model.questions.MailPageQuestions;
import ru.sbt.screenplay_example.model.task.AuthorizeInMail;
import ru.sbt.screenplay_example.model.task.CreateMailTask;
import ru.sbt.screenplay_example.model.task.OpenMailHome;


import static net.serenitybdd.screenplay.GivenWhenThen.*;


@RunWith(SerenityRunner.class)
public class SimpleTest {

    private Actor vasya = Actor.named("James");

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    @Steps
    private OpenMailHome openTheApplication;

    @Before
    public void jamesCanBrowseTheWeb() {
        vasya.can(BrowseTheWeb.with(hisBrowser));
    }

    @Test
    public void login_in_mail(){

        givenThat(vasya).wasAbleTo(openTheApplication);

        when(vasya).attemptsTo(AuthorizeInMail
                .authorizeWithLoginAndPassword("sbt.lesson.qa", "q12345678"));

        then(vasya).should(seeThat(MailPageQuestions.displayed()));

        then(vasya).attemptsTo(CreateMailTask.sendMailWithDescriprion("Hello","123@gmail.com"));

    }

}

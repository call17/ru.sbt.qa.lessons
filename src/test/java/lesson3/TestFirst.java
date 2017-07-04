package lesson3;


import org.junit.Test;
import ru.sbt.lesson3.model.PageLogin;
import ru.sbt.lesson3.model.PageMail;

import java.io.IOException;

/**
 * Created by Felix on 07.06.2017.
 */
public class TestFirst  {


    @Test
    public void first() throws IOException{
        PageLogin test = new PageLogin();
        PageMail mail = new PageMail();
        test.openUrl("https://mail.yandex.ru/");
        test.loginMail("login", "pass");
        mail.srchMail();
    }
}

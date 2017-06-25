package lesson5;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by dmitriy on 21.06.17.
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/java/lesson5/features")
public class RunnerCucumber {

}

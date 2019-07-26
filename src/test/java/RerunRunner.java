import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/reports","rerun:target/Failed/rerun.txt"},
        features = "@target/Failed/rerun.txt"


        //,glue={"src/main/"}

)

public class RerunRunner {

}

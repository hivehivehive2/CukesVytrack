
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/reports","rerun:target/Failed/rerun.txt"},
//        features = "src/main/resources/Activities_A.feature"
//        features = "src/main/resources/Activities_A.feature:3"
//        features = "src/main/resources/Activities_A.feature:18"
//        features = "src/main/resources/Activities_A.feature:27"
        features = "src/main/resources/Activities_B.feature:3"
//       features = "src/main/resources/Customers.feature:8"
//        features = "src/main/resources/Customers.feature:30"
//        features = "src/main/resources/DAshboards.feature"
//        features = "src/main/resources/Fleet.feature"
//        features = "src/main/resources/Login_Navigation.feature:6"
//        features = "src/main/resources/Login_Navigation.feature:31"
//        features = "src/main/resources/Login_Navigation.feature:43"
//        features = "src/main/resources/Marketing.feature"
//        features = "src/main/resources/Reports_And_Segments.feature"
//        features = "src/main/resources/Sales.feature"
//        features = "src/main/resources/System.feature"

        //features = "src/main/resources"
        //,glue={"java"}
        //   ,tags= {"@smoke"}
)

public class Runner {

}

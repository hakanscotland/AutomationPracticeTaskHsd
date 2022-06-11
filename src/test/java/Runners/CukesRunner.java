package Runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		//tags = "@tag1",
        features = "src/test/resources/features",
        glue = "Step_Definitions",
        dryRun = false

)
public class CukesRunner {

}

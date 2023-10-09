package runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/DemoRestAPITest.feature"},
        glue = {"step.definitions"},
        monochrome = true,
        dryRun = false,
        plugin = {
                "json:build/cucumber-reports/cucumber.json",
                "rerun:build/cucumber-report/rerun.txt"
        }
)
public class TestRunner  {

}

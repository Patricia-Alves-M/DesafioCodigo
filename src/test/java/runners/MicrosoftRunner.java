package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
		strict = true
		,monochrome = true
		,stepNotifications = true
		,features = ("src/test/resources/features/microsoft/Microsoft.feature")
		,glue = "stepDefinitions"
		,plugin = {"pretty","html:target/report-html/microsoft/MicrosoftData", "json:target/cucumber-reports/microsoft/MicrosoftData/MicrosoftData.json"}
		,snippets = SnippetType.CAMELCASE
)

public class MicrosoftRunner {

}

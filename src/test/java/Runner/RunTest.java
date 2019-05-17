package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Davny1128\\eclipse-workspace\\BDD_DataDriven_PHPTravels\\src\\main\\java\\FeatureFile\\requirement.feature"
					, glue = "StepDefinitions"
					, monochrome = true
					, snippets = SnippetType.CAMELCASE
				)



public class RunTest {

	
}

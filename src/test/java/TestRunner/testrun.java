package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)


@CucumberOptions(features={".//Featurefile./StudentLogin.feature"}, glue={"StepDefinition","Hooks"},
dryRun=!true,monochrome=true,snippets=SnippetType.CAMELCASE,publish=true,
plugin={"pretty","html:CucumberReports",
		"json:reports/result.json",
		"junit:reports/result.xml"})
 
public class testrun {


	}


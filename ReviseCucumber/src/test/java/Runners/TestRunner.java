package Runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Features"}, 
				glue = { "StepDefinitions" }, 
				plugin = { "pretty","html:test-outout", "json:json_output/cucumber.json","junit:junit_xml/cucumber.xml" },
				strict = false,
				dryRun = true,
				monochrome = true)
public class TestRunner {
}
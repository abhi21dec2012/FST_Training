package in.retailm1.runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "pretty:target/cucumber/cucumber.txt", "html:target/cucumber/cucumber-html-report",
		"json:target/cucumber/cucumber.json" }, features = {
				"features/retailm1" }, glue = { "in.upskills.retailm1.stepdefinations" }
// ,dryRun = true
		, tags = "@FST_Assignment")
public class RetailTestRunner {

}

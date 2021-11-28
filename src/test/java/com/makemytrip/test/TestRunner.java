package com.makemytrip.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		plugin = {"pretty:target/cucumber/cucumber.txt", 
				"html:target/cucumber/cucumber-html-report",
				"json:target/cucumber/cucumber.json"
				}
		,features= {"features"}
		,glue = {"com.makemytrip.stedefinations"}
		//,dryRun = true
		,tags="@SearchFlights"
		)
public class TestRunner {

}

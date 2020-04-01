package com.compAt.TestRunner;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = { "com/HRA/stepdefinitions" }, plugin = { "pretty",
		"html:target/cucumber-htmlreport", "json:target/cucumber-report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, tags = {
				"@SmokeTesting12" }, monochrome = true)
public class TestRunner {

}
 
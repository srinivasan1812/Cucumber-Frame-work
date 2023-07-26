package org.step;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\srini\\eclipse-workspace\\CucumberFrameWorkDay2\\src\\test\\resources\\Facebook.feature",
				 glue="org.step",
				 monochrome=true,
				 dryRun=false)

public class TestRunner {

}

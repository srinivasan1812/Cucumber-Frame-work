package org.run;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\srini\\eclipse-workspace\\CucumberFrameWorkDay2\\src\\test\\resources\\Facebook.feature",
				 glue="org.step",monochrome=true,dryRun=false,strict=true,snippets=SnippetType.CAMELCASE, tags= {"@smoke"},
					plugin= {"html:C:\\Users\\srini\\eclipse-workspace\\CucumberFrameWork\\AllReport\\HtmlReport",
							"junit:C:\\Users\\srini\\eclipse-workspace\\CucumberFrameWork\\AllReport\\JUnitReport//fail.xml",
          					"json:C:\\Users\\srini\\eclipse-workspace\\CucumberFrameWork\\AllReport\\JsonReport//failed.json"})

public class RunAll {

}


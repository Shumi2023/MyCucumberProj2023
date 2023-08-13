package com.proj.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner {
@CucumberOptions(
			
			features = {"Feature/Suite1"},
			glue = {"factory","hooks","com.proj.steps"},
			monochrome=true,
			publish=true,
			//tags="@smoke",
			plugin= {"pretty","html:target/CucumberReports/CucumberReport.html"}
			)
	
public class TestRunnerTestNG extends AbstractTestNGCucumberTests{
	
	
	
	
	
}

}

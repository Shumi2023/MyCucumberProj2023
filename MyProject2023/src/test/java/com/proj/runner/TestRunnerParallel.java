package com.proj.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"Feature/Suite2"},
		glue = {"factory","hooks","com.proj.steps"},
		monochrome=true,
		publish=true,
		//tags="@smoke",
		plugin= {"pretty","html:target/CucumberReports/CucumberReport.html"}
		)

public class TestRunnerParallel extends AbstractTestNGCucumberTests{
	
//	@Override
//	@DataProvider(parallel = true)
//	public Object[][] scenarios() {
//		return super.scenarios();	
//	}
	
}



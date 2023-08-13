package com.proj.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"Feature"},
		glue = {"com.proj.steps"},
		monochrome=true,
				publish=true,
				tags="@parallel",
				plugin= {"pretty","html:target/CucumberReports/CucumberReport.html"}
		)
public class TestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();	
	}
}


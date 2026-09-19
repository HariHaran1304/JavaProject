package com.omrbranch.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.reporting.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","json:target\\output.json"},glue="com.omrbranch.stepdefinition",features="src\\test\\resources")
public class TestRunnerClass {
	
	@AfterClass
	 public static void afterClass() {
		Reporting.generateJVMReport("C:\\Users\\HomePC\\eclipse-workspace\\Cucumber_Projects\\target\\output.json");
	}

}

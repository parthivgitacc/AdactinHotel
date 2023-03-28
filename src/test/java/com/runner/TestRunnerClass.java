package com.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.report.Reporting;

//import com.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

/**
 * 
 * @author Parthiban
 * @see TestRunnnerClass
 * @date 21/02/2023
 */
@RunWith(Cucumber.class)
@CucumberOptions(tags = (""), stepNotifications = true, publish = true, dryRun = false, monochrome = true, snippets = SnippetType.CAMELCASE, plugin = {
		"pretty", "json:target/index.json" }, features = "src/test/resources", glue = "com.stepdefinition")
public class TestRunnerClass extends BaseClass {
	/**
	 * @see afterClass Reoort Generating
	 * @throws IOException
	 * @throws Exception
	 */
	@AfterClass
	public static void afterClass() throws IOException, Exception {

		Reporting.generateJvmReport(getProjectPath() + getPropertyFileValue("jsonPath"));

	}
}

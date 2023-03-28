package com.stepdefinition;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass {
	/**
	 * @see beforeScenario
	 * @throws Exception
	 */

	@Before
	public void beforeScenario() throws Exception {

		getDrivers(getPropertyFileValue("browser"));
		enterAppUrl(getPropertyFileValue("url"));
		maximizeWindow();
	}

	/**
	 * @see after scenario
	 * @param scenario
	 */

	@After
	public void afterScenario(Scenario scenario) {
		boolean failed = scenario.isFailed();
		if (!failed) {
			scenario.attach(screenshot(), "image/png", "Every Scenario");
		}

		quitWindow();

	}
}

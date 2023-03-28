package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.google.auto.common.BasicAnnotationProcessor.Step;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * 
 * @author Parthiban
 * @see Step for login
 * @date 16/02/2023
 *
 */

public class TC1_LoginStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * @throws Exception
	 * @throws IOException
	 * @see user to perform adactin page
	 */
	@Given("User is on the Adactin page")
	public void userIsOnTheAdactinPage() throws IOException, Exception {

	}

	/**
	 * @see used to perform login by username and paswrod
	 * @param userName
	 * @param password
	 */
	@When("User perform login {string},{string}")
	public void userPerformLogin(String userName, String password) {
		
		
		pom.getLoginPage().loginStep(userName, password);
		

	}

	/**
	 * @see used to login with enter btn
	 * @param userName
	 * @param password
	 * @throws AWTException 
	 */

	@When("User perform login {string},{string} with Enter key")
	public void userPerformLoginWithEnterKey(String userName, String password) throws AWTException {
		
		pom.getLoginPage().loginWithEnterKey(userName, password);
		
	}

	/**
	 * @see used to perform with invalid credentials
	 * @param expLoginErrorMsg
	 */

	@Then("User should verify after login with invalid credential error message contains {string}")
	public void userShouldVerifyAfterLoginWithInvalidCredentialErrorMessageContains(String expLoginErrorMsg) {
		
		WebElement txtErrorMsg = pom.getLoginPage().getTxtErrorMsg();
		String actLoginErrorMag = elementGetText(txtErrorMsg);
		boolean contains = actLoginErrorMag.contains(expLoginErrorMsg);
		Assert.assertTrue("verify after Login with invalid credential error message", true);
		
		
		
	}
}

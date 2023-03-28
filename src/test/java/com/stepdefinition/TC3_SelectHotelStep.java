package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * 
 * @author Parthiban
 * @see Step for select hotel
 * @date 16/02/2023
 *
 */
public class TC3_SelectHotelStep {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * @see perform select hotel page
	 */
	@When("User perform select hotel and click continue")
	public void userPerformSelectHotelAndClickContinue() {
		pom.getSelectHotelPage().selectHotel();

	}

	/**
	 * @see verifyAfterContinueSuccessMessage
	 * @param expSelectHotelSuccessMsg
	 */
	@Then("User should verify after continue success message {string}")
	public void userShouldVerifyAfterContinueSuccessMessage(String expSelectHotelSuccessMsg) {

		WebElement txtHotelSuccessmsg = pom.getBookHotelPage().getTxtBookAHotelSuccessmsg();
		String actSelectHotelSuccessMsg = txtHotelSuccessmsg.getText();
		System.out.println(actSelectHotelSuccessMsg);

		Assert.assertEquals("Verify the after search hotel success message", expSelectHotelSuccessMsg,
				actSelectHotelSuccessMsg);

	}

	/**
	 * @see performClickContinueWithoutSelectingHotel
	 */

	@When("User perform click continue without selecting hotel")
	public void userPerformClickContinueWithoutSelectingHotel() {

		pom.getSelectHotelPage().clickContinue();

	}

	/**
	 * @see VerifyAfterContinueErrorMessage
	 * @param expSelectHotelErrorMsg
	 */
	@Then("User should verify after continue error message {string}")
	public void userShouldVerifyAfterContinueErrorMessage(String expSelectHotelErrorMsg) {

		WebElement txtContinueErrormsg = pom.getSelectHotelPage().getTxtContinueErrormsg();
		String actSelectHotelErrorMsg = txtContinueErrormsg.getText();
		Assert.assertEquals("Verify the error message with select hotel by click continue", expSelectHotelErrorMsg,
				actSelectHotelErrorMsg);

	}

}

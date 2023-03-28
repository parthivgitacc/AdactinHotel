package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * 
 * @author Parthiban
 * @see Step for cancel booking
 * @date 16/02/2023
 */
public class TC5_CancelBookingStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * @see perfom cancel Booking
	 */
	@When("User perfom cancel Booking")
	public void userPerfomCancelBooking() {
		
		implicityWait(30);
		WebElement txtBookingOrderNumber = pom.getBookingConfirmPage().getTxtOrderNO();
		String txtOrdernumber = txtBookingOrderNumber.getAttribute("value");
		System.out.println(txtOrdernumber);
		pom.getCancelBookingPage().cancelOrderId(txtOrdernumber);

	}

	/**
	 * @see verify after cancel Booking success message
	 * @param expCancelBookingSuccessMsg
	 */
	@Then("User should verify after cancel Booking success message {string}")
	public void userShouldVerifyAfterCancelBookingSuccessMessage(String expCancelBookingSuccessMsg) {
		WebElement txtBookingCancelSucessMsg = pom.getCancelBookingPage().getBookingCancelSucessMsg();
		String actCancelBookingSucccessMsg = txtBookingCancelSucessMsg.getText();
		Assert.assertTrue("verify after cancel Booking success message", actCancelBookingSucccessMsg.equals(expCancelBookingSuccessMsg));

	}

	/**
	 * @see perform cancel Booking using exsiting orderid
	 * @param expCancelBookingSuccessMsg
	 */
	@When("User perform cancel Booking using exsiting orderid {string}")
	public void userPerformCancelBookingUsingExsitingOrderid(String orderId) {
		
		pom.getCancelBookingPage().cancelOrderId(orderId);


	}

}

package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.google.auto.common.BasicAnnotationProcessor.Step;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * 
 * @author Parthiban
 * @see Step for book hotel
 * @date 16/02/2023
 *
 */
public class TC4_BookHotelStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * @see user to perfom the book hotel page
	 * @param firstName
	 * @param lastName
	 * @param billingAddress
	 * @param dataTable
	 */
	@When("User perform book hotel {string} , {string} and {string}")
	public void userPerformBookHotelAnd(String firstName, String lastName, String billingAddress,
			io.cucumber.datatable.DataTable dataTable) {

		pom.getBookHotelPage().bookHotel(firstName, lastName, billingAddress, dataTable);
		
	}

	/**
	 * @see VerifyAfterBookHotelSucessMessageAndSaveTheOrderId
	 * @param expBookingSuccessMsg
	 */
	@Then("User should verify after book hotel sucess message {string} and save the order id")
	public void userShouldVerifyAfterBookHotelSucessMessageAndSaveTheOrderId(String expBookingSuccessMsg) {

		implicityWait(30);
		WebElement txtBookingOrderNumber = pom.getBookingConfirmPage().getTxtOrderNO();
		String txtOrdernumber = txtBookingOrderNumber.getAttribute("value");
		System.out.println(txtOrdernumber);

		WebElement txtBookingSuccessMsg = pom.getBookHotelPage().getTxtBookingSuccessMessage();
		String actBookingConfirmationMessage = txtBookingSuccessMsg.getText();
		Assert.assertEquals("Verify the Booking confirmation message", expBookingSuccessMsg,
				actBookingConfirmationMessage);

	}

	/**
	 * @see perform book hotel without enter anyfields
	 */

	@When("User perform book hotel without select any fields")
	public void userPerformBookHotelWithoutSelectAnyFields() {

		pom.getBookHotelPage().bookHotel();
	}

	/**
	 * @see verifyAfterBookHotelErrorMessage
	 * @param expFirstNameErrorMsg
	 * @param explastNameErrorMsg
	 * @param expAddressErrorMsg
	 * @param expCreditCardNumberErrorMsg
	 * @param expCreditCardTypeErrorMsg
	 * @param expMonthErrorMsg
	 * @param expCvvNumErrorMsg
	 */

	@Then("User should verify after book hotel error message {string} , {string} , {string} , {string} , {string} , {string} and {string}")
	public void userShouldVerifyAfterBookHotelErrorMessageAnd(String expFirstNameErrorMsg, String explastNameErrorMsg,
			String expAddressErrorMsg, String expCreditCardNumberErrorMsg, String expCreditCardTypeErrorMsg,
			String expMonthErrorMsg, String expCvvNumErrorMsg) {
		WebElement txtErrorMsgFirstName = pom.getBookHotelPage().getTxtErrorMsgFirstName();
		String actErrorMsgFirstName = txtErrorMsgFirstName.getText();
		System.out.println(actErrorMsgFirstName);

		WebElement errorMsgLastName = pom.getBookHotelPage().getTxtErrorMsgLastName();
		String actErrorMsgLastName = errorMsgLastName.getText();
		System.out.println(actErrorMsgLastName);

		WebElement errorMsgAddress = pom.getBookHotelPage().getTxtErrorMsgAddress();
		String actErrorMsgAddress = errorMsgAddress.getText();
		System.out.println(actErrorMsgAddress);

		WebElement ErrorMsg16DigitCreditCard = pom.getBookHotelPage().getTxtErrorMsg16DigitCreditCard();
		String actErrorMsg16DigitCreditCard = ErrorMsg16DigitCreditCard.getText();
		System.out.println(actErrorMsg16DigitCreditCard);

		WebElement ErrorMsgCreditCardType = pom.getBookHotelPage().getTxtErrorMsgCreditCardType();
		String actErrorMsgCreditCardType = ErrorMsgCreditCardType.getText();
		System.out.println(actErrorMsgCreditCardType);

		WebElement ErrorMsgCreditCardExMonth = pom.getBookHotelPage().getTxtErrorMsgCreditCardExMonth();
		String actErrorMsgCreditCardExMonth = ErrorMsgCreditCardExMonth.getText();
		System.out.println(actErrorMsgCreditCardExMonth);

		WebElement ErrorMsgCCVNumber = pom.getBookHotelPage().getTxtErrorMsgCCVNumber();
		String actErrorMsgCCVNumber = ErrorMsgCCVNumber.getText();
		System.out.println(actErrorMsgCCVNumber);

		Assert.assertEquals("Verify the error message firstName", expFirstNameErrorMsg, actErrorMsgFirstName);
		Assert.assertEquals("Verify the error message lastName", explastNameErrorMsg, actErrorMsgLastName);
		Assert.assertEquals("Verify the error message billingAddress",expAddressErrorMsg,actErrorMsgAddress);
		Assert.assertEquals("Verify the error message creditcardnumber", expCreditCardNumberErrorMsg,
				actErrorMsg16DigitCreditCard);
		Assert.assertEquals("Verify the error message creditcardtype", expCreditCardTypeErrorMsg,
				actErrorMsgCreditCardType);
		Assert.assertEquals("Verify the error message month", expMonthErrorMsg, actErrorMsgCreditCardExMonth);
		Assert.assertEquals("Verify the error message ccvNumber", expCvvNumErrorMsg, actErrorMsgCCVNumber);

	}

}

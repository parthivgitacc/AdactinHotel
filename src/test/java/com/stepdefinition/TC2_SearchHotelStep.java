package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.google.auto.common.BasicAnnotationProcessor.Step;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * 
 * @author Parthiban
 * @see Step for search hotel
 * @date 16/02/2023
 *
 */
public class TC2_SearchHotelStep {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * @see used to perform searchhotel page with all details
	 * @param location
	 * @param hotels
	 * @param roomType
	 * @param numberOfRooms
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultsPerRoom
	 * @param childrenPerRoom
	 */
	@When("User perform search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userPerformSearchHotelAnd(String location, String hotels, String roomType, String numberOfRooms,
			String checkInDate, String checkOutDate, String adultsPerRoom, String childrenPerRoom) {
		pom.getSearchHotelPage().searchHotels(location, hotels, roomType, numberOfRooms, checkInDate, checkOutDate,
				adultsPerRoom, childrenPerRoom);

	}

	/**
	 * @see verify after search hotel success message
	 * @param string
	 */
	@Then("User should verify after search hotel success message {string}")
	public void userShouldVerifyAfterSearchHotelSuccessMessage(String expSearchHotelSuccesMsg) {

	}

	/**
	 * @see enter only mandatory fields in search hotel page
	 * @param location
	 * @param numberOfRooms
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultsPerRoom
	 */

	@When("User perform search hotel by selecting mandatory fields only {string},{string},{string},{string} and {string}")
	public void userPerformSearchHotelBySelectingMandatoryFieldsOnlyAnd(String location, String numberOfRooms,
			String checkInDate, String checkOutDate, String adultsPerRoom) {

		pom.getSearchHotelPage().searchHotels(location, numberOfRooms, checkInDate, checkOutDate, adultsPerRoom);

	}

	/**
	 * @see verify after search hotel date Error Msg
	 * @param expCheckInErrorMsg
	 * @param expCheckOutErrorMsg
	 */

	@Then("User should verify after search hotel date error message  {string} , {string}")
	public void userShouldVerifyAfterSearchHotelDateErrorMessage(String expCheckInDateErrorMsg,
			String expCheckOutDateErrorMsg) {
		WebElement txtCheckInErrorMessage = pom.getSearchHotelPage().getTxtCheckInErrorMessage();
		String actCheckInErrorMessage = txtCheckInErrorMessage.getText();
		System.out.println("checkIn :" + actCheckInErrorMessage);

		WebElement txtCheckOutErrorMessage = pom.getSearchHotelPage().getTxtCheckOutErrorMessage();
		String actCheckoutErrorMessage = txtCheckOutErrorMessage.getText();
		System.out.println(actCheckoutErrorMessage);

		Assert.assertEquals("Verify the error message in checkInDate field", expCheckInDateErrorMsg,
				actCheckInErrorMessage);
		Assert.assertEquals("Verify the error message in checkInDate field", expCheckOutDateErrorMsg,
				actCheckoutErrorMessage);

	}

	/**
	 * @see user to perform without enter
	 */

	@When("User should click search button without Enter any field")
	public void userShouldClickSearchButtonWithoutEnterAnyField() {

		pom.getSearchHotelPage().searchHotels();

	}

	/**
	 * @see verify error message after search hotel
	 * @param expSearchErrorMsg
	 */
	@Then("User should verify error message after search hotel in location field {string}")
	public void userShouldVerifyErrorMessageAfterSearchHotelInLocationField(String expSearchErrorMsg) {

		WebElement txtLocationErrorMessage = pom.getSearchHotelPage().getTxtLocationErrorMessage();
		String actLocationErrorMsg = txtLocationErrorMessage.getText();
		Assert.assertEquals("Verify the error message without select hotel by click continue", expSearchErrorMsg, actLocationErrorMsg);

	}

}

package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author Parthiban
 * @see search hotel
 * @date 16/02/2023
 */

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement ddnLocation;
	@FindBy(id = "hotels")
	private WebElement ddnHotels;
	@FindBy(id = "room_type")
	private WebElement ddnRoomType;
	@FindBy(id = "room_nos")
	private WebElement ddnNumberOfRooms;
	@FindBy(id = "datepick_in")
	private WebElement txtCheckInDate;
	@FindBy(id = "datepick_out")
	private WebElement txtCheckOutDate;
	@FindBy(id = "adult_room")
	private WebElement ddnAdultsPerRoom;
	@FindBy(id = "child_room")
	private WebElement ddnChildrenPerRoom;
	@FindBy(id = "Submit")
	private WebElement btnSearch;
	@FindBy(id = "checkin_span")
	private WebElement txtCheckInErrorMessage;
	@FindBy(id = "location_span")
	private WebElement txtLocationErrorMessage;
	@FindBy(id = "username_show")
	private WebElement txtLoginSucess;
	@FindBy(id = "checkout_span")
	private WebElement txtCheckOutErrorMessage;

	public WebElement getddnLocation() {
		return ddnLocation;
	}

	public WebElement getddnHotels() {
		return ddnHotels;
	}

	public WebElement getddnRoomType() {
		return ddnRoomType;
	}

	public WebElement getddnNumberOfRooms() {
		return ddnNumberOfRooms;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getddnAdultsPerRoom() {
		return ddnAdultsPerRoom;
	}

	public WebElement getddnChildrenPerRoom() {
		return ddnChildrenPerRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getTxtCheckInErrorMessage() {
		return txtCheckInErrorMessage;
	}

	public WebElement getTxtLocationErrorMessage() {
		return txtLocationErrorMessage;
	}

	public WebElement getTxtLoginSucess() {
		return txtLoginSucess;
	}

	public WebElement getTxtCheckOutErrorMessage() {
		return txtCheckOutErrorMessage;
	}

	/**
	 * @see search Hotel
	 * @param location
	 * @param hotel
	 * @param roomType
	 * @param numberOfRoom
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultPerRoom
	 * @param childPerRoom
	 */
	public void searchHotels(String location, String hotels, String roomType, String numberOfRooms, String checkInDate,
			String checkOutDate, String adultsPerRoom, String childrenPerRoom) {

		selectOptionByText(getddnLocation(), location);
		selectOptionByText(getddnHotels(), hotels);
		selectOptionByText(getddnRoomType(), roomType);
		selectOptionByText(getddnNumberOfRooms(), numberOfRooms);
		clear(getTxtCheckInDate());
		elementSendkeys(getTxtCheckInDate(), checkInDate);
		clear(getTxtCheckOutDate());
		elementSendkeys(getTxtCheckOutDate(), checkOutDate);
		selectOptionByText(getddnAdultsPerRoom(), adultsPerRoom);
		selectOptionByText(getddnChildrenPerRoom(), childrenPerRoom);
		elementClick(btnSearch);

	}

	/**
	 * @see searchHotel
	 * @param location
	 * @param numberOfRoom
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultPerRoom
	 */
	public void searchHotels(String location, String numberOfRooms, String checkInDate, String checkOutDate,
			String adultsPerRoom) {

		selectOptionByText(getddnLocation(), location);
		selectOptionByText(getddnNumberOfRooms(), numberOfRooms);
		clear(getTxtCheckInDate());
		elementSendkeys(getTxtCheckInDate(), checkInDate);
		clear(getTxtCheckOutDate());
		elementSendkeys(getTxtCheckOutDate(), checkOutDate);
		selectOptionByText(getddnAdultsPerRoom(), adultsPerRoom);
		elementClick(btnSearch);
	}

	/**
	 * @see searchHotel
	 */
	public void searchHotels() {
		elementClick(btnSearch);
	}

}

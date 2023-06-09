package com.manager;

import com.pages.BookHotelPage;
import com.pages.BookingConfirmPage;
import com.pages.CancelBookingPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

/**
 * 
 * @author Parthiban
 * @see Object mainitain for all POM
 * @date 16/02/2023
 *
 */

public class PageObjectManager {

	private LoginPage loginPage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookHotelPage bookHotelPage;
	private BookingConfirmPage bookingConfirmPage;
	private CancelBookingPage cancelBookingPage;
/**
 * @see create Object for login page
 * @return
 */
	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
	}

	/**
	 * @see create Object for searchHotel page
	 * @return
	 */
	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage == null) ? searchHotelPage = new SearchHotelPage() : searchHotelPage;
	}

	/**
	 * @see create Object for selectHotel page
	 * @return
	 */
	
	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage == null) ? selectHotelPage = new SelectHotelPage() : selectHotelPage;
	}
	
	/**
	 * @see  create Object for bookHotel page
	 * @return
	 */

	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage == null) ? bookHotelPage = new BookHotelPage() : bookHotelPage;
	}
	
	/**
	 * @see create Object for bookingConfirmation page
	 * @return
	 */

	public BookingConfirmPage getBookingConfirmPage() {
		return (bookingConfirmPage == null) ? bookingConfirmPage = new BookingConfirmPage() : bookingConfirmPage;
	}

	/**
	 * @see create Object for cancelBooking page
	 * @return
	 */
	public CancelBookingPage getCancelBookingPage() {
		return (cancelBookingPage == null) ? cancelBookingPage = new CancelBookingPage() : cancelBookingPage;
	}

}

package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author Parthiban
 * @see CancelBookingPage
 * @date 16/01/2023
 *
 */
public class CancelBookingPage extends BaseClass {

	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='BookedItinerary.php']")
	private WebElement lknBookedItinerary;

	@FindBy(id = "order_id_text")
	private WebElement txtSearchOrderId;

	@FindBy(id = "search_hotel_id")
	private WebElement btnGo;

	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement btnCancel;
	@FindBy(xpath = "//label[@class='reg_error']")
	private WebElement txtBookingCancelSucessMsg;

	public WebElement getBookingCancelSucessMsg() {
		return txtBookingCancelSucessMsg;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public WebElement getTxtSearchOrderId() {
		return txtSearchOrderId;
	}

	public WebElement getLknBookedItinerary() {
		return lknBookedItinerary;
	}

	public WebElement getBtnGo() {
		return btnGo;
	}

	/**
	 * @see cancel the order ID
	 * @param orderId
	 * 
	 */

	public void cancelOrderId(String orderID) {

		elementClick(getLknBookedItinerary());
		elementClick(getTxtSearchOrderId());
		elementSendkeys(getTxtSearchOrderId(), orderID);
		elementClick(btnGo);
		elementClick(btnCancel);
		alertOk();
	}

}

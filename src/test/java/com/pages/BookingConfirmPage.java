package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author ELCOT
 * @see Booking ConfirmPage
 * @date 16/02/2023
 *
 */
public class BookingConfirmPage extends BaseClass {

	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement txtOrderNO;

	public WebElement getTxtOrderNO() {
		return txtOrderNO;
	}

	/**
	 * @see get the order ID
	 * @return elementGetAttributeValue
	 */
	public String getOrderId() {

		implicityWait(30);
		String txtOrderId = elementGetAttributeValue(txtOrderNO);
		return txtOrderId;

	}

}

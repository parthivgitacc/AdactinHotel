package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author Parthiban
 * @see SelectHotelPage
 * @date 16/02/2023
 *
 */


public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement rdoHotelName;
	@FindBy(id = "continue")
	private WebElement btnContinue;
	@FindBy(id = "radiobutton_span")
	private WebElement txtContinueErrormsg;
	@FindBy(xpath = "//td[@class='login_title']")
	private WebElement txtHotelSuccessmsg;

	public WebElement getRdoHotelName() {
		return rdoHotelName;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getTxtContinueErrormsg() {
		return txtContinueErrormsg;
	}

	public WebElement getTxtHotelSuccessmsg() {
		return txtHotelSuccessmsg;
	}


	/**
	 * @see select the hotel
	 */
	
	public void selectHotel() {
		elementClick(getRdoHotelName());
		elementClick(getBtnContinue());
	}
	
	/**
	 * @see without select hotel click continue
	 */

	public void clickContinue() {
		elementClick(getBtnContinue());

	}

}

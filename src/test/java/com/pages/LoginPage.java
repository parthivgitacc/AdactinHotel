package com.pages;

import java.awt.AWTException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author Parthiban
 * @see Login page
 * @date 16/02/2023
 *
 */

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUserName;
	@FindBy(id = "password")
	private WebElement txtPassword;
	@FindBy(id = "login")
	private WebElement btnLogin;
	@FindBy(xpath = "//b[contains(text(),'Invalid Login details or Your Password might have expired.')]")
	private WebElement txtErrorMsg;

	public WebElement getTxtErrorMsg() {
		return txtErrorMsg;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	/**
	 * @see LoginStep
	 * @param userName
	 * @param password
	 */
	public void loginStep(String userName, String password) {
		elementSendkeys(getTxtUserName(), userName);
		elementSendkeys(getTxtPassword(), password);
		elementClick(getBtnLogin());

	}

	/**
	 * @see loginWithEnterKey
	 * @param userName
	 * @param password
	 * @throws AWTException
	 */

	public void loginWithEnterKey(String userName, String password) throws AWTException {
		elementSendkeys(getTxtUserName(), userName);
		elementSendkeys(getTxtPassword(), password);
		robotKeyEnter();
	}

	/**
	 * @see getTextErrorMsg
	 * @return txtErrorMsg
	 */
	
}

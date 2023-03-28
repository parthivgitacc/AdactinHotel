package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * 
 * @author ELCOT
 * @see Maintain the common steps
 * @date 16/02/2023
 */
public class CommonStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();
	/**
	 * @see verify after login success message
	 * @param string
	 */
	@Then("User should verify after login success message {string}")
	public void userShouldVerifyAfterLoginSuccessMessage(String expLoginSuccessMsg) {
	
		WebElement txtLoginSucess = pom.getSearchHotelPage().getTxtLoginSucess();

		String actLoginSuccessMsg = elementGetAttributeValue(txtLoginSucess);
		Assert.assertEquals("Verify after login success msg", expLoginSuccessMsg, actLoginSuccessMsg);
		
		
		
	}

}

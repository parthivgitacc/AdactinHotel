package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author ELCOT
 * @see Reusabe method in selenium
 * @date 16/02/2023
 */

public class BaseClass {

	public static WebDriver driver;

	/**
	 * @see enterAppInUrl
	 * @param url
	 */
	// 1.Enter URL
	public static void enterAppInUrl(String url) {
		driver.get(url);
	}

	/**
	 * @see Maximize Window
	 */
	// 2.Maximize Window
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	/**
	 * @see Insert value in TextBox
	 * @param element
	 * @param data
	 */

	// 3.Insert value in TextBox
	public void elementSendkeys(WebElement element, String data) {
		element.sendKeys(data);
	}

	/**
	 * @see Click Button
	 * @param element
	 */

	// 4.Click Button
	public void elementClick(WebElement element) {
		element.click();
	}

	/**
	 * @see Alert OK
	 */
	// 5.Alert OK
	public void alertOk() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	/**
	 * @see Alert Cancel
	 */
	// 6.Alert Cancel
	public void alertCancel() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	/**
	 * @see Text from WebPage
	 * @param element
	 * @return text
	 */

	// 7.Text from WebPage
	public String elementGetText(WebElement element) {
		String text = element.getText();
		return text;
	}

	/**
	 * @see Inserted value from TextBox
	 * @param element
	 * @return attribute
	 */

	// 8.Inserted value from TextBox----->99%
	public String elementGetAttributeValue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	/**
	 * @see Inserted value from TextBox
	 * @param element
	 * @param attribute
	 * @return
	 */

	// 9.Inserted value from TextBox----->1%
	public String elementGetAttributeValue(WebElement element, String attribute) {
		String attribute1 = element.getAttribute(attribute);
		return attribute1;
	}

	/**
	 * @see Close All Window
	 */

	// 10.Close All Window
	public void quitWindow() {
		driver.quit();
	}

	/**
	 * @see Close Window
	 */

	// 11.Close Window
	public void closeWindow() {
		driver.close();
	}

	/**
	 * @see Get the Title
	 * @return title
	 */
	// 12.Get the Title
	public String getAppInTitle() {
		String title = driver.getTitle();
		return title;
	}

	/**
	 * @see Enter URL
	 * @param url
	 */
	// 13.Enter URL
	public void enterAppUrl(String url) {
		driver.get(url);
	}

	/**
	 * @see Select dropdown option by Text
	 * @param element
	 * @param text
	 */

	// 14.Select dropdown option by Text
	public void selectOptionByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	/**
	 * @see Select dropdown option by Attribute
	 */
	// 15.Select dropdown option by Attribute
	public void selectOptionByAttribute(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	/**
	 * @see Select dropdown option by Index
	 * @param element
	 * @param index
	 */

	// 16.Select dropdown option by Index
	public void selectOptionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	/**
	 * @see Insert value in TextBox by JS
	 */

	// 17.Insert value in TextBox by JS
	public JavascriptExecutor elementSendkeysJs(WebElement element, String data) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Object executeScript = executor.executeScript("arguments[0].setAttribute('value'," + data + ")", element);
		return (JavascriptExecutor) executeScript;
	}

	/**
	 * @see Click Button by JS
	 * @param element
	 */

	// 18.Click Button by JS
	public void clickJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);
	}

	/**
	 * @see Launch Chrome Browser
	 */
	// 19.Launch Chrome Browser
	public void getDriver() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	}

	/**
	 * @see Switch to Child Window
	 */

	// 20.Switc to Child Window
	public void childWindow() {
		String windowHandle = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		for (String x : allWindow) {
			if (!windowHandle.equals(allWindow))
				;
			driver.switchTo().window(x);
		}
	}

	/**
	 * @see Switch to Frame by Index
	 * @param index
	 */
	// 21.Switch to Frame by Index
	public void switchToIndex(int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * @see Switch to Frame by FrameId
	 * @param name
	 */
	// 22.Switch to Frame by FrameId
	public void switchToFrameId(String name) {
		driver.switchTo().frame(name);
	}

	/**
	 * @see Find Loctor By Id
	 * @param id
	 * @return
	 */
	// 23.Find Loctor By Id
	public WebElement findElementId(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}

	/**
	 * @see Find Locator By Name
	 * @param name
	 * @return element
	 */
	// 24.Find Locator By Name
	private WebElement findElementByName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}

	/**
	 * @see Find Locator By ClassName
	 * @param Value
	 * @return element
	 */

	// 25.Find Locator By ClassName
	public WebElement findElementByClassName(String Value) {
		WebElement element = driver.findElement(By.className(Value));
		return element;
	}

	/**
	 * @see Find Locator By xpath
	 * @param xpathExpression
	 * @return element
	 */

	// 26.Find Locator By xpath
	public WebElement findElementByXpath(String xpathExpression) {
		WebElement element = driver.findElement(By.xpath(xpathExpression));
		return element;
	}

	/**
	 * @see get All option from dropdown as Text
	 * @param element
	 */
	// 27.get All option from dropdown as Text
	public void getText(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			webElement.getText();
		}
	}

	/**
	 * @see get All option from dropdown as Attribute Value
	 * @param element
	 * @param value
	 * @return attribute
	 */
	// 28.get All option from dropdown as Attribute Value
	public String getAttribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;
	}

	/**
	 * @see get All option from dropdown as FirstSelectOption
	 * @param element
	 */

	// 29.get All option from dropdown as FirstSelectOption
	public void firstSelectoption(WebElement element) {
		Select select = new Select(element);
		select.getFirstSelectedOption();
	}

	/**
	 * @see dropdown isMultiple select option
	 */
	// 30.dropdown isMultiple select option
	public boolean isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	/**
	 * @see Implicity Wait
	 * @param 
	 */

	// 31.Implicity Wait
	public void implicityWait(int i) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));
	}

	/**
	 * @see Explicit Wait
	 * @param timeout
	 * @return wait
	 */

	// 32.Explicit Wait
	public WebDriverWait explicitWait(Duration timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait;
	}

	/**
	 * @see Fulent Wait
	 * @param input
	 */

	// 33.Fulent Wait
	public void fulentwait(String input) {
		WebDriver wait = (WebDriver) new FluentWait(input);
	}

	/**
	 * @see Verify isDisplayed
	 * @param element
	 * @return displayed
	 */

	// 34.Verify isDisplayed
	public boolean elementisDisplyed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	/**
	 * @see verify isEnabled
	 * @param element
	 * @return enabled
	 */

	// 35.verify isEnabled
	public boolean elementisEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

	/**
	 * @see verify isSelected
	 * @param element
	 * @return selected
	 */

	// 36.verify isSelected
	public boolean elementisSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}

	/**
	 * @see Deselect by Index
	 * @param element
	 * @param index
	 */

	// 37.Deselect by Index
	public void deselectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	/**
	 * @see Deselect by Attribute
	 * @param element
	 * @param value
	 */

	// 38.Deselect by Attribute
	public void deselectByAttribute(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	/**
	 * @see Deselect by Text
	 * @param element
	 * @param text
	 */
	// 39.Deselect by Text
	public void deselectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	/**
	 * @see Deselect by All
	 * @param element
	 */

	// 40.Deselect by All
	public void deselectByAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	/**
	 * @see get the Parent Window
	 * @return windowHandle
	 */
	// 41.get the Parent Window
	public String parentWindow() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	/**
	 * @see get All Window
	 * @return windowHandles
	 */
	// 42.get All Window
	public Set<String> allWindow() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

	/**
	 * @see Clear Textbox
	 * @param element
	 */
	// 43.Clear Textbox
	public void clear(WebElement element) {
		element.clear();
	}

	/**
	 * @see Take Screenshot
	 * @return screenshotAs
	 */
	// 44.Take Screenshot
	public File takeScreenshot() {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File screenshotAs = ss.getScreenshotAs(OutputType.FILE);
		return screenshotAs;
	}

	/**
	 * @see Take Screenshot for Element
	 * @param element
	 * @return screenshotAs
	 */
	// 45.Take Screenshot for Element
	public File takeScreenshotElement(WebElement element) {
		File screenshotAs = element.getScreenshotAs(OutputType.FILE);
		return screenshotAs;
	}

	/**
	 * @see Mouseover action for Single Option
	 * @param element
	 * @return moveToElement
	 */

	// 46.Mouseover action for Single Option
	public Actions mouseoverActionSingleOption(WebElement element) {
		Actions actions = new Actions(driver);
		Actions moveToElement = actions.moveToElement(element);
		return moveToElement;
	}

	// 47.DragAndDrop
	public void dragAndDrop(WebElement source, WebElement target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target);
	}

	// 48.Right Click
	public Actions rightClick() {
		Actions actions = new Actions(driver);
		Actions contextClick = actions.contextClick();
		return contextClick;
	}

	// 49.Double Click
	public Actions doubleClick() {
		Actions actions = new Actions(driver);
		Actions doubleClick = actions.doubleClick();
		return doubleClick;
	}

	// 50.Insert value in Textbox and Enter
	public void sendkeysAndEnter(WebElement element, String data) {
		element.sendKeys(data, Keys.ENTER);
	}

	// 51.Refresh Page
	public void refreshPage() {
		driver.navigate().refresh();
	}

	// 52.Forward to Webpage
	public void forward() {
		driver.navigate().forward();
	}

	// 53.Back to Webpage
	public void back() {
		driver.navigate().back();
	}

	// 54.Robot using Down
	public void robotKeyPress() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
	}

	// 55.ScrollDown Using JS
	public void scrollDownJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	// 56.ScrollUp Using JS
	public void scrollUpJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	// 57.Thread Sleep
	public void threadSleep(long seconds) throws InterruptedException {
		Thread.sleep(seconds);
	}

	// 58.Text from Alert
	public String alertText() {
		String text = driver.switchTo().alert().getText();
		return text;
	}

	// 59.Dropdown All Select Option
	public List<WebElement> allSelect(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;
	}

	// 60.get Webpage Source
	public Object webpageSource() {
		String pageSource = driver.getPageSource();
		return pageSource;
	}

	// 61.getProjectPath
	public static String getProjectPath() {

		String path = System.getProperty("user.dir");
		return path;
	}

	// 62.getPropertyFileValue
	public static String getPropertyFileValue(String key) throws Exception, IOException {

		Properties properties = new Properties();

		properties.load(new FileInputStream(getProjectPath() + "\\Config\\config.properties"));
		Object object = properties.get(key);
		String value = (String) object;
		return value;
	}

	// 63.Robot Key Enter
	public void robotKeyEnter() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	//takescrrenshot
	
	public byte[] screenshot() {

	
	
	TakesScreenshot screenshot = (TakesScreenshot)driver;
	byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);
	return b;
	
	}
	
	
	
	
	
	
	
	
	

	// 63.getDrivers
	public static void getDrivers(String browserType) {


		switch (browserType) {

		case "chrome":
			
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(option);
			break;
		case "firefox":

			driver = new FirefoxDriver();
			break;
		case "ie":

			driver = new InternetExplorerDriver();
			break;

		case "edge":

			driver = new EdgeDriver();
			break;

		default:
			break;
		}

	}

}

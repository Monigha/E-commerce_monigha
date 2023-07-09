package com.base_All;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver", System.getProperty("user.dir") + "\\Driver\\operadriver.exe");
			driver = new OperaDriver();

		}
		return driver;

	}

	public static void implicitlyWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public static void get(String url) {
		driver.get(url);
	}

	public static String getText(WebElement element) {
		String text = element.getText();
		System.out.println("Text found in the WebElement is: " + text);
		return text;
	}

	// input feeding methods
	public static void sendKeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void click(WebElement element) {
		element.click();
	}

	// Action Methods
	public static void actions(WebElement element, String option) {
		Actions a = new Actions(driver);
		if (option.equalsIgnoreCase("moveToElement")) {
			a.moveToElement(element).build().perform();
		} else if (option.equalsIgnoreCase("click")) {
			a.click(element).build().perform();
		} else if (option.equalsIgnoreCase("contextClick")) {
			a.contextClick(element).build().perform();
		} else if (option.equalsIgnoreCase("doubleClick")) {
			a.doubleClick(element).build().perform();
		} else if (option.equalsIgnoreCase("clickAndHold")) {
			a.clickAndHold(element).build().perform();
		} else if (option.equalsIgnoreCase("release")) {
			a.release(element).build().perform();
		}
	}

	// Robot Class Methods for enter
	public static void robot(String option) throws AWTException {
		Robot r = new Robot();
		if (option.equalsIgnoreCase("Enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} else if (option.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		} else if (option.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		} else if (option.equalsIgnoreCase("left")) {
			r.keyPress(KeyEvent.VK_LEFT);
			r.keyRelease(KeyEvent.VK_LEFT);
		} else if (option.equalsIgnoreCase("Right")) {
			r.keyPress(KeyEvent.VK_RIGHT);
			r.keyRelease(KeyEvent.VK_RIGHT);
		}
	}

	// Frames Handling Methods
	public static void switchToFrame(String id) {
		driver.switchTo().frame(id);// id is used as reference
	}

	public static void switchToFrame(WebElement element) {
		driver.switchTo().frame(element);// web element is used as reference
	}

	public static void switchToFrame(int index) {
		driver.switchTo().frame(index);
		driver.switchTo().frame(index);
	}

	public static void switchToParentFrame() {
		driver.switchTo().parentFrame();// return to previous frame
	}

	public static void switchToDefaultContent() {
		driver.switchTo().defaultContent();// return to main page
	}

	public static void close() {
		driver.close();
	}
}

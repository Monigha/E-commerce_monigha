package com.EcommercePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_In_Page {

	public  WebDriver driver;

	@FindBy(xpath = "//button[text()=\"Sign in\"]")
	private WebElement signin;

	@FindBy(xpath = "(//button[@kind=\"secondary\"])[1]")
	private WebElement entersign;

	@FindBy(xpath = "//input[@name=\"emailMobile\"]")
	private WebElement entermobileno;

	@FindBy(xpath = "//button[@id=\"submitVerification\"]")
	private WebElement proceedButton;

	@FindBy(xpath = "//input[@id=\"otpField\"]")
	private WebElement otpenter;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement verifybtn;

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getEntersign() {
		return entersign;
	}

	public WebElement getEntermobileno() {
		return entermobileno;
	}

	public WebElement getProceedButton() {
		return proceedButton;
	}

	public WebElement getOtpenter() {
		return otpenter;
	}

	public WebElement getVerifybtn() {
		return verifybtn;
	}

	public Sign_In_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

}

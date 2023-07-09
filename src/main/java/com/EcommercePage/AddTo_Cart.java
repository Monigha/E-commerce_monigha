package com.EcommercePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTo_Cart {

	public WebDriver driver;

	@FindBy(xpath = "//input[@placeholder=\"Search on Nykaa\"]")
	private WebElement optionselect;

	@FindBy(xpath = "//img[contains(@alt,'Maybelline New York Colossal Kajal Black Pack O')]")
	private WebElement prodectclick;

	@FindBy(xpath = "//span[text()=\"Add To Bag\"]")
	private WebElement addbag;

	@FindBy(xpath = "//div[contains(text(),\"Maybelline New York Colossal\")]")
	private WebElement gettext;

	@FindBy(xpath = "//button[@class=\"css-aesrxy\"]")
	private WebElement Cartbutton;

	@FindBy(css = "iframe[class*=\"css-ac\"]")
	private WebElement AddtobagFrame;

	@FindBy(xpath = "//span[@data-test-id=\"product-name\"]")
	private WebElement addtobagproduct;

	public WebElement getaddtobagproduct() {
		return addtobagproduct;
	}

	public WebElement getAddtobagFrame() {
		return AddtobagFrame;
	}

	public WebElement getCartbutton() {
		return Cartbutton;
	}

	public void setCartbutton(WebElement cartbutton) {
		Cartbutton = cartbutton;
	}

	public WebElement getGettext() {
		return gettext;
	}

	public WebElement getOptionselect() {
		return optionselect;
	}

	public WebElement getProdectclick() {
		return prodectclick;
	}

	public WebElement getAddbag() {
		return addbag;
	}

	public AddTo_Cart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

}

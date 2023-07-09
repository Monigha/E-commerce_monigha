package com.StepDefinition123;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.E_Commerce.Ecommerce_Runner;
import com.EcommercePage.AddTo_Cart;
import com.EcommercePage.Sign_In_Page;
import com.base_All.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ecommerce_StepDef extends Base {

	public WebDriver driver = Ecommerce_Runner.driver;

	public String productTextValue;

	Sign_In_Page sip = new Sign_In_Page(driver);

	AddTo_Cart atc = new AddTo_Cart(driver);

	@Given("user Launch the nykaa application")
	public void user_launch_the_nykaa_application() {
		implicitlyWait(20);
		get("https://www.nykaa.com/");
	}

	@When("user click the signin button")
	public void user_click_the_signin_button() {
		click(sip.getSignin());
	}

	@When("user click on signin with mobile or email option it pop up for entring login details")
	public void user_click_on_signin_with_mobile_or_email_option_it_pop_up_for_entring_login_details() {
		click(sip.getEntersign());
	}

	@When("user enter the registered mobile number or email id")
	public void user_enter_the_registered_mobile_number_or_email_id() {
		sendKeys(sip.getEntermobileno(), "6379903768");

	}

	@When("user click the proceed button")
	public void user_click_the_proceed_button() {
		click(sip.getProceedButton());
	}

	@When("user need to enter the otp  received in registered email or mobile number")
	public void user_need_to_enter_the_otp_received_in_registered_email_or_mobile_number() {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the OTP :");
		String next = s.next();
		sendKeys(sip.getOtpenter(), next);

	}

	@Then("if user otp matches with server it successfully login in to the application")
	public void if_user_otp_matches_with_server_it_successfully_login_in_to_the_application() {
		click(sip.getVerifybtn());
	}

	@When("user need to search the required product in the search option provided in the page")
	public void user_need_to_search_the_required_product_in_the_search_option_provided_in_the_page() {
		actions(sip.getVerifybtn(), "doubleClick");
	}

	@When("user need to press the enter key to see the relevant matched product for the search word")
	public void user_need_to_press_the_enter_key_to_see_the_relevant_matched_product_for_the_search_word() {
		sendKeys(atc.getOptionselect(), "kajal");

	}

	@When("user have to select the required product displayed on the page by click over it")
	public void user_have_to_select_the_required_product_displayed_on_the_page_by_click_over_it() throws AWTException {
		robot("Enter");

	}

	@When("user need to handle the windows to switch to required clicked product page")
	public void user_need_to_handle_the_windows_to_switch_to_required_clicked_product_page() {
		System.out.println("testing");
		actions(atc.getProdectclick(), "moveToElement");
		productTextValue = getText(atc.getGettext());
		actions(atc.getAddbag(), "click");
	}

	@When("user should click the add to bag button and add to bag page will be displayed")
	public void user_should_click_the_add_to_bag_button_and_add_to_bag_page_will_be_displayed()
			throws InterruptedException {
		Thread.sleep(10000);
		click(atc.getCartbutton());
	}

	@When("then user should switch to the add to bag page frame")
	public void then_user_should_switch_to_the_add_to_bag_page_frame() {
		switchToFrame(atc.getAddtobagFrame());
	}

	@Then("user should able to validate the add to product and add to bag page will be  displayed as a same product")
	public void user_should_able_to_validate_the_add_to_product_and_add_to_bag_page_will_be_displayed_as_a_same_product() {
		String bagtext = getText(atc.getaddtobagproduct());
		Assert.assertEquals(productTextValue, bagtext);

	}

}

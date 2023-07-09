package com.E_Commerce;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base_All.Base;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\featureEcommerce\\Ecommerce.feature", glue = "com.StepDefinition123", plugin = {
		"html:ReportFolder\\htmlreport.html", "pretty" })

public class Ecommerce_Runner extends Base {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() {

		driver = browserLaunch("chrome");
	}

	@AfterClass
	public static void teardown1() {

		close();
	}

}

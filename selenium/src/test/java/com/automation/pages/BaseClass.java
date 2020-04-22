package com.automation.pages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.automation.utility.BrowserFactory;

public class BaseClass {

	@BeforeClass
	public void setup() {
		driver = BrowserFactory.StartApplication(driver, "Chrome", "https://ui.freecrm.com/");
		System.out.println("Before Start : " + driver.getTitle());

	}

	@AfterClass
	public void tearDown() {
		BrowserFactory.quitbrowser(driver);

	}

}

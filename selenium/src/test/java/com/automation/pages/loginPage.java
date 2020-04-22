package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {
	public WebDriver driver;

	public loginPage(WebDriver ldriver) {
		this.driver = ldriver;

	}

	@FindBy(name = "email")
	WebElement uname;
	@FindBy(name = "password")
	WebElement Pwrd;
	@FindBy(xpath = "//div[text()='Login']")
	WebElement loginbutton;

	public void logintocrm(String usernameApplication, String passwordApplication) throws InterruptedException {
		uname.sendKeys(usernameApplication);
		Pwrd.sendKeys(passwordApplication);
		Thread.sleep(5000);
		loginbutton.click();

	}

}

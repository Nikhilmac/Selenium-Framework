package com.automation.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.automation.pages.BaseClass;
import com.automation.pages.loginPage;

public class loginTest extends BaseClass {

	@Test
	public void loginApp() throws InterruptedException, IOException {
		// ExcelDataProvider excel = new ExcelDataProvider();

		loginPage loginpage = PageFactory.initElements(driver, loginPage.class);
		/**
		 * This is Abstraction Showing essential features and hinding background
		 * details.
		 */
		loginpage.logintocrm("porikanikhil45@gmail.com", "nikhilnikhil");
		System.out.println("After Start : " + driver.getTitle());
	}

}
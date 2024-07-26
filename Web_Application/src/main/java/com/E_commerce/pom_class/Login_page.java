package com.E_commerce.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	WebDriver Driver;

	public Login_page(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "login_field")
	WebElement EmailId;

	@FindBy(id = "password")
	WebElement userpassword;

	@FindBy(name = "commit")
	WebElement loginbutton;

	public WebElement getUsername() {
		return EmailId;
	}

	public WebElement getUserpassword() {
		return userpassword;
	}

	public WebElement getLoginbutton() {

		return loginbutton;
	}

	public void loginToapp(String url, String username, String password) {
		// waitForPageToLoad(Driver);
		Driver.get(url);
		// driver.manage().window().maximize();
		EmailId.sendKeys(username);
		userpassword.sendKeys(password);
		loginbutton.click();

	}
}

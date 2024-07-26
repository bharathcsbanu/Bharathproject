package com.E_commerce.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_repo_page {
	WebDriver Driver;

	public Create_repo_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = ":r4:")
	WebElement repotextfield;
	@FindBy(id = ":r7:")
	WebElement radiobutton;
	@FindBy(xpath = "//span[text()='Create repository']")
	WebElement createrepo;

	public WebElement getRepotextfield() {
		return repotextfield;
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getCreaterepo() {
		return createrepo;
	}

	public void loginToapp(String url, String Repotextfield) {
		// waitForPageToLoad(Driver);
		Driver.get(url);
		// driver.manage().window().maximize();
		repotextfield.sendKeys(Repotextfield);
		radiobutton.click();
		createrepo.click();

	}
}
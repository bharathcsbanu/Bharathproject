package com.E_commerce.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepositoryInfo_page {

	WebDriver Driver;

	public RepositoryInfo_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "(//clipboard-copy[@class='btn btn-sm zeroclipboard-button'])[1]")
	WebElement copybutton;

	public WebElement getCopybutton() {
		return copybutton;
	}

	public void copybutton() {
		copybutton.click();
	}
}

package com.E_commerce.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	WebDriver Driver;

	public Home_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="(//span[@class='Button-content'])[4]")
		WebElement newbutton;

		public WebElement getNewbutton() {
			return newbutton;
		}
		public void newbutton() {
			newbutton.click();
		}
		public void Createrepo() {
			newbutton.click();
		}
}



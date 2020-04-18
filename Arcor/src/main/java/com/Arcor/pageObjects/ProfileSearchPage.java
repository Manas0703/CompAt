package com.Arcor.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileSearchPage {
	
	WebDriver driver;

	public ProfileSearchPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);

	}

	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Profiles'])[1]/preceding::a[1]") 
	WebElement Administration;
	
	public WebElement Administration() {
		return Administration;
	}
	
	@FindBy(linkText = "Profiles") 
	WebElement profiles;
	
	public WebElement profiles() {
		return profiles;
	}
	
	@FindBy(id = "ProfileName") 
	WebElement profilename;
	
	public WebElement profilename() {
		return profilename;
	}
	@FindBy(id = "searchprofile") 
	WebElement searchprofile;
	
	public WebElement searchprofile() {
		return searchprofile;
	}
	
}

package com.Arcor.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "Email")
	WebElement email;

	public WebElement email() {
		return email;
	}

	@FindBy(id = "Password")
	WebElement password;

	public WebElement password() {
		return password;
	}

	@FindBy(xpath = "//input[@value='Login']")
	WebElement login;

	public WebElement login() {
		return login;
	}
	
	@FindBy(xpath = "//input[@value='I Agree']")
	WebElement iAgree;

	public WebElement iAgree() {
		return iAgree;
	}

	@FindBy(xpath = "//*[@id=\"headerRightCol\"]/li[3]/div/a/span")
	WebElement name;

	public WebElement name() {
		return name;
	}

	@FindBy(linkText = "Logout")
	WebElement logout;

	public WebElement logout() {
		return logout;
	}
	
	@FindBy(xpath = "//*[@id='headerRightCol']/li[3]/div/div/ul/li[2]/a")
	WebElement Logout1;

	public WebElement Logout1() {
		return Logout1;
	}
	
	@FindBy(xpath = "//*[@id=\"headerRightCol\"]/li[3]/div/div/ul/li[1]/a")
	WebElement Preference;

	public WebElement Preference() {
		return Preference;
	}
	
	@FindBy(xpath = "//*[@id=\"prePassword\"]")
	WebElement ChangePassword;

	public WebElement ChangePassword() {
		return ChangePassword;
	}

	@FindBy(xpath = "//*[@id=\"OldPassword\"]")
	WebElement TemporaryOldPassword;

	public WebElement TemporaryOldPassword() {
		return TemporaryOldPassword;
	}
	
	@FindBy(xpath = "//*[@id=\"Password\"]")
	WebElement NewPassword;

	public WebElement NewPassword() {
		return NewPassword;
	}

	@FindBy(xpath = "//*[@id=\"ConfirmPassword\"]")
	WebElement Reenternewpassword;

	public WebElement Reenternewpassword() {
		return Reenternewpassword;
	}

	@FindBy(xpath = "//*[@id=\"change-password\"]/div[2]/input")
	WebElement Savebuttonpreference;

	public WebElement Savebuttonpreference() {
		return Savebuttonpreference;
	}
	
	@FindBy(xpath = "//*[@id=\"change-password\"]/div[1]/div[1]/div[2]/span/span")
	WebElement Blankpassword;

	public WebElement Blankpassword() {
		return Blankpassword;
	}
	
	@FindBy(xpath = "//*[@id=\"change-password\"]/div[1]/div[3]/div[2]/span/span")//*[@id="change-password"]/div[1]/div[3]/div[2]/span/span
	WebElement Mismatchpassword;

	public WebElement Mismatchpassword() {
		return Mismatchpassword;
	}

	
	@FindBy(xpath = "")
	WebElement Changepassword;

	public WebElement Changepassword() {
		return Changepassword;
	}
	
	@FindBy(xpath = "//*[@id='liadmin']/a")
	WebElement Administrator;

	public WebElement Administrator() {
		return Administrator;
	}
	
	@FindBy(xpath = "//*[@id='liadmin']/ul/li[2]/a")
	WebElement Roles;

	public WebElement Roles() {
		return Roles;
	}
	
	@FindBy(xpath = "//*[@id='frmRolePermission']/div/div[1]/div[2]/div/div[2]/a")
	WebElement Createrole;

	public WebElement Createrole() {
		return Createrole;
	}
	 
	@FindBy(xpath = "//*[@id='RoleName']")
	WebElement Rolename;

	public WebElement Rolename() {
		return Rolename;
	}
	
	@FindBy(xpath = "//*[@id='frmRolePermission']/div/div[2]/div/div[2]/a[1]")
	WebElement Saverole;

	public WebElement Saverole() {
		return Saverole;
	}

}

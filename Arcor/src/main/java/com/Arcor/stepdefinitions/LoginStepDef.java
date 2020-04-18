package com.Arcor.stepdefinitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.Arcor.pageObjects.LoginPage;
import com.Arcor.testBase.TestBase;
import com.HRA.enums.Browsers;
import com.HRA.enums.OS;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends TestBase {

	/*public WebDriver selectBrowser(String browser) {
		
		return null;
	}*/
	
	LoginPage pf = new LoginPage(driver);

	@Given("^Navigate to HRAcuity Login page URL \"([^\"]*)\"$")
	public void navigate_to_HRAcuity_Login_page_URL(String arg1) throws Throwable {

		driver.get("https://qa-chenoa.hracuity.net");

	}

	@When("^Enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_valid_and(String arg1, String arg2) throws Throwable {
		////LoginPage pf = new LoginPage(driver);
		pf.email().clear();
		pf.email().sendKeys("mmehta@chenoainc.com");
		Thread.sleep(1000);

		pf.password().clear();
		pf.password().sendKeys("Dhadak@12");
		Thread.sleep(1000);

	}

	@When("^click on Login Button$")
	public void click_on_Login_Button() throws Throwable {
		////LoginPage pf = new LoginPage(driver);
		pf.login().click();
		Thread.sleep(2000);

	}

	@When("^click on I Agree Button$")
	public void click_on_I_Agree_Button() throws Throwable {
		////LoginPage pf = new LoginPage(driver);
		pf.iAgree().click();
		Thread.sleep(2000);

	}

	@When("^click on his/her name$")
	public void click_on_his_her_name() throws Throwable {
		//LoginPage pf = new LoginPage(driver);
		pf.name().click();
		Thread.sleep(2000);

	}

	@When("^select logout from the dropdown$")
	public void select_logout_from_the_dropdown() throws Throwable {
		//LoginPage pf = new LoginPage(driver);
		pf.logout().click();
		Thread.sleep(2000);

	}

	@Then("^Browser close$")
	public void browser_close() throws Throwable {
		driver.quit();

	}

	@When("^Enter Invalid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_Invalid_and(String arg1, String arg2) throws Throwable {
		//LoginPage pf = new LoginPage(driver);
		pf.email().clear();
		pf.email().sendKeys("email");
		Thread.sleep(1000);

		pf.password().clear();
		pf.password().sendKeys("password");
		Thread.sleep(2000);

	}

	@Then("^Error message Dispaly$")
	public void error_message_Dispaly() throws Throwable {
		assertTrue(driver.findElement(By.id("lblErrorMessage")).isDisplayed());
		Thread.sleep(3000);

	}
	
	@When("^click on Preferences$")
	public void click_on_Preferences() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    click_on_his_her_name();
	    //LoginPage pf = new LoginPage(driver);
		pf.Preference().click();
	    //pf.name().click();
	    
	}

	@When("^click on Change Password$")
	public void click_on_Change_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		//LoginPage pf = new LoginPage(driver);
		pf.ChangePassword().click();
	}

	@When("^Enter \"([^\"]*)\"$")
	public void enter(String arg1) throws Throwable {
		//LoginPage pf = new LoginPage(driver);
		pf.TemporaryOldPassword().sendKeys("");
		Thread.sleep(1000);

		pf.NewPassword().sendKeys("");
		Thread.sleep(1000);

		pf.Reenternewpassword().sendKeys("");
		Thread.sleep(1000);
	}

	@Then("^Click on Save$")
	public void click_on_Save() throws Throwable {
	    
		//LoginPage pf = new LoginPage(driver);
		pf.Savebuttonpreference().click();
		Thread.sleep(2000);
		
	}

}

package com.Arcor.stepdefinitions;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.Arcor.helper.LoggerHelper;
import com.Arcor.pageObjects.LoginPage;
import com.Arcor.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AllOpenCaseSearchStepDef extends TestBase {
	
	Logger log = LoggerHelper.getLogger(AllOpenCaseSearchStepDef.class);

	@Given("^Navigate to HRAcuity with Case Admin credentials$")
	public void navigate_to_HRAcuity_with_Case_Admin_credentials() throws Throwable {
		
		driver.get("https://qa-demo.hracuity.net");

		LoginPage pf = new LoginPage(driver);
		pf.email().clear();
		pf.email().sendKeys("rkhan@hracuity.com");

		pf.password().clear();
		pf.password().sendKeys("9hki1*g68D");
		pf.login().click();
		pf.iAgree().click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@When("^User Clicks on case tab$")
	public void user_Clicks_on_case_tab() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id=\"licases\"]")).click();
		Thread.sleep(2000);

	}

	@When("^Click on case Status$")
	public void click_on_case_Status() throws Throwable {
		
		driver.findElement(By.id("CaseStatus")).click();
		Thread.sleep(2000);

	}

	@When("^Select All Open Cases$")
	public void select_All_Open_Cases() throws Throwable {
		
		new Select(driver.findElement(By.id("CaseStatus"))).selectByVisibleText("All Open Cases");
		Thread.sleep(2000);
		new Select(driver.findElement(By.id("CaseStatus"))).selectByVisibleText("All Open Cases");
	    driver.findElement(By.id("CaseStatus")).click();
	    driver.findElement(By.id("CaseNumber")).click();
	    driver.findElement(By.id("CaseNumber")).clear();
	    Thread.sleep(2000);

	}

	@When("^Type valid ER case number on Case Number field$")
	public void type_valid_ER_case_number_on_Case_Number_field() throws Throwable {
		
		driver.findElement(By.id("CaseNumber")).sendKeys("INV-19-03-070");
		Thread.sleep(2000);

	}

	@When("^click on Search button$")
	public void click_on_Search_button() throws Throwable {
		
		driver.findElement(By.id("btn-search-grid")).click();
		Thread.sleep(2000);

	}

	@When("^Open the case$")
	public void open_the_case() throws Throwable {
		
		driver.findElement(By.linkText("INV-19-03-070")).click();
		Thread.sleep(2000);

	}

	@When("^Verify case status in In Progress$")
	public void verify_case_status_in_In_Progress() throws Throwable {
		
		assertTrue(driver.findElement(By.xpath("//*[@id=\"change-case-status\"]/span[1]")).
				isDisplayed());
		 
		Thread.sleep(2000);

	}

	@When("^CaseAdmin logout from application$")
	public void caseadmin_logout_from_application() throws Throwable {
		
		LoginPage pf = new LoginPage(driver);
		pf.name().click();
		Thread.sleep(2000);
		pf.logout().click();
		Thread.sleep(1000);
		driver.quit();
		Thread.sleep(2000);

	}

	@When("^Type invalid ER case number on Case Number field$")
	public void type_invalid_ER_case_number_on_Case_Number_field() throws Throwable {
		
		driver.findElement(By.id("CaseNumber")).sendKeys("INV-1009-03");
		Thread.sleep(2000);

	}
	
	@When("^Case search Error message Dispaly$")
	public void Case_search_Error_message_Dispaly() throws Throwable {
		
		assertTrue
		 (driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cost Center'])[1]/following::span[1]")).
				 isDisplayed());
		Thread.sleep(3000);

	}

	@Then("^user logout from application$")
	public void user_logout_from_application() throws Throwable {
		
		LoginPage pf = new LoginPage(driver);
		pf.name().click();
		Thread.sleep(2000);
		pf.logout().click();
		Thread.sleep(1000);
		driver.quit();
		Thread.sleep(2000);

	}

}
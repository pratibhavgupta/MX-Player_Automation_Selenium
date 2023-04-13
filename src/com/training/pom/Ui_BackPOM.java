package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Ui_BackPOM {

	private WebDriver driver;
	
	public Ui_BackPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@href=\"/plans?redirectUri=%2F&svodJourney=topNav\"]")
	private WebElement ADD_FREE;
	
	@FindBy(xpath="//*[@class=\"back-icon\"]")
	private WebElement Back_Button;
	
	
	public void MX_59() {
		System.out.println("To verify Back Button visible on Subscription page");
		
		this.ADD_FREE.click();
		
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(this.Back_Button.isDisplayed());
		soft.assertAll();
		
		System.out.println("Back Button is visible on the GO-ADDFREE page");
	}
	
}

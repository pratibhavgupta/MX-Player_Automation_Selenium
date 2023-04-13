package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Fun_HomePOM {

	private WebDriver driver;
	
	public Fun_HomePOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@href=\"/plans?redirectUri=%2F&svodJourney=topNav\"]")
	private WebElement ADD_FREE;
	
	@FindBy(xpath="//span[contains(text(),\"Home\")]")
	private WebElement Home_Button;
	
	
	public void MX_66() {
		System.out.println("To validate the Home Button is present on the GO-ADDFREE page");
		
		this.ADD_FREE.click();
		
		this.Home_Button.click();
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(driver.getCurrentUrl(), "https://www.mxplayer.in/");
		soft.assertAll();
		System.out.println("We are able to access the Home Button");
	}
}

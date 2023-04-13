package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Ui_AnnualPOM {

	private WebDriver driver;
	
	public Ui_AnnualPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@href=\"/plans?redirectUri=%2F&svodJourney=topNav\"]")
	private WebElement ADD_FREE;
	
	@FindBy(xpath="//h2[contains(text(),'Annual')]")
	private WebElement Annual_Button;
	
	public void MX_57() {
		System.out.println("To varify Annual Radio button visible on Subscription page");
	
		this.ADD_FREE.click();
		
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(this.Annual_Button.isDisplayed());
		soft.assertAll();
		
		System.out.println("Annual Radio button is visible on the GO-ADDFREE page");
	}
	
}

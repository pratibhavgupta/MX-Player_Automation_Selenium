package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Ui_BuyPOM {

	private WebDriver driver;
	
	public Ui_BuyPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@href=\"/plans?redirectUri=%2F&svodJourney=topNav\"]")
	private WebElement ADD_FREE;
	
	@FindBy(xpath="//div[contains(text(),'Buy Now')]")
	private WebElement Buy_Button;
	
	
	public void MX_58() {
		System.out.println("To verify Buy Now Button visible on Subscription page");
		
		this.ADD_FREE.click();
		
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(this.Buy_Button.isDisplayed());
		soft.assertAll();
		
		System.out.println("Buy Now Button is visible on the GO-ADDFREE page");
	}
	
}

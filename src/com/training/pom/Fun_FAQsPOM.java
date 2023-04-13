package com.training.pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Fun_FAQsPOM {

	private WebDriver driver;
	
	public Fun_FAQsPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@href=\"/plans?redirectUri=%2F&svodJourney=topNav\"]")
	private WebElement ADD_FREE;
	
	@FindBy(xpath="//*[contains(text(),\"FAQs\")]")
	private WebElement FAQ_Button;
	
	
	@FindBy(xpath="//h2[contains(text(),\"MX Gold\")]")
	private WebElement Title;
	
	
	
	public void MX_64() {
		System.out.println("To validate the FaQ Button is present on the GO-ADDFREE page");
		
		this.ADD_FREE.click();
		
		this.FAQ_Button.click();
		
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(this.Title.isDisplayed());
		soft.assertAll();
		
		Set<String> id=driver.getWindowHandles();
		Iterator<String> it=id.iterator();
		
		String pid=it.next();
		driver.switchTo().window(pid);
		
		System.out.println("We are able to access the FaQ Button");
	}
}

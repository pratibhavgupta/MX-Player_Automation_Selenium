package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPOM {
	private WebDriver driver; 
	
	public LogoutPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="oxd-userdropdown-tab")
	private WebElement dropdown; 
	
	@FindBy(xpath="//*[contains(text(),'Logout')]")
	private WebElement logoutBtn;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement loginBtn; 
	
	public void sendUserName(String userName) {
//		this.userName.clear();
//		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
//		this.password.clear(); 
//		this.password.sendKeys(password); 
	}
	
	public void clickLogoutBtn() {
		this.dropdown.click();
		this.logoutBtn.click(); 
	}
	
	
}

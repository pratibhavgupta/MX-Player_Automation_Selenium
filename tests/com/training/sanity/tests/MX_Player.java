package com.training.sanity.tests;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.Fun_AnnualPOM;
import com.training.pom.Fun_BackPOM;
import com.training.pom.Fun_BuyPOM;
import com.training.pom.Fun_FAQsPOM;
import com.training.pom.Fun_HomePOM;
import com.training.pom.Fun_LoginPOM;
import com.training.pom.Fun_QuaterlyPOM;
import com.training.pom.Ui_AnnualPOM;
import com.training.pom.Ui_BackPOM;
import com.training.pom.Ui_BuyPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MX_Player {
	
	private WebDriver driver;
	private String baseUrl;
	private Ui_AnnualPOM ui_AnnualPOM;
	private Ui_BuyPOM ui_BuyPOM;
	private Ui_BackPOM ui_BackPOM;
	private Fun_AnnualPOM fun_AnnualPOM;
	private Fun_BackPOM fun_BackPOM;
	private Fun_BuyPOM fun_BuyPOM;
	private Fun_FAQsPOM fun_FAQsPOM;
	private Fun_HomePOM fun_HomePOM;
	private Fun_LoginPOM fun_LoginPOM;
	private Fun_QuaterlyPOM fun_QuaterlyPOM;
	
	private static Properties properties;
	private ScreenShot screenShoot;
	
	@BeforeTest
	public void setup() throws Exception {
		driver=DriverFactory.getDriver(DriverNames.CHROME);
		
		properties=new Properties();
		FileInputStream inStream=new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		baseUrl = properties.getProperty("baseURL");
		
		screenShoot=new ScreenShot(driver);
		driver.get(baseUrl);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority = 0)
	public void MxPlayer() {
		
		ui_AnnualPOM=new Ui_AnnualPOM(driver);
		ui_AnnualPOM.MX_57();
		
		driver.get(baseUrl);
		ui_BuyPOM=new Ui_BuyPOM(driver);
		ui_BuyPOM.MX_58();
		
		driver.get(baseUrl);
		ui_BackPOM=new Ui_BackPOM(driver);
		ui_BackPOM.MX_59();
		
		driver.get(baseUrl);
		fun_AnnualPOM=new Fun_AnnualPOM(driver);
		fun_AnnualPOM.MX_60();
		
		driver.get(baseUrl);
		fun_QuaterlyPOM=new Fun_QuaterlyPOM(driver);
		fun_QuaterlyPOM.MX_63();
		
		driver.get(baseUrl);
		fun_BuyPOM=new Fun_BuyPOM(driver);
		fun_BuyPOM.MX_67();
		
		driver.get(baseUrl);
		fun_BackPOM=new Fun_BackPOM(driver);
		fun_BackPOM.MX_68();
		
		driver.get(baseUrl);
		fun_FAQsPOM=new Fun_FAQsPOM(driver);
		fun_FAQsPOM.MX_64();
		
		driver.get(baseUrl);
		fun_HomePOM=new Fun_HomePOM(driver);
		fun_HomePOM.MX_66();
		
		driver.get(baseUrl);
		fun_LoginPOM=new Fun_LoginPOM(driver);
		fun_LoginPOM.MX_65();
		
		screenShoot.captureScreenShot();
	}

}

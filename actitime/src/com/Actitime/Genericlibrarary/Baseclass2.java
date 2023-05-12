package com.Actitime.Genericlibrarary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Actitime.objectrepository.Homepage;
import com.Actitime.objectrepository.loginpage;

public class Baseclass2 {
	public static WebDriver driver;
	filelibrary f= new filelibrary();
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("database connected",true);
	}
		@BeforeClass
		public void launchBrowser() throws IOException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			String pot = f.readDatafrompropertyfile("url");
			driver.get("pot");
			Reporter.log("browser is launched",true);
		}
			
		@BeforeMethod
		public void login() throws IOException {
			loginpage lp=new loginpage(driver);
			String UN = f.readDatafrompropertyfile("username");		
			String pw = f.readDatafrompropertyfile("password");
               lp.getUntx().sendKeys(UN);
               lp.getPwtbx().sendKeys(pw);
               lp.getLgbtn().click();
               Reporter.log("login suceesfully");
		}
		@AfterMethod
		public void logout() {
			Homepage hp=new Homepage(driver);
			hp.getTasked().click();
			driver.findElement(By.id("logoutLink")).click();
			Reporter.log("logout sucessfully");
		
	}
	@AfterClass
	public void closebrowser() {
		Reporter.log("browser closed",true);
	}
	
	@AfterSuite
	public void databasedisconnection() {
		Reporter.log("database dissconnected",true);
	}
}


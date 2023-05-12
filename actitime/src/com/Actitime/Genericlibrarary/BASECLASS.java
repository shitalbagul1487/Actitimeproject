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

public class BASECLASS {
	
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
			Reporter.log("browser is launched");
		}
			
		@BeforeMethod
		public void login() throws IOException {
			String UN = f.readDatafrompropertyfile("username");
			driver.findElement(By.id("username")).sendKeys(UN);
			String pw = f.readDatafrompropertyfile("password");
			driver.findElement(By.name("pwd")).sendKeys("pw");
			driver.findElement(By.xpath("//div[.='Login ']")).click();
		}
		@AfterMethod
		public void logout() {
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
	
	
	
	
	
	
	
	
	



package com.Actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
//decleration
	@FindBy(id="username")
	private WebElement untx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath ="//div[.='Login ']")
	private WebElement lgbtn;
	
	
	//intialization
	public loginpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	//utilization


	public WebElement getUntx() {
		return untx;
	}


	public WebElement getPwtbx() {
		return pwtbx;
	}


	public WebElement getLgbtn() {
		return lgbtn;
	}
	
		
	
	
}	
	


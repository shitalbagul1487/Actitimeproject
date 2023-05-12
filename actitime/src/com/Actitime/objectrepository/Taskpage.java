package com.Actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Taskpage {


	@FindBy(xpath="//div[.='Add New']")
	private WebElement Addnew;
	

	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newcustomer;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customname;
	

	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement decription;
	
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createcustomer;
	

	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancle;
	

	
	//intialization
	
	public Taskpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
//utilization
	public WebElement getAddnew() {
		return Addnew;
	}

	public WebElement getNewcustomer() {
		return newcustomer;
	}

	public WebElement getCustomname() {
		return customname;
	}

	public WebElement getDecription() {
		return decription;
	}

	public WebElement getCreatecustomer() {
		return createcustomer;
	}

	public WebElement getCancle() {
		return cancle;
	}
	
	
	
	
	
}



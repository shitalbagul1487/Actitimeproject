package com.Actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	
	//decleration
	
	@FindBy(id="container_tasks")
	private WebElement taskab;

	@FindBy(id="container_reports")
	private WebElement taskbc;
	
	
	@FindBy(id="container_users")
	private WebElement taskcd;
	
	
	@FindBy(id="logoutLink")
	private WebElement tasked;
	
	
	//intialization
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

//utilization
	public WebElement getTaskab() {
		return taskab;
	}


	public WebElement getTaskbc() {
		return taskbc;
	}


	public WebElement getTaskcd() {
		return taskcd;
	}


	public WebElement getTasked() {
		return tasked;
	}
	
	
	
}


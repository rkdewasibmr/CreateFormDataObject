package com.gforms.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gforms.qa.base.TestBase;

public class LoginPage2 extends TestBase {
	
	///Object repositary
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordtextbox;
	
	@FindBy(xpath="//div[@id='passwordNext']//content[@class='CwaK9']")
	WebElement nextbtn;
	
	//initialize the elements
	
	public LoginPage2() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
	}
	
	//actions
	public void enterpassword() {
		passwordtextbox.sendKeys(prop.getProperty("pwd"));
		
	}
	
	public HomePage2 clickonnext() throws IOException {
		
		nextbtn.click();
		return new HomePage2();
		
	}

}

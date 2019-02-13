package com.gforms.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gforms.qa.base.TestBase;

public class UserNamePage2 extends TestBase {

	//public LoginPage loginpage;
	//object repositary
	//@FindBy(xpath="//input[contains(@aria-label,'Email')]")
	@FindBy(xpath="//input[@type='email']")
	WebElement username;
	
	@FindBy(xpath="//div[@id='identifierNext']//content[@class='CwaK9']")
	WebElement nextbtn;
	
	//initialization of the elements
	public UserNamePage2() throws IOException {
		
		super();
		
		PageFactory.initElements(driver , this);
	}
	
	
	//actions
	
	public void provideUserName() {
		
		username.sendKeys(prop.getProperty("user"));
		
	}
	
	public LoginPage2 cliconNext() throws IOException {
		
		nextbtn.click();
		System.out.println("returning to loginpage");
		return new LoginPage2();
	}
	
	
	
}

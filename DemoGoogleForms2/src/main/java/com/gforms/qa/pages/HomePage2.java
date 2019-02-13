package com.gforms.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gforms.qa.base.TestBase;

public class HomePage2 extends TestBase{

	///Object repositary
	@FindBy(xpath="//img[contains(@src,'blank')]")
	WebElement newform;


	//initialize the elements
	public HomePage2() throws IOException {
		super();
		PageFactory.initElements(driver, this);

	}

	//actions
	
	public FormPage2 navigatetoNewForm() throws InterruptedException, IOException {
		//WebElement newform =driver.findElement(By.xpath("//img[contains(@src,'blank')]"));
		Thread.sleep(10000);
		Actions actions = new Actions(driver);
		actions.moveToElement(newform).click().perform();
		return new FormPage2();
		
	}




}

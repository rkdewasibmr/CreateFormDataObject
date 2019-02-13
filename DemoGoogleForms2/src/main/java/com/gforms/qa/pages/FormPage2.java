package com.gforms.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gforms.qa.base.TestBase;

public class FormPage2 extends TestBase{



	///Object repositary
	@FindBy(xpath="//textarea[contains(@data-initial-value,'Untitled Question')]")
	static WebElement questiontitle;
	@FindBy(xpath="//input[contains(@data-initial-value,'Option')]")
	static WebElement option;

	@FindBy(xpath="//input[contains(@aria-label,'Add option')]")
	static WebElement addoption;

	@FindBy(xpath="//div[contains(@data-tooltip,'Setting')]")
	static WebElement settingsbtn;

	@FindBy(xpath="//content[contains(text(),'Quizzes')]")
	static WebElement Quizoption;	

	@FindBy(xpath="//div[contains(@aria-label,'Make this a quiz')]/div[contains(@class,' exportTrack')]")
	static WebElement togglebtn;	

	@FindBy(xpath="//div[contains(@class,'quantumWizDialogPaperdialogTopButtons')]//span[contains(text(),'Save')]")
	static WebElement savebtn;	

	//div[contains(@class,'quantumWizDialogPaperdialogTopButtons')]//span[contains(text(),'Save')]



	//div[contains(@aria-label,'Make this a quiz')]//div[contains(@class,' exportInk')]




	//@FindBy(xpath="//img[contains(@src,'blank')]")
	//WebElement questiontitle;



	//initialize the elements
	public FormPage2() throws IOException {
		super();
		PageFactory.initElements(driver, this);

	}


	//actions
	public static void fillformdata(String q, String o1,String o2,String o3) throws InterruptedException {



		questiontitle =driver.findElement(By.xpath("//textarea[contains(@aria-label,'Question title')]"));
		option = driver.findElement(By.xpath("//input[contains(@data-initial-value,'Option')]"));
		addoption = driver.findElement(By.xpath("//input[contains(@aria-label,'Add option')]"));

		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		sendvalue(driver.findElement(By.xpath("//textarea[contains(@aria-label,'Question title')]")), q);

		//Thread.sleep(200);
		//sendvalue(option, o1);
		sendvalue(driver.findElement(By.xpath("//input[contains(@data-initial-value,'Option')]")), o1);
		Thread.sleep(300);
		driver.findElement(By.xpath("//input[contains(@aria-label,'Add option')]")).click();
		//addoption.click();
		Thread.sleep(200);
		sendvalue(driver.findElement(By.xpath("//input[contains(@data-initial-value,'Option')]")), o2);
		//sendvalue(option, o2);
		driver.findElement(By.xpath("//input[contains(@aria-label,'Add option')]")).click();

		//addoption.click();
		Thread.sleep(200);
		sendvalue(driver.findElement(By.xpath("//input[contains(@data-initial-value,'Option')]")), o3);
		//sendvalue(option, o3);
		//addoption.click();
		Thread.sleep(8000);
		//WebElement option2 = driver.findElement(By.xpath("//input[contains(@data-initial-value,'Option')]"));



		/*questiontitle.sendKeys("q1w");
			option.sendKeys("q1o1");
			addoption.click();
			settingsbtn.click();
			Thread.sleep(500);
			Quizoption.click();
			Thread.sleep(500);

			Actions action2 = new Actions(driver);
			action2.moveToElement(togglebtn).click().build().perform();;
			//togglebtn.click();

			//sendvalue(option2, "q1o2");
			Thread.sleep(2000);
			action2.moveToElement(savebtn).click().build().perform();
			//savebtn.click();
		 */
	}


	public static void fillQuestion(String q) {


	}

	public static void fillOption(String o) {


	}


	public static void sendvalue(WebElement ele,String value1) throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		//jse.executeScript("arguments[0].setAttribute('data-initial-value',arguments[1]);",ele,value1);
		//jse.executeScript("arguments[0].setAttribute('value',arguments[1]);",ele,value1);


		ele.click();
		//Thread.sleep(500);
		//ele.sendKeys(Keys.);
		//ele.click();
		//ele.clear();
		ele.sendKeys(Keys.CONTROL,"a");
		ele.sendKeys(Keys.BACK_SPACE);
		//Thread.sleep(3000);
		ele.sendKeys(value1);
		ele.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		jse.executeScript("arguments[0].setAttribute('data-initial-value',arguments[1]);",ele,value1);







	}
}

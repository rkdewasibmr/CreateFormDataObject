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
	WebElement questiontitle;
	
	
	//@FindBy(xpath="//textarea[contains(@aria-label,'Question t') ][not (text())]")
	
	@FindBy(xpath="//div[contains(@class,'ViewItemActive')]//textarea[contains(@aria-label,'Question t') ][not (text())]")
	WebElement questiontitle2;
	@FindBy(xpath="//input[contains(@data-initial-value,'Option')]")
	WebElement option;

	
	@FindBy(xpath="//div[contains(@class,'ViewItemActive')]//div[contains(@aria-label,'Delete i') ]")
	WebElement deletequestionbtn;
	
	////div[@class='freebirdFormeditorViewItemRoot itemBorder freebirdFormeditorViewItemActive']//input[contains(@aria-label,'Add')]
	
	//div[contains(@class,'ViewItemActive')]//input[contains(@aria-label,'Add')]
	//@FindBy(xpath="//input[contains(@aria-label,'Add option')]")
	
	
	@FindBy(xpath="//div[contains(@class,'ViewItemActive')]//input[contains(@aria-label,'Add')]")
	WebElement addoption;

	@FindBy(xpath="//div[contains(@data-tooltip,'Setting')]")
	WebElement settingsbtn;

	@FindBy(xpath="//content[contains(text(),'Quizzes')]")
	WebElement Quizoption;	

	@FindBy(xpath="//div[contains(@aria-label,'Make this a quiz')]/div[contains(@class,' exportTrack')]")
	WebElement togglebtn;	

	@FindBy(xpath="//div[contains(@class,'quantumWizDialogPaperdialogTopButtons')]//span[contains(text(),'Save')]")
	WebElement savebtn;	

	@FindBy(xpath="//div[contains(@class,'FatDesktop')]//div[contains(@data-tooltip,'Add question')]")
	WebElement addquestionbtn;

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
	public void saveQuiz() throws InterruptedException {



		/*questiontitle =driver.findElement(By.xpath("//textarea[contains(@aria-label,'Question title')]"));
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


		questiontitle.sendKeys("q1w");
			option.sendKeys("q1o1");
			addoption.click();*/


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

	}


	public void fillQuestion(String q) throws InterruptedException {

		//Actions builder = new Actions(driver);
		//builder.moveToElement(questiontitle);
		//WebElement ele = driver.findElement(By.xpath("//textarea[contains(@data-initial-value,'Untitled Question')]"));
		// */
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", questiontitle);
		System.out.println("bbbbb");
		sendvalue(questiontitle, q);
		Thread.sleep(500);

	}

	
	public void fillQuestion2(String q) throws InterruptedException {

		//Actions builder = new Actions(driver);
		//builder.moveToElement(questiontitle);
		//WebElement ele = driver.findElement(By.xpath("//textarea[contains(@data-initial-value,'Untitled Question')]"));
		// */
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", questiontitle2);
		System.out.println("bbbbb");
		sendvalue(questiontitle2, q);
		Thread.sleep(500);

	}

	public void addOption() throws InterruptedException {

		Actions action2 = new Actions(driver);
		//action2.moveToElement(driver.findElement(By.xpath("//input[contains(@aria-label,'Add option')]"))).click().build().perform();
		//driver.findElement(By.xpath("//input[contains(@aria-label,'Add option')]")).click();

		action2.moveToElement(addoption).click().build().perform();
		Thread.sleep(2000);
		//

	}
	
	public void clickOnDeleteQuestion() throws InterruptedException {

		Actions action2 = new Actions(driver);
		//action2.moveToElement(driver.findElement(By.xpath("//input[contains(@aria-label,'Add option')]"))).click().build().perform();
		//driver.findElement(By.xpath("//input[contains(@aria-label,'Add option')]")).click();

		action2.moveToElement(deletequestionbtn).click().build().perform();
		Thread.sleep(2000);
		//

	}


	public void fillOption(String o) throws InterruptedException {

		//Actions action2 = new Actions(driver);

		//WebElement ele = driver.findElement(By.xpath("//input[contains(@data-initial-value,'Option')]"));

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", option);
		
		//action2.moveToElement(option);
		sendvalue(option, o);


	}

	public void clickOnAddQuestion() throws InterruptedException {



		Actions action2 = new Actions(driver);

		action2.moveToElement(addquestionbtn).click().build().perform();
		//Thread.sleep(500);

	}


	public void sendvalue(WebElement ele,String value1) throws InterruptedException {
		//System.out.println("usin");
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		//jse.executeScript("arguments[0].setAttribute('data-initial-value',arguments[1]);",ele,value1);
		//jse.executeScript("arguments[0].setAttribute('value',arguments[1]);",ele,value1);
		//jse.executeScript("arguments[0].scrollIntoView(true);", ele);
		//Actions action2 = new Actions(driver);
		//action2.moveToElement(ele).sendKeys(Keys.CONTROL,"a").sendKeys(Keys.BACK_SPACE).ele.sendKeys(value1).bui
		ele.click();
		//Thread.sleep(500);
		//ele.sendKeys(Keys.);
		//ele.click();
		//ele.clear();
		//System.out.println("eeeeee");
		ele.sendKeys(Keys.CONTROL,"a");
		//ele.sendKeys(Keys.BACK_SPACE);
		//System.out.println("ffffff");
		Thread.sleep(500);
		ele.sendKeys(value1);
		//System.out.println("ggggg");
		//ele.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		///System.out.println("hhhhhh");
		//jse.executeScript("arguments[0].setAttribute('data-initial-value',arguments[1]);",ele,value1);
		//jse.executeScript("arguments[0].setAttribute('data-initial-value',arguments[1]);",ele,"");
		//System.out.println("iiiii");






	}
}

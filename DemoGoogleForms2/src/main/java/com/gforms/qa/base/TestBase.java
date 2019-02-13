package com.gforms.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase() throws IOException {
		try {
			prop = new Properties();

			FileInputStream fsr = new FileInputStream("E:\\Selenium_Practice\\DemoGoogleForms\\src\\main\\java\\com\\gforms\\qa\\config\\config.properties");
			prop.load(fsr);
	
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e2) {
			e2.printStackTrace();
		}
				
	}
	
	public void initialization() {
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",prop.getProperty("Chromedriverpath"));
			driver = new ChromeDriver();
	
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(800, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("url"));
		
		
	}
	
	
	

}

package org.Project_Selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public static WebDriver driver;

	// browser launch

	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//driver//chromedriver.exe");
			driver = new ChromeDriver();
			}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//driver//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
	}

	// click

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	// sendkeys

	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys();
	}

	// geturl

	public static void getUrl(String url) {
		driver.get(url);
	}

	// close

	public static void close() {
		driver.close();
	}

	// quit

	public static void quit() {
		driver.quit();
	}

	//clear
	
	public static void clear(WebElement element) {

		element.clear();
	}

	// dropdown and check single or multiple dropdown

	public static void dropDownCheck(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement k : options) {
			System.out.println(k.getText());
		}
		System.out.println("multi select dropdown or single select dropdown");
		if (s.isMultiple() == true)
			System.out.println("It is a multiple dropdown");
		else
			System.out.println("It is a single dropdown");
		System.out.println("index to be selected between 0 &" + (options.size() - 1));
	}

	//action
	
	public static void actions(String actionName, WebElement element) {

		try {
			Actions a = new Actions(driver);
			if (actionName.equalsIgnoreCase("moveto")) {
				a.moveToElement(element).build().perform();
			}
			else if (actionName.equalsIgnoreCase("clickon")) {
				a.click(element).build().perform();
			}
			else if (actionName.equalsIgnoreCase("doubleClick")) {
				a.contextClick(element).build().perform();
			}
			else if (actionName.equalsIgnoreCase("click")) {
				a.click(element).build().perform();
			}
			
		} catch ( Exception e) {
			e.printStackTrace();
		}
	}
	
	//double click
	public static void doubleClick(WebElement element) {

		doubleClick(element);
	}
	
	//frame
	
	public static void frame() {
		driver.switchTo().frame(0);
	}
	
	//defaultcontent
	public static void defaultContent() {
		driver.switchTo().defaultContent();
	}
	// dropdown 
	
	public static void dropdown (String type, WebElement element, String value) {

		Select s = new Select(element);
		
		if(type.equalsIgnoreCase("byValue")) {
			
			s.selectByValue(value);
		}
		else if (type.equalsIgnoreCase("byVisibleText")) {
			
			s.selectByVisibleText(value);
		}
		else if(type.equalsIgnoreCase("byIndex")) {
			
			int data = Integer.parseInt(value);
			
			s.selectByIndex(data);
		}
	}
	

	// timeouts

	public static void implicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	//explicitwait
	
	public static void explicitWait(int seconds, WebElement element) {
		
		WebDriverWait wait = new WebDriverWait (driver,seconds);
		wait.until(ExpectedConditions.visibilityOf(element));

	}
	//alert
	
	public static void alert() {
	driver.switchTo().alert().accept();
	}
	
	//thread.sleep
	
	public static void thread(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}
	
	//moveToElement
	
	public static void moveToElement(WebElement element) {	
		
		moveToElement(element);
	}
	
	//doubleclick
//	public static void doubleclick(WebElement element) {
//		doubleclick(element);		
//	}
//	
	//explicit image

	public static void explicitWait(Object image) {
	explicitWait(image);
	}
	
	//javaScriptExecutor
	public static void javaScriptExecutor() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", "");
		javaScriptExecutor();
	}
	// takeScreenshot

	public static void takeScreenShot(String imgName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("c:\\Users\\91888\\eclipse-workspace\\Maven\\ScreenShot\\" + imgName + ".png");
		FileUtils.copyFile(source, destination);
	}
}

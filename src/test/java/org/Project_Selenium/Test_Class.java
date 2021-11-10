package org.Project_Selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Pom.Home_Page;
import com.Pom.Login;
import com.Pom.My_Order;

public class Test_Class extends Base_Class {

	public static WebDriver driver = Base_Class.getBrowser("chrome");
	public static Home_Page hp = new Home_Page(driver);
	public static Login s = new Login(driver);

	public static void main(String[] args) throws InterruptedException {

		getUrl("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		moveToElement(hp.getWomen());
		
		thread(3000);
		
		doubleClick(hp.getTshirts());
		
		javaScriptExecutor();
		
		WebElement image = driver.findElement(By.xpath("//img[@itemprop='image']"));
		explicitWait(image);
		clickOnElement(hp.getImage());
		
		frame();
		clickOnElement(hp.getColor());
		
		clickOnElement(hp.getCart());
		
		defaultContent();
		WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		explicitWait(checkout);
		clickOnElement(hp.getCheckout());
		
		clickOnElement(hp.getProceed());
				
		inputValueElement(s.getEmail(), "java1229@gmail.com");
		
		inputValueElement(s.getPassword(), "test@123");
		
		clickOnElement(s.getLogin());
		
		My_Order m = new My_Order(driver);
		
		clickOnElement(m.getAddress());
		
		clickOnElement(m.getTermsAndConditons());
		
		clickOnElement(m.getProceedToCheckout());
		
		clickOnElement(m.getPayment());
		
		clickOnElement(m.getConfirm());
		
	}
	}
	

		
	



package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Order {
	
	public WebDriver driver;
	
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement address;
	
	@FindBy(id = "cgv")
	private WebElement termsAndConditons;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement proceedToCheckout;
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement payment;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirm;


	public My_Order(WebDriver def) {
		
		this.driver= def;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getTermsAndConditons() {
		return termsAndConditons;
	}

	public WebElement getProceedToCheckout() {
		return proceedToCheckout;
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getConfirm() {
		return confirm;
	}
}

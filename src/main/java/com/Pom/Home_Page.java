package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver;

	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;
	
	@FindBy(xpath="(//a[text()='T-shirts'])[1]")
	private WebElement tshirts;
	
	@FindBy(xpath="//img[@itemprop='image']")
	private WebElement image;
	
	@FindBy(id="color_14")
	private WebElement color;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement cart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement checkout;
	
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement proceed;

	public Home_Page(WebDriver abc) {
	
		this.driver = abc;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getTshirts() {
		return tshirts;
	}

	public WebElement getImage() {
		return image;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getProceed() {
		return proceed;
	}
}

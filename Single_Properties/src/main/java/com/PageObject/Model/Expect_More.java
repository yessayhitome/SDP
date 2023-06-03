package com.PageObject.Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Expect_More {
	
	public WebDriver driver;
  
	@FindBy(xpath = "//nav[@id='headerPrimary']/child::a[@aria-label='Account, sign in']/descendant::span[text()='Sign in']")
    private WebElement sign_Button;
	
	@FindBy(xpath = "//nav[@id='headerPrimary']/descendant::a[text()='Categories']")
	private WebElement categories;
	
	@FindBy(xpath = "//nav[@id='headerPrimary']/descendant::a[text()='Deals']")
	private WebElement deals;
	
	@FindBy(xpath = "//nav[@id='headerPrimary']/descendant::a[text()='What’s New']")
	private WebElement whatsnew;
	
	@FindBy(xpath = "//nav[@id='headerPrimary']/descendant::a[text()='Pickup & Delivery']")
	private WebElement pickup;
	
	@FindBy(xpath = "//nav[@id='headerPrimary']/descendant::input[@id='search']")
	private WebElement search;
	
	@FindBy(xpath = "//nav[@id='headerPrimary']/descendant::button[@aria-label='search']")
	private WebElement search_Button;
	
	@FindBy(xpath = "//nav[@id='headerPrimary']/descendant::span[text()='cart  0 items']")
	private WebElement cart_Button;
	
	@FindBy(xpath = "//div[@id='@web/component-header']/descendant::a[@id='utilityNav-findStores']")
	private WebElement find_Store;
	
	@FindBy(xpath = "//div[@id='@web/component-header']/descendant::a[@id='utilityNav-circle']")
	private WebElement target_Circle;
	
	@FindBy(xpath = "//div[@id='@web/component-header']/descendant::a[@id='utilityNav-redCardLI']")
	private WebElement red_Card;
	
	@FindBy(xpath = "//div[@id='@web/component-header']/descendant::a[@id='utilityNav-weeklyAd']")
	private WebElement weeky_Ad;
	
	@FindBy(xpath = "//div[@id='@web/component-header']/descendant::a[@id='utilityNav-registries']")
	private WebElement registries;
	
	@FindBy(xpath = "//div[@id='@web/component-header']/descendant::span[text()='Select your store']")
	private WebElement select_Store;
	
	@FindBy(xpath = "//div[@class='styles__Container-sc-spydln-0 hKxMSJ']/descendant::input[@id='email-address']")
	private WebElement email;
	
	@FindBy(xpath = "//div[@class='styles__Container-sc-spydln-0 hKxMSJ']/descendant::button[@id='submit-button']")
	private WebElement sign_Up;
	
	@FindBy(xpath = "//div[@id='footer']/descendant::span[text()='About Target']")
	private WebElement about_Target;
	
	@FindBy(xpath = "//div[@id='footer']/descendant::span[text()='Careers']")
	private WebElement carrers;
	
	@FindBy(xpath = "//div[@id='footer']/descendant::span[text()='Returns']")
	private WebElement returns;
	
	@FindBy(xpath = "//div[@id='footer']/descendant::span[text()='Contact Us']")
	private WebElement contact_Us;
	
	@FindBy(xpath = "//div[@id='footer']/descendant::span[text()='Clinic']")
	private WebElement clinic;
	
	@FindBy(xpath = "//div[@id='footer']/descendant::span[text()='Order Pickup']")
	private WebElement order_Pickup;
	
	@FindBy(xpath = "//div[@id='footer']/descendant::span[text()='Shipping & Delivery']")
	private WebElement shipping_Delivery;

	public Expect_More(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getSign_Button() {
		return sign_Button;
	}

	public WebElement getCategories() {
		return categories;
	}

	public WebElement getDeals() {
		return deals;
	}

	public WebElement getWhatsnew() {
		return whatsnew;
	}

	public WebElement getPickup() {
		return pickup;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSearch_Button() {
		return search_Button;
	}

	public WebElement getCart_Button() {
		return cart_Button;
	}

	public WebElement getFind_Store() {
		return find_Store;
	}

	public WebElement getTarget_Circle() {
		return target_Circle;
	}

	public WebElement getRed_Card() {
		return red_Card;
	}

	public WebElement getWeeky_Ad() {
		return weeky_Ad;
	}

	public WebElement getRegistries() {
		return registries;
	}

	public WebElement getSelect_Store() {
		return select_Store;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSign_Up() {
		return sign_Up;
	}

	public WebElement getAbout_Target() {
		return about_Target;
	}

	public WebElement getCarrers() {
		return carrers;
	}

	public WebElement getReturns() {
		return returns;
	}

	public WebElement getContact_Us() {
		return contact_Us;
	}

	public WebElement getClinic() {
		return clinic;
	}

	public WebElement getOrder_Pickup() {
		return order_Pickup;
	}

	public WebElement getShipping_Delivery() {
		return shipping_Delivery;
	}
	
	
	

}

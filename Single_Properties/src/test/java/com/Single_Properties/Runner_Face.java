package com.Single_Properties;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Runner_Face {
	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(File_Reader.get_Instance_FR().get_Instance_TR().get_Url());
		
		WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
		mail.sendKeys(File_Reader.get_Instance_FR().get_Instance_TR().get_Email());
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='pass']"));
		pwd.sendKeys(File_Reader.get_Instance_FR().get_Instance_TR().get_Password());
		
		WebElement log = driver.findElement(By.xpath("//button[@name='login']"));
		log.click();
		System.out.println("change from selfish");
		
	}
	
	

}

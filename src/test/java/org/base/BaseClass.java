package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void launch() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		

	}
	public static void loadurl(String url) {
		driver.get(url);

	}
	public static void fill(WebElement ele , String values) {
		ele.sendKeys(values);
		

		
	}
	public static void buttonclick(WebElement ele) {
		ele.click();
	}
	
	public static void closebrowser() {
		driver.close();
	}
	

}

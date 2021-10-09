package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	public static void main(String[] args) {
		System.out.println ("Hi");
		System.out.println ("Hii");
		System.out.println ("Hiii");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	}

}

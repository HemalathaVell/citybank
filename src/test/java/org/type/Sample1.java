package org.type;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://citizensbank.com/homepage.aspx");
		WebElement login = driver.findElement(By.xpath("@class='dcom-c-btn dcom-c-btn--small cbensightenevent dcom-c-btn--inactive'])[1]]"));
		login.click();
//		WebElement text = driver.findElement(By.id("dcom-desktop_search-query"));
//		text.sendKeys("credit card");
		
	}

}

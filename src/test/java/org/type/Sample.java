package org.type;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
//		WebElement user = driver.findElement(By.xpath("(//input[@class='_aa4b _add6 _ac4d _ap35'])[1]"));
//		user.sendKeys("Hemavel");
//		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
//		pass.sendKeys("Yuvi@1705");
//		WebElement login = driver.findElement(By.xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']"));
//		login.click();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		FileUtils.copyFile(source,new File ("C:\\Users\\hemav\\OneDrive\\Desktop\\screenshot\\instpage.png"));
		
	}
}

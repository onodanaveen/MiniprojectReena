package com.project1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\91952\\eclipse-workspace\\MiniProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.contains("Facebook") && currentUrl.contains("facebook")) {
			WebElement username = driver.findElement(By.id("email"));
			username.sendKeys("naveen.greens25@gmail.com");
			
			WebElement password = driver.findElement(By.id("pass"));
			password.sendKeys("Dua lipa");
			
			WebElement login = driver.findElement(By.name("login"));
			login.click();
			
			Thread.sleep(5000);
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\91952\\eclipse-workspace\\MiniProject\\Screenshot\\1.png");
			FileUtils.copyFile(source, destination);
			
		//	WebDriverWait wait = new WebDriverWait(driver, 10);
		//	wait.until(ExpectedConditions.)
						
		}
		driver.navigate().back();
		
		WebElement button = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		button.click();
		
		WebElement Heading = driver.findElement(By.xpath("//div[text()='Sign Up']"));
		String headText = Heading.getText();
		System.out.println(headText);
		
		WebElement button1 = driver.findElement(By.xpath("//button[@name='websubmit']"));
		String buttontext = button1.getText();
		System.out.println(buttontext);
		
		if (headText.equalsIgnoreCase(buttontext)) {
			
			WebElement firstname = driver.findElement(By.name("firstname"));
			firstname.sendKeys("naveen");
			
			WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
			lastname.sendKeys("L");
			
			WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
			year.click();
			
			Select s = new Select(year);
			s.selectByValue("1998");
			
			WebElement radio = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
			radio.click();
			
	//		String signuptitle = driver.getTitle();
	//		System.out.println(signuptitle);
			
	//		String signupurl = driver.getCurrentUrl();
	//		System.out.println(signupurl);
			
			WebElement button2 = driver.findElement(By.xpath("//button[@name='websubmit']"));
			button2.click();
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\91952\\eclipse-workspace\\MiniProject\\Screenshot\\2.png");
			FileUtils.copyFile(source, destination);
			
		}
		
		WebElement tabclose = driver.findElement(By.xpath("//img[@class='_8idr img']"));
		tabclose.click();
		
	//	String currentUrl2 = driver.getCurrentUrl();
		String title2 = driver.getTitle();
		if (title2.equalsIgnoreCase(title)) {
			
			driver.close();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

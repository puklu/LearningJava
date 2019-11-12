package LabExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2ex1 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\VivekPunia\\Documents\\Selenium\\chromedriver.exe");
			
		
		driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com");
		
		String title = driver.getTitle();

		driver.findElement(By.linkText("Register")).click();
		
		String regTitle = driver.getTitle();
		
//		System.out.println(title + ", "+ regTitle);
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Batman");
		driver.findElement(By.id("LastName")).sendKeys("Wayne");
		driver.findElement(By.id("Email")).sendKeys("bat4@abc.com");
		driver.findElement(By.id("Password")).sendKeys("abc123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("abc123");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.linkText("Log out")).click();
		
		

	}

}

package LabExercises;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Day3ex4 {

	static WebDriver driver;

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\VivekPunia\\Documents\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 Actions action = new Actions(driver);
		 
		 driver.get("http://demo.guru99.com/test/delete_customer.php");
		 
		 driver.findElement(By.name("cusid")).sendKeys("123");
		 
		 driver.findElement(By.name("submit")).click();
		 
		 driver.switchTo().alert().accept();
		 driver.switchTo().alert().accept();
	

	}

}

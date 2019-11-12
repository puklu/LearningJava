package LabExercises;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


@SuppressWarnings("unused")
public class Day3ex3 {

	static WebDriver driver;

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\VivekPunia\\Documents\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 Actions action = new Actions(driver);
		 
		 driver.get("http://demowebshop.tricentis.com/");
		 
		 WebElement we = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Computers')]"));
		 
		 action.moveToElement(we).perform();
		 
		 driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[3]/a[1]")).click();
		 
//		 action.moveToElement(we1).perform().click();
		 
		 
		 

	}

}

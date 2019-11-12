package LabExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2ex2 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\VivekPunia\\Documents\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get("http://examples.codecharge.com/Store/Default.php");
		 
		 Thread.sleep(2000);
		 
		 Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='category_id']")));
		 
		 dropdown.selectByVisibleText("Databases");
		 
		 driver.findElement(By.name("DoSearch")).click();

	}

}

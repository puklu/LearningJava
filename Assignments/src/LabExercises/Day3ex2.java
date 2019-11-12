package LabExercises;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Day3ex2 {

	static WebDriver driver;

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\VivekPunia\\Documents\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		 
		 WebElement username = driver.findElement(By.name("user_login"));
		 
	     username.sendKeys("admin");
	     
	     username.sendKeys(Keys.CONTROL+Keys.chord("a")+ Keys.CONTROL+Keys.chord("c"));
//	     username.sendKeys(Keys.CONTROL+"c");
	     driver.findElement(By.name("user_password")).sendKeys(Keys.CONTROL+"v");
	     
	}

}

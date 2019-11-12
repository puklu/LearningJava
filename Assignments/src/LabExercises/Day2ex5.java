package LabExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Day2ex5 {

	static WebDriver driver;

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\VivekPunia\\Documents\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		 
		 driver.findElement(By.name("user_login")).sendKeys("Bat69");
		 driver.findElement(By.name("user_password")).sendKeys("abc123");
		 driver.findElement(By.name("first_name")).sendKeys("Batman");
		 driver.findElement(By.name("last_name")).sendKeys("Wayne");
		 driver.findElement(By.name("email")).sendKeys("bat69@abc.com");
		
		 
		 Select s1 = new Select(driver.findElement(By.xpath("//select[@name='state_id']")));
		 s1.selectByIndex(5);
		 Select s2 = new Select(driver.findElement(By.xpath("//select[@name='country_id']")));
		 s2.selectByIndex(6);
		 Select s3 = new Select(driver.findElement(By.xpath("//select[@name='gender_id']")));
		 s3.selectByIndex(1);
		 
		 driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[21]/td[1]/input[1]")).click();
		 
		 driver.quit();
		 
		 
		 
	}

}

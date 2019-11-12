package LabExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2ex4 {


		static WebDriver driver;

		public static void main(String[] args) {

			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\VivekPunia\\Documents\\Selenium\\chromedriver.exe");
			 driver = new ChromeDriver();
			 
			 driver.get("http://examples.codecharge.com/Store/Default.php");
		
			 Select combo = new Select(driver.findElement(By.xpath("/html[1]/body[1]/table[5]/tbody[1]/tr[1]/td[1]/form[1]/table[2]/tbody[1]/tr[1]/td[1]/select[1]")));

			 combo.selectByVisibleText("Databases");
			 
			 driver.findElement(By.name("DoSearch")).click();
			 
			 driver.findElement(By.linkText("Web Database Development")).click();
			 
			 String quant = driver.findElement(By.name("quantity")).getAttribute("value");
			 
			 System.out.println(quant);
			 
			 driver.findElement(By.xpath("//input[@name='Insert1']")).click();
			 
			 System.out.println("is selected:  "+driver.findElement(By.xpath("//input[@name='Delete1_1']")).isSelected());
			 
			 driver.quit();
			 
	}

}

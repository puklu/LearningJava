package LabExercises;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2ex3 {
	
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VivekPunia\\Documents\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get("http://examples.codecharge.com/Store/Default.php");
		 
		 Select combobox = new Select(driver.findElement(By.xpath("/html[1]/body[1]/table[5]/tbody[1]/tr[1]/td[1]/form[1]/table[2]/tbody[1]/tr[1]/td[1]/select[1]")));
		 
		 List<WebElement> li = combobox.getOptions();
		 
		 System.out.println((li.size()));
		 
	}

}

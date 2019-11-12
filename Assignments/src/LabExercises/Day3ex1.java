package LabExercises;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3ex1 {

	static WebDriver driver;

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\VivekPunia\\Documents\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get("https://html.com/tables/#Table_Code_Sample_Simple_Table");
		 
		 WebElement myTable = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[3]/article[1]/div[1]/div[3]/table[1]"));
		 
		 List<WebElement> li =  myTable.findElements(By.tagName("tr"));
		 
		 System.out.println(li.size());
	
	}

}

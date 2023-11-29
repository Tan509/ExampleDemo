package www.practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\TMARNE\\\\Eclipse\\\\Chrome\\\\Chrome114\\\\ChromeDriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\TMARNE\\\\Eclipse\\\\Chrome\\\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		String URL = driver.getCurrentUrl();
		
		System.out.println(URL);
		
		 driver.findElement(By.id("firstName")).sendKeys("Kiyansh");
		
		String LastName =  driver.findElement(By.id("lastName")).getText();
		
		
	    
	
		System.out.println("Last Name: " + LastName);
		
	    driver.findElement(By.id("lastName")).sendKeys("Sharma");
		
	   // driver.findElement(By.className("mr-sm-2 form-control")).sendKeys("abc@gmail.com");
	    
	    driver.quit();
	    
		
		

	}

}

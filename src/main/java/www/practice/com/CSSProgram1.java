package www.practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CSSProgram1 {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\TMARNE\\\\Eclipse\\\\Chrome\\\\Chrome114\\\\ChromeDriver.exe");
		
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\TMARNE\\ChromeDriver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//By id
		
		//driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");
		
		//driver.findElement(By.cssSelector("input#pass")).sendKeys("12345");
		
		//By class name
		
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("abc@gmail.com");
		
		//By Attribute
		
		//driver.findElement(By.cssSelector("[name=pass]")).sendKeys("1234");
		
		//driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("1234");
		
		//By tag, class attribute
		
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("abc@gmail.com");
		
		
	}

}

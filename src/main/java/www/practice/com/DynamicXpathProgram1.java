package www.practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicXpathProgram1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver","C:\\Users\\TMARNE\\ChromeDriver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.facebook.com/");

		/* //Relative Xpath

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");

		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456");

		driver.findElement(By.xpath("//input[@name='email']")).clear();

		driver.findElement(By.xpath("//input[@name='pass']")).clear();

		//or xpath

		driver.findElement(By.xpath("//input[@name='email' or @data-testid='royal_email']")).sendKeys("abc@gmail.com");

		driver.findElement(By.xpath("//input[@name='pass' or @data-testid='royal_pass']")).sendKeys("123456");

	    driver.findElement(By.xpath("//input[@name='email']")).clear();

		driver.findElement(By.xpath("//input[@name='pass']")).clear();


		//and

		driver.findElement(By.xpath("//input[@name='email' and @data-testid='royal_email']")).sendKeys("abc@gmail.com");

		driver.findElement(By.xpath("//input[@name='pass' and @data-testid='royal_pass']")).sendKeys("123456");

	    driver.findElement(By.xpath("//input[@name='email']")).clear();

		driver.findElement(By.xpath("//input[@name='pass']")).clear(); 


		//contains

		/* In conatins you can use any characters from that attribute like first or last or middle 
		 * 
		 * but in starts-with you need to use starting character only*/

		/*

		driver.findElement(By.xpath("//input[contains(@name,'ema')]")).sendKeys("abc@gmail.com");

		driver.findElement(By.xpath("//input[contains(@name,'ss')]")).sendKeys("12345");

		driver.findElement(By.xpath("//input[@name='email']")).clear();

		driver.findElement(By.xpath("//input[@name='pass']")).clear();

		 */

		// starts-with

		driver.findElement(By.xpath("//input[starts-with(@name,'ema')]")).sendKeys("abc@gmail.com");

		driver.findElement(By.xpath("//input[starts-with(@name,'pa')]")).sendKeys("12345");

		driver.findElement(By.xpath("//input[@name='email']")).clear();

		driver.findElement(By.xpath("//input[@name='pass']")).clear();

		// text()]]]

		WebElement visible = driver.findElement(By.xpath("//img[text()='facebook']"));
		
		System.out.println(visible);
		
		driver.quit();

	}

}

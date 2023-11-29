package www.practice.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReadConfig1 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = null;
				
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\TMARNE\\WorkSpace1\\May2023Working\\config.propertites");
		
		prop.load(fis);
		
		String title = prop.getProperty("browser");
		
		if(title.contains("chrome"))
		{
			
			driver.get(prop.getProperty("url"));
		}
		
		else
		{
			System.out.println("Please choose correct browser");
		}
		
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("password"));
		
		driver.findElement(By.id("btnLogin")).click();
		

	}

}

package www.practice2.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadConfigPropertitesFile4 {




	public static void main(String[] args) throws IOException {

		WebDriver driver = null;

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream("C:\\Users\\TMARNE\\WorkSpace1\\May2023Working\\config.propertites");

		prop.load(fis);

		String browserName = prop.getProperty("browser");

		System.out.println(browserName);

		if(browserName.contains("chrome"))
		{


			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\TMARNE\\\\Eclipse\\\\Chrome\\\\Chrome114\\\\ChromeDriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		}

		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

}

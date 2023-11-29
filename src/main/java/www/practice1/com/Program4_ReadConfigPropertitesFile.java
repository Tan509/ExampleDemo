package www.practice1.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4_ReadConfigPropertitesFile {

	public static void main(String[] args) throws IOException {

		WebDriver driver = null;

		
		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream(
				"C:\\\\Users\\\\TMARNE\\\\WorkSpace1\\\\May2023Working\\\\config.propertites");

		prop.load(ip);

		String browserName = prop.getProperty("browser");

		
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\TMARNE\\\\Eclipse\\\\Chrome\\\\ChromeDriver.exe");

			driver = new ChromeDriver();
		}
		
		
		
		driver.get(prop.getProperty("url"));
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		
		
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		

	}

}

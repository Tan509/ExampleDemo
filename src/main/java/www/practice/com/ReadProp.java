package www.practice.com;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProp {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = null;
		
		Properties prop = new Properties();
		
		//FileInputStream ip = new FileInputStream("\\May2023Working\\config.propertites");
		
		FileInputStream ip = new FileInputStream("C:\\Users\\TMARNE\\WorkSpace1\\May2023Working\\config.propertites");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("browser"));
		
		String browsername = prop.getProperty("browser");
		
		System.out.println(browsername);
		
		if(browsername.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\TMARNE\\\\Eclipse\\\\Chrome\\\\ChromeDriver.exe");
			
			driver = new ChromeDriver();
		}
		
		else if(browsername.equals("FF"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		
		//driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
		
		//driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}
	
	

}

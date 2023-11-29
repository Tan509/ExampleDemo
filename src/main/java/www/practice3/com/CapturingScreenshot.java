package www.practice3.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingScreenshot {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\TMARNE\\\\Eclipse\\\\Chrome\\\\Chrome114\\\\ChromeDriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.javatpoint.com/method-overloading-vs-method-overriding-in-java");
		
		takeScreenshot("JavaTpoint");
		
		driver.quit();
		
		}
	
	public static void takeScreenshot(String filename) throws IOException
	{
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file,new File("C:\\\\Users\\\\TMARNE\\\\WorkSpace1\\\\May2023Working\\\\src\\\\main\\\\java\\\\Screenshots\\\\"+filename+".jpg"));
	}

}







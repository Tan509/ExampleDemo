package www.practice.com;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\TMARNE\\\\Eclipse\\\\Chrome\\\\Chrome114\\\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		
		
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Thread.sleep(3);
		
		String MainWindow = driver.getWindowHandle();
		
		System.out.println("MainWindow: "+ MainWindow);
		
		
		
		Set<String> s1 = driver.getWindowHandles();
		
		Iterator<String> i1 = s1.iterator();
		
		System.out.println("i1: "+ i1);
		
		Thread.sleep(3);
		
		while(i1.hasNext())
		{
			String childWindow = i1.next();
			
			if(!MainWindow.equalsIgnoreCase(childWindow))
			{
				driver.switchTo().window(childWindow);
				
				driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
				
				driver.findElement(By.name("btnLogin")).click();
				
				driver.close();
				
			}
			
		}
		
		driver.switchTo().window(MainWindow);

	}

}

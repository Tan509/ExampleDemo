package www.practice1.com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\TMARNE\\\\Eclipse\\\\Chrome\\\\Chrome114\\\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		String MainWindow = driver.getWindowHandle();
		
		Set<String> s1 = driver.getWindowHandles();
		
		Iterator i1 = s1.iterator();
		
		while(i1.hasNext())
		{
			String Childwindow = (String) i1.next();
			
			if(!MainWindow.equalsIgnoreCase(Childwindow))
			{
				
				driver.switchTo().window(Childwindow);
				
				driver.findElement(By.name("emailid")).sendKeys("abc@gamil.com");
				
				driver.findElement(By.name("btnLogin")).click();
				
				Thread.sleep(5);
				
				driver.close();
				
				
			}
			
			driver.switchTo().window(MainWindow);
			
		}
		
		
		

	}

}

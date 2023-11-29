package www.practice1.com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\TMARNE\\\\Eclipse\\\\Chrome\\\\Chrome114\\\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/popup.php");
		
		driver.findElement(By.linkText("Click Here")).click();
		
		String MainWindow = driver.getWindowHandle();
		
		Set<String> s1 = driver.getWindowHandles();
		
		Iterator i1 = s1.iterator();
		
	
		  while(i1.hasNext()) {
			  
			  String childWindow =(String) i1.next();
		  
		  if(!MainWindow.equalsIgnoreCase(childWindow))
		  
		  { driver.switchTo().window(childWindow);
		  
		  driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
		  
		  driver.findElement(By.name("btnLogin")).click();
		  //driver.close();
		  System.out.println("True");
		
		 }
		 
		}
		 
		
		/*
		 * while(i1.hasNext()) { String childWindow = (String) i1.next();
		 * 
		 * if(!MainWindow.equalsIgnoreCase(childWindow)) {
		 * driver.switchTo().window(childWindow);
		 * 
		 * driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
		 * 
		 * driver.findElement(By.name("btnLogin")).click();
		 * 
		 * driver.close();
		 * 
		 * }
		 * 
		 * }
		 */

	}

}

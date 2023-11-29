package www.practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\TMARNE\\\\Eclipse\\\\Chrome\\\\ChromeDriver.exe");
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\TMARNE\\\\Eclipse\\\\Chrome\\\\Chrome114\\\\ChromeDriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://crm.unipartsgroup.com/Login.aspx");
		
		driver.findElement(By.id("btnLogin")).click();
		
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		
		String msg = alert.getText();
		
		System.out.println("Alert msg:"+ msg);
		
		if(msg.contains("Please enter User Namee."))
		{
			alert.accept();
		}
		else
		{
			System.out.println("wrong choice");
			
			alert.dismiss();
		}
		
		
		
		
		

	}

}

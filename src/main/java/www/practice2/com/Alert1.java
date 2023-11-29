package www.practice2.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\TMARNE\\\\Eclipse\\\\Chrome\\\\Chrome114\\\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://crm.unipartsgroup.com/Login.aspx");
		
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.name("btnLogin")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String msg = alert.getText();
		
		System.out.println(msg);
		
		if(msg.contains("Please enter User Name."))
		{
			alert.accept();
		}
		else
		{
			System.out.println("Select proper option");
		}
		driver.quit();
		
		
	}

}

package www.practice1.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2_Alert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\TMARNE\\\\\\\\Eclipse\\\\\\\\Chrome\\\\\\\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://crm.unipartsgroup.com/Login.aspx");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		Thread.sleep(5);
		
		driver.findElement(By.name("btnLogin")).click();
		
		Thread.sleep(5);
		
		Alert alert = driver.switchTo().alert();
		
		String alertMsg = alert.getText();
		
		System.out.println("Msg: "+alertMsg);
		
		if(alertMsg.contains("Please enter User Name."))
		{
			alert.accept();
		}
		else
		{
			System.out.println("Wrong alert");
			alert.dismiss();
			
		}
		
		driver.close();
		

	}

}

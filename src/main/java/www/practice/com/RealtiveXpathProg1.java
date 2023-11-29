package www.practice.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RealtiveXpathProg1 {

	public static void main(String[] args) {
	
System.setProperty("webdriver.edge.driver","C:\\Users\\TMARNE\\ChromeDriver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//driver.findElement(By.name("username")).sendKeys("Admin");
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	}

}

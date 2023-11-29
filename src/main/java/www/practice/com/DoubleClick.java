package www.practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DoubleClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\TMARNE\\\\Eclipse\\\\Chrome\\\\ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://api.jquery.com/dblclick/");
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		WebElement element = driver.findElement(By.id("/html/body/span"));
		
		Actions action = new Actions(driver);
		
		action.doubleClick(element).build().perform();

	}

}

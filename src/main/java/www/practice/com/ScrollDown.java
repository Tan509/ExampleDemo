package www.practice.com;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\TMARNE\\\\Eclipse\\\\Chrome\\\\ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://api.jquery.com/dblclick/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

}

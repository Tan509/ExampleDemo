import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testprog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\TMARNE\\ChromeDriver\\New folder\\ChromeDriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TMARNE\\Eclipse\\Chrome\\ChromeDriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://talent.capgemini.com/in");

	}

}

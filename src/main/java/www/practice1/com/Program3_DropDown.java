package www.practice1.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program3_DropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TMARNE\\Eclipse\\Chrome\\ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/register.php");

		WebElement element = driver.findElement(By.name("country"));
		
		getDropDwonvalue(element, "INDIA");
		
		//driver.quit();

	}

	public static void getDropDwonvalue(WebElement element, String value) {
		Select select = new Select(element);

		List<WebElement> countryList = select.getOptions();
		
		System.out.println(countryList.size());
		
		for(int i=0; i<countryList.size();i++)
		{
			
			String countryNames = countryList.get(i).getText();
			
			System.out.println(countryNames);
			
			if(countryNames.equals(value))
			{
				countryList.get(i).click();
				break;
				
			}
		}

	}

}

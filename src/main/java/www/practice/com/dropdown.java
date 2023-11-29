package www.practice.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\TMARNE\\\\Eclipse\\\\Chrome\\\\Chrome114\\\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		WebElement country = driver.findElement(By.name("country"));
		
		/*
		 * Select select = new Select(country);
		 * 
		 * select.selectByIndex(3);
		 */
		
		getDropDownValue(country,"INDIA");
		
		//driver.close();
		
	}
		public static void getDropDownValue(WebElement element, String value)
		{
			Select select = new Select(element);
			
			List<WebElement> countryList = select.getOptions();
			
			System.out.println("Size: "+countryList.size());
			
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

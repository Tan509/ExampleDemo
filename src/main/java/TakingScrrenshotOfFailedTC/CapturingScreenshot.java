package TakingScrrenshotOfFailedTC;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomizedListener.class)
public class CapturingScreenshot extends Base {
	
	@BeforeMethod
	public void start()
	{
		initalization();
	}
	
	@Test
	public void Test1()
	{
		assertEquals(false, true);
	}
	
	@Test
	public void Test2()
	{
		assertEquals(false, true);
	}
	
	@Test
	public void Test3()
	{
		assertEquals(false, true);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}

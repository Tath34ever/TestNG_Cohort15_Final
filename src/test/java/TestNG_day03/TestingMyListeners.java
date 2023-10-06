package TestNG_day03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(ListenersTestNG.class)
public class TestingMyListeners {

	public WebDriver driver;
	
	@Test
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();    // success test
		driver = new ChromeDriver();
		driver.get("https://www.techcircle.dev");
		
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(false);   //failed test
		
	}
	
	
}

package LoneWolfTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1ModuleDirectory_SearchValidNameInvalidJobTittle {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod
	public void logInToHRM1() {

//	System.out.println("TESTING");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	}

	@Test
	public void Test1() {

		driver.findElement(By.xpath("(//input[@name='username']")).sendKeys("Admin");
		
		
//		clickUsername.sendKeys("Admin");
		

	}

	@AfterMethod
	public void tearDown() {

	}

}

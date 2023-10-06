package TestNG_day03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiBrowser {

	
public WebDriver driver;
    

    @Parameters("browser")
    @BeforeClass
    public void setUp(String browser) {
        
            if(browser.equalsIgnoreCase("chrome")) {
                
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                
                driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
                
            }else if (browser.equalsIgnoreCase("edge")) {
                
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }
        
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
    }
    
    
    @Test
    public void searchItem() {
        
            WebElement searchBar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
            searchBar.sendKeys("90 degrees elbow");
    
            WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
            searchButton.click();
            
            WebElement resultText = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]"));
            
            
            Assert.assertTrue(resultText.isDisplayed(), "Result isn't displayed");
            
            
        
            
    }
    
    
    @AfterClass
    public void afterTest() {
        // driver.quit();
    }
}
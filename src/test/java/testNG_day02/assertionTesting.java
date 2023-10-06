package testNG_day02;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertionTesting {

	@Test
	
	public void test1() {
		
		Reporter.log("Veridying the title of the page");
		
		String expectedTitle = "Hello World";
		String originalTitle = "Hello World";
		
		
		Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
	}
	
	
	
	
	
	
	
	
	
	
}

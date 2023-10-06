package TestNG_day03;

import org.junit.Assert;
import org.testng.annotations.Test;

public class flakyTests {

	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test1() {
		Assert.assertEquals(false, true);	
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, true);
	}
	
	
	
	
	
	
	
}
